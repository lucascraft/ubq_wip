/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2015, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.thingm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ui.colors.UbiColorWheel;
import net.sf.smbt.ui.colors.UbiWheelColorPickedListener;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.dialogs.UbiColorPickerDialog;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.progress.UIJob;

public class ThingM48StepSequencer extends Composite {
	
	class SequencerJob extends UIJob {
		public SequencerJob() {
			super("ThingM 48 Steps Sequencer");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			long tick = loopDuration/(long)getSeqSize();
			if (Platform.inDebugMode()) {
				System.out.println("Add " + tick + " ms increment");
			}
			int size = getSeqSize();
			if (currentIndex >= size-1) {
				currentIndex = 0;
			} else {
				currentIndex++;
			}
			selection.clear();
			for (Integer l: values.keySet()) {
				tick(l, currentIndex);
				Canvas box = widgets.get((l*48)+currentIndex);
				selection.add(box);
			}
			refresh();
			schedule(tick);
			return Status.OK_STATUS;
		}
	}
	List<IThingMTick> listeners;
	
	private Job sequencerJob;
	private long loopDuration;
	private int currentIndex;
	private int selectedLine;
	private Canvas lastSelection;
	private List<Canvas> selection = new ArrayList<Canvas>();
	private List<Canvas> widgets = new ArrayList<Canvas>();
	private Map<org.eclipse.swt.widgets.Button, String> addressMap = new HashMap<org.eclipse.swt.widgets.Button, String>();
	private Map<Integer, Map<Integer, RGB>> values = new HashMap<Integer, Map<Integer, RGB>>();
	private Map<Integer, Map<RGB, Color>> colors = new HashMap<Integer, Map<RGB, Color>>();
	public  Map<Integer, Map<Integer, RGB>> getValues() {
		return values;
	}
	public void addThingMTickListener(IThingMTick listener) {
		listeners.add(listener);
	}
	public void removeThingMTickListener(IThingMTick listener) {
		listeners.remove(listener);
	}
	public List<IThingMTick> getListeners() {
		return listeners;
	}
	private void updateSelection(Canvas widget) {
		if (selection.contains(widget)) {
			selection.remove(widget);
		} else {
			selection.add(widget);
		}
		lastSelection = widget;
		for (Integer l : values.keySet()) {
			if (values.containsKey(l)) {
				Object o = widget.getData("line");
				if (o instanceof Integer && ((Integer)o).equals(l)) {
					selectedLine = l;
					break;
				}
			}
		}

	}
	public Color getColor(int line, RGB rgb) {
		Integer l = new Integer(line);
		if (!colors.containsKey(l)) {
			colors.put(l, new HashMap<RGB, Color>());
		}
		if (colors.get(l).containsKey(rgb)) {
			return colors.get(l).get(rgb);
		}
		return colors.get(l).put(rgb, new Color(Display.getDefault(), rgb));
	}
	
	//private int cursor;
	@SuppressWarnings("unused")
	private Cursor handCursor, normalCursor;
	//private boolean mouseDown, mouseUp;
	public ThingM48StepSequencer(Composite parent, int style) {
		super(parent, style);
		handCursor 		= new Cursor(Display.getDefault(), SWT.CURSOR_HAND);
		normalCursor 	= new Cursor(Display.getDefault(), SWT.CURSOR_ARROW);
		
		loopDuration = 3000;
		listeners = new ArrayList<IThingMTick>();
		setLayout(
			GridLayoutFactory.fillDefaults().create()
		);
		setLayoutData(
			GridDataFactory.fillDefaults().
				hint(SWT.DEFAULT, 100).minSize(SWT.DEFAULT, 100).
					grab(true, false).create()
		);
		
		
		for (int l=0;l<10;l++) {
			Integer idLine = new Integer(l);
			values.put(idLine, new HashMap<Integer, RGB>());
			for (int i = 0; i<48; i++) {
				values.get(idLine).put(
					new Integer(i), 
					ColorConstants.black.getRGB()
				);
			}
		}
		createContent(this);
		sequencerJob = new SequencerJob();
	}
	public void setDuration(long duration) {
		loopDuration = duration;
	}
	
	public synchronized void tick(int line, int index) {
		for (IThingMTick tickListener : listeners) {
			RGB rgb = values.get(new Integer(line)).get(new Integer(index));
			tickListener.tick(line, index, rgb);
			if (Platform.inDebugMode()) {
				System.out.println(
					"tick " + index + " : " + rgb.toString()
				);
			}
		}
	}
	public void refresh() {
		for (final Canvas c : widgets) {
			c.redraw();
		}
	}
	
	public void createContent(final Composite container) {
		final ScrolledComposite sc = GUIToolkit.INSTANCE.createScrolledComposite(container);
		sc.setLayout(GridLayoutFactory.fillDefaults().create());
		sc.setLayoutData(GridDataFactory.fillDefaults().
				minSize(SWT.DEFAULT, 200).hint(SWT.DEFAULT, 200).grab(true, true).create());
		
		//
		// Panel
		//
		final Composite panel = GUIToolkit.INSTANCE.createComposite(sc);
		panel.setLayout(
			GridLayoutFactory.fillDefaults().
				numColumns(50).margins(1, 1).spacing(1, 1).
					extendedMargins(1, 1, 1, 1).
						equalWidth(false).create()
		);
		
		//
		// Ruler
		//
		/*
		Composite ruler = new Composite(sc, SWT.NONE);
		ruler.setLayout(
			GridLayoutFactory.fillDefaults().create()
		);
		ruler.setLayoutData(
			GridDataFactory.fillDefaults().
				hint(SWT.DEFAULT, 10).minSize(SWT.DEFAULT, 10).
					grab(true, false).span(48, 1).create()
		);
		ruler.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				e.gc.setForeground(ColorConstants.red);
				e.gc.setBackground(ColorConstants.red);
				e.gc.fillRectangle(cursor, 0, 10, 10);
				e.gc.drawLine(cursor, 0, cursor, getClientArea().height);
			}
		});

		ruler.addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				if (mouseDown) {
					cursor = e.x;
				}
				Rectangle r = Rectangle.SINGLETON.setBounds(cursor-6, 0, 15, 12);
				if (r.contains(e.x, e.y)) {
					setCursor(handCursor);
				} else {
					setCursor(normalCursor);
				}
				redraw();
			}
		});
		ruler.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				mouseDown = false;
				redraw();
			}
			@Override
			public void mouseDown(MouseEvent e) {
				mouseDown = true;
				redraw();
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				redraw();
			}
		});
		ruler.addMouseTrackListener(new MouseTrackListener() {
			@Override
			public void mouseHover(MouseEvent e) {
				Rectangle r = Rectangle.SINGLETON.setBounds(cursor-6, 0, 15, 12);
				if (r.contains(e.x, e.y)) {
					setCursor(handCursor);
				} else {
					setCursor(normalCursor);
				}
			}
			@Override
			public void mouseExit(MouseEvent e) {
				
			}
			@Override
			public void mouseEnter(MouseEvent e) {
				
			}
		});
		*/

		for (Integer lineId : values.keySet()) {
			//
			// Check
			//
			org.eclipse.swt.widgets.Button check = new org.eclipse.swt.widgets.Button(panel, SWT.CHECK);
			check.setLayoutData(
					GridDataFactory.fillDefaults().span(2, 1).hint(SWT.DEFAULT, 12).minSize(SWT.DEFAULT, 12).create()
				);
			String addr = lineId==0?"0x00":"";
			
			addressMap.put(check, addr);
			
			//
			// Address button
			//
			/*
			Canvas addrButton = new Canvas(panel, SWT.PUSH);
			addrButton.setLayoutData(
				GridDataFactory.fillDefaults().hint(50, 12).minSize(50, 12).create()
			);
			*/
			for (final Integer idx : values.get(lineId).keySet()) {
				final Canvas b = new Canvas(panel, SWT.PUSH){
					@Override
					public Point getSize() {
						return new Point(15, 12);
					}
				};
				widgets.add(b);
				b.setLayoutData(
					GridDataFactory.fillDefaults().
						minSize(15, 12).hint(15, 12).
							grab(false, false).create()
				);
				b.setBackground(
					getColor(lineId, values.get(lineId).get(idx))
				);
				b.addMouseListener(new MouseListener() {
					@Override
					public void mouseUp(MouseEvent e) {
						if ((e.stateMask & SWT.CTRL) != SWT.CTRL) {
							selection.clear();
						}
						for (Integer l : values.keySet()) {
							if (values.containsKey(l)) {
								Object o = b.getData("line");
								if (o instanceof Integer && ((Integer)o).equals(l)) {
									selectedLine = l;
									break;
								}
							}
						}
						updateSelection(b);
						refresh();
					}
					@Override
					public void mouseDown(MouseEvent e) {
						for (Integer l : values.keySet()) {
							if (values.containsKey(l)) {
								Object o = b.getData("line");
								if (o instanceof Integer && ((Integer)o).equals(l)) {
									selectedLine = l;
									break;
								}
							}
						}
						refresh();
					}
					@Override
					public void mouseDoubleClick(MouseEvent e) {


						
						
						
						//final Shell shell = new Shell (container.getShell() , (SWT.NO_TRIM | SWT.APPLICATION_MODAL | SWT.TOOL) );
						//Point pt = b.toDisplay(b.getLocation());
						//handleRGBWidget(shell, container);
						
						
						
						
						UbiColorPickerDialog dlg = new UbiColorPickerDialog(Display.getDefault().getActiveShell());
						int status = dlg.open();
						if (status == Window.OK) {
							RGB rgb = (RGB) dlg.getResult()[0];
							for (Integer l : values.keySet()) {
								if (values.containsKey(l)) {
									Object o = b.getData("line");
									if (o instanceof Integer && ((Integer)o).equals(l)) {
										selectedLine = l;
										break;
									}
								}
							}
							Color color = getColor(getSelectedLine(), rgb);
							if (!selection.contains(b)) {
								selection.add(b);
							}
							for (Canvas w : selection) {
								w.setBackground(color);
								w.setForeground(color);
								Integer idx = w.getData("idx") instanceof Integer ? (Integer) w.getData("idx") : new Integer(0);
								Integer line = w.getData("line") instanceof Integer ? (Integer) w.getData("line") : new Integer(0);
								values.get(line).put(
									idx,
									rgb
								);
								w.setEnabled(true);
							}
							selection.clear();
							refresh();
						}
					}
				});
				b.setData("idx", idx);
				b.setData("line", lineId);
				b.addPaintListener(new PaintListener() {
					@Override
					public void paintControl(PaintEvent e) {
						if (b.getData("idx") instanceof Integer) {
							Integer index = (Integer)b.getData("idx");
							Integer line = b.getData("line") instanceof Integer ? (Integer) b.getData("line") : new Integer(0);

							Color fg = e.gc.getForeground();
							Color bg = e.gc.getBackground();
							if (selection.contains(b)) {
								e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
								e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
								e.gc.fillRectangle(e.x, e.y, e.width, e.height);
								if (line != null) {
									e.gc.setBackground(getColor(line, values.get(line).get(index)));
									e.gc.setForeground(getColor(line, values.get(line).get(index)));
								}
								e.gc.fillRectangle(e.x+2, e.y+2, e.width-4, e.height-4);
							} else {
								if (line != null && values.get(line) != null && values.get(line).get(index) != null) {
									e.gc.setBackground(getColor(line, values.get(line).get(index)));
									e.gc.setForeground(getColor(line, values.get(line).get(index)));
								}
								e.gc.fillRectangle(e.x, e.y, e.width, e.height);
							}
							e.gc.setForeground(fg);
							e.gc.setBackground(bg);
						}
					}
				});
			}
		}
		
		sc.setExpandVertical(true);
		sc.setExpandHorizontal(true);
		sc.setAlwaysShowScrollBars(false);
		sc.setOrientation(SWT.HORIZONTAL);
		sc.setContent(panel);
		sc.setMinSize(600, 200);
		sc.layout(true);
	}
	
	@SuppressWarnings("unused")
	private void handleRGBWidget(final Shell shell, Composite container) {
		UbiColorWheel wheel = new UbiColorWheel(shell);
		wheel.setLayout(GridLayoutFactory.fillDefaults().create());
		wheel.setLayoutData(GridDataFactory.fillDefaults().hint(200, 200).create());
		wheel.addMouseTrackListener(new MouseTrackListener() {
			@Override
			public void mouseHover(MouseEvent e) {}
			@Override
			public void mouseExit(MouseEvent e) {
				shell.close();
			}
			@Override
			public void mouseEnter(MouseEvent e) {}
		});
		wheel.addColorPickedListener(new UbiWheelColorPickedListener() {
			@Override
			public void rgbPicked(RGB picked, List<RGB> lastColors) {
				shell.close();
			}
		});
	}

	public int getSelectedLine() {
		return selectedLine;
	}
	public void setSelectedBoxColor(RGB rgb) {
		setSelectedBoxColor(getSelectedLine(), rgb);
	}
	public void setSelectedBoxColor(int lineId, RGB rgb) {
		if (lastSelection != null) {
			Color color = getColor(lineId, rgb);
			if (!selection.contains(lastSelection)) {
				selection.add(lastSelection);
			}
			for (Canvas w : selection) {
				w.setBackground(color);
				w.setForeground(color);
				Integer idx = w.getData("idx") instanceof Integer ? (Integer) w.getData("idx") : new Integer(0);
				values.get(lineId).put(
					idx,
					rgb
				);
				w.setEnabled(true);
			}
			selection.clear();
			refresh();
		}
	}
	public int getSeqSize() {
		return values.get(0).size();
	}
	public void play() {
		if (Platform.inDebugMode()) {
			System.out.println("Play ThingM Sequence");
		}
		currentIndex = 0;
		sequencerJob.schedule();
	}
	public void pause() {
		if (Platform.inDebugMode()) {
			System.out.println("Pause ThingM Sequence");
		}
		sequencerJob.done(Job.ASYNC_FINISH);
		sequencerJob.cancel();
	}
	public boolean isPlaying() {
		return sequencerJob.getState() == Job.RUNNING;
	}
	public long getLoopDuration() {
		return loopDuration;
	}
	public void setLoopDuration(long duration) {
		loopDuration = duration;
	}
}
