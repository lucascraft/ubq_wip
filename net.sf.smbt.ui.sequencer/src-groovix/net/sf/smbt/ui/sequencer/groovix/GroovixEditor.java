/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.sequencer.groovix;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory;
import net.sf.smbt.dmx.ezdmxctrl.provider.EzdmxctrlItemProviderAdapterFactory;
import net.sf.smbt.dmx.model.ezdmx.provider.EzdmxItemProviderAdapterFactory;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.utils.DMXUtils;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.provider.EzmojoItemProviderAdapterFactory;
import net.sf.smbt.ezsequence.CUE_TYPE;
import net.sf.smbt.ezsequence.Circle;
import net.sf.smbt.ezsequence.EmitInfo;
import net.sf.smbt.ezsequence.EventCue;
import net.sf.smbt.ezsequence.EventElem;
import net.sf.smbt.ezsequence.EventListener;
import net.sf.smbt.ezsequence.EventSynchro;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.Track;
import net.sf.smbt.ezsequence.UIElem;
import net.sf.smbt.ezsequence.provider.EzsequenceItemProviderAdapterFactory;
import net.sf.smbt.midi.ezmidi.provider.EzmidiItemProviderAdapterFactory;
import net.sf.smbt.motion.kinetic.KineticMotionUtils;
import net.sf.smbt.osc.ezmojo.utils.EZMojoTargetUtils;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.provider.OsccmdItemProviderAdapterFactory;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.sequencer.engine.GroovixUtils;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.sequencer.actions.AddCircleAction;
import net.sf.smbt.ui.sequencer.actions.AddPathAction;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.DragDetectEvent;
import org.eclipse.swt.events.DragDetectListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class GroovixEditor extends EditorPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {
	
	private Sequencer groovix;
	private Composite container;
	private Composite inside;
	private GroovixTimedLine timedLineContainer;
	private GroovixEngine engine;
	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	@SuppressWarnings("unused")
	private UIAdapterImpl uiAdapter;
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	
	private DMXLibrary dmxLib;
	
	private boolean running = false;
	private boolean drag = false;
	private Point dragStart;
	private ComposedAdapterFactory adapterFactory;
	
	public boolean isRunning() {
		return running;
	}
	public void setRunning(boolean running) {
		this.running = running;
	}
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	private final static int GRID_STEP = 25;
	
	private AddCircleAction addCircleAction;
	private AddPathAction addPathAction;
	
	private Point lastCoordinates; 
	private Point lastMouse;
	
	public Sequencer getGroove() {
		return groovix;
	}
	public GroovixEngine getEngine() {
		return engine;
	}
	@Override
	public void doSave(IProgressMonitor monitor) {
		GroovixUtils.INSTANCE.save(getEditorInput(), groovix);
	}
	@Override
	public void doSaveAs() {
		doSave(new NullProgressMonitor());
	}
	public GroovixEditor() {
		lastMouse = new Point();
		listeners = new ConcurrentLinkedQueue<ISelectionChangedListener>();
	}
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		site.setSelectionProvider(
			this
		);
		setInput(input);
		groovix = GroovixUtils.INSTANCE.load(input);
		initAdapterFactory();
		//initDMX();
		initEngine();
		initActions();
		setSelection(new StructuredSelection(groovix));
		initUIAdapter();
	}
	@SuppressWarnings("unused")
	private void initDMX() {
		dmxLib = DMXUtils.INSTANCE.initDMX();
		DMXUniverseCtrl universe = EzdmxctrlFactory.eINSTANCE.createDMXUniverseCtrl();
		groovix.setDmxUniverse(universe);
		for (FixtureDefinition fDef : dmxLib.getFixtures()) {
			DMXFixture f = EzdmxctrlFactory.eINSTANCE.createDMXFixture();
			f.setDefinition(fDef);
			groovix.getDmxUniverse().getFixtures().add(f);
		}
	}
	private void initUIAdapter() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (EzsequencePackage.Literals.TIME_CURSOR__LENGTH.equals(msg.getFeature())) {
					redraw();
				} else if (EzsequencePackage.Literals.TIME_CURSOR__LENGTH.equals(msg.getFeature())) {
					redraw();
				} else if (EzsequencePackage.Literals.TIME_CURSOR__DIRECTION.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.TIME_CURSOR__COMPLETION.equals(msg.getFeature())) {
					redraw();
				} else if (EzsequencePackage.Literals.EVENT_CUE__JUMP.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_CUE__KIND.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_LISTENER.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_TRIGGER__EMITS.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_TRIGGER__AFTER.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_TRIGGER__BEFORE.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_TRIGGER__TARGETS.equals(msg.getFeature())) {
					
				} else if (EzsequencePackage.Literals.EVENT_SYNCHRO.equals(msg.getFeature())) {
					
				} 
			}
		};
	}
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			//return new GroovixOutlinePage(this);
		} else if (adapter.equals(IPropertySheetPage.class)) {
			return new GroovixPropertySheetPage(this);
		}
		return super.getAdapter(adapter);
	}
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzsequenceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzmojoItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new OsccmdItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzdmxctrlItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzdmxItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzmidiItemProviderAdapterFactory());

		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}
	private void initActions() {
		addCircleAction	= new AddCircleAction(groovix);
		addPathAction	= new AddPathAction(groovix);
	}
	
	private void initEngine() {
		engine = new GroovixEngine(groovix);
		engine.addUpdateListener(new IGroovixUpdater() {
			@Override
			public void update(float speed, float completion, long time) {
				for (TimeBar b : groovix.getTimebar()) {
					TimeCursor cursor = b.getTimecursor();
					float percent = cursor.getCompletion();
					float incr = engine.getIncrement();
					incr *= cursor.getDirection();
					incr *= b.getDirection();
					incr *= b.getSpeed();
					percent += incr;
					cursor.setCompletion(percent);
					cursor.getLength();
				}
				for (EventElem t : getEventElements()) {
					float b = t.getBang();
					float incr = engine.getIncrement();
					if (b>0) {
						b = incr>0 ? b - incr : b + incr;
						t.setBang(b);
					}
				}
				redraw();
			}
		});
	}
	public List<TimeBar> getTracks() {
		List<TimeBar> lst = new ArrayList<TimeBar>();
		lst.addAll(groovix.getTimebar());
		return lst; 
	}
	public List< UIElem> getUIElements() {
		List<UIElem> lst = new ArrayList<UIElem>();
		lst.addAll(getEventElements());
		lst.addAll(getTracks());
		return lst;
	}
	public List<EventElem> getEventElements() {
		List<EventElem> lst = new ArrayList<EventElem>();
		lst.addAll(groovix.getTriggers());
		lst.addAll(groovix.getCues());
		lst.addAll(groovix.getListeners());
		lst.addAll(groovix.getSynchros());
		return lst; 
	}
	public AddCircleAction getAddCircleAction() {
		return addCircleAction;
	}
	public AddPathAction getAddPathAction() {
		return addPathAction;
	}
	@Override
	public boolean isDirty() {
		return false;
	}
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	public void redraw() {
		container.redraw();
	}
	public Point getSize() {
		org.eclipse.swt.graphics.Point pt = container.getSize();
		return new Point(pt.x, pt.y);
	}
	@Override
	public void createPartControl(Composite parent) {
		inside = GUIToolkit.INSTANCE.createComposite(parent);
		
		inside.setLayout(GridLayoutFactory.fillDefaults().create());
		inside.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		ScrolledComposite blackboard = new ScrolledComposite(inside, SWT.NONE);
		blackboard.setLayout(GridLayoutFactory.fillDefaults().create());
		blackboard.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	
		container = GUIToolkit.INSTANCE.createComposite(blackboard, SWT.DOUBLE_BUFFERED);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.addPaintListener(
			new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					if (groovix == null) return;
					draw(e);
				}
			}
		);
		container.addMouseMoveListener(
			new MouseMoveListener() {
				@Override
				public void mouseMove(MouseEvent e) {
					handleMouseMove(e);
					if (drag) {
						int dx = dragStart.x - e.x;
						int dy = dragStart.y - e.y;

						float factor = groovix.getZoomFactor();
						double du = GRID_STEP * (factor >= 1 ? 1-factor : -factor);
						
						//if (groovix.getSelection().isEmpty()) {
							Point ptOffset = groovix.getOffset();
							if (Math.abs(dx) > du) {
								ptOffset.x += dx > 0 ? +du : -du;
							}
							if (Math.abs(dy) > du) {
								ptOffset.y += dy > 0 ? +du : -du;
							}
							groovix.setOffset(ptOffset);
						//} else {
						//	for (UIElem elem : groovix.getSelection()) {
						//		Rectangle rect = elem.getBounds();
						//		if (Math.abs(dx) > 0.1) {
						//			rect.x -= dx > 0 ? +1 : -1;
						//		}
						//		if (Math.abs(dy) > 0.1) {
						//			rect.y -= dy > 0 ? +1 : -1;
						//		}
						//	}
						//}
						
						dragStart.x = e.x;
						dragStart.y = e.y;
						
						redraw();
					}
				}
			}
		);
		container.addDragDetectListener(
			new DragDetectListener() {
				@Override
				public void dragDetected(DragDetectEvent e) {
					drag = true;
					dragStart = new Point(e.x, e.y);
				}
			}
		);
		container.addKeyListener(
			new KeyListener() {
				@Override
				public void keyReleased(KeyEvent e) {}
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.keyCode==SWT.DEL || e.keyCode==SWT.BS) {
						boolean didDelete = false;
						for (UIElem elem : groovix.getSelection()) {
							deleteUIElem(elem);
							didDelete = true;
						}
						if (didDelete) {
							redraw();
						}	
					}
					if (e.keyCode == SWT.ARROW_DOWN || e.keyCode == SWT.ARROW_LEFT || e.keyCode == SWT.ARROW_RIGHT || e.keyCode == SWT.ARROW_UP) {
						boolean didMove = false;
						for (UIElem elem : groovix.getSelection()) {
							Rectangle rect = elem.getBounds();
							if (e.keyCode == SWT.ARROW_DOWN) 	{
								didMove = true;
								rect.y++;
							}
							if (e.keyCode == SWT.ARROW_UP) {
								didMove = true;
								rect.y--;
							}
							if (e.keyCode == SWT.ARROW_RIGHT){
								didMove = true;
								rect.x++;
							}
							if (e.keyCode == SWT.ARROW_LEFT) {
								didMove = true;
								rect.x--;
							}
						}
						if (didMove) {
							redraw();
						}
					}
				}
			}
		);
		container.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				drag = false;
			}
			@Override
			public void mouseDown(MouseEvent e) {
				drag = false;
				int stateMask	= e.stateMask;
				int button		= -1;
				if ((stateMask & SWT.CTRL) != 0) button = SWT.CTRL;
				if ((stateMask & SWT.SHIFT) != 0) button = SWT.SHIFT;
	  			if (button != SWT.CTRL && button != SWT.SHIFT) {
	  				groovix.getSelection().clear();
	  			}
				UIElem elem = getUIElem(e.x, e.y);
				if (elem != null) {
					if (elem.isSelected()) {
						elem.setSelected(false);
						groovix.getSelection().add(elem);
					} else {
						elem.setSelected(true);
						groovix.getSelection().remove(elem);
					}
					setSelection(
						new StructuredSelection(groovix.getSelection())
					);
				} else {
					for (UIElem el : getUIElements()) {
						el.setSelected(false);
					}
				}
				if (groovix.getSelection().isEmpty()) {
					setSelection(new StructuredSelection(groovix));
				}
				redraw();
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				handleDoubleClick(e);
			}
		});
		container.addMouseWheelListener(
			new MouseWheelListener() {
				@Override
				public void mouseScrolled(MouseEvent e) {
					drag = false;
					if (groovix != null) {
						float v = groovix.getZoomFactor() + e.count * 0.02f;
						
						v = v < 0.2f ? 0.2f : v;
						v = v > 10 ? 10 : v;
						
						float old = groovix.getZoomFactor();
						
						groovix.setZoomFactor(v);
						
						@SuppressWarnings("unused")
						int sign = old > v ? -1 : 1;
						
						e.count = 0;
						e.button = -1;
						/*
						double du = GRID_STEP * groovix.getZoomFactor();
						Point ptOffset	= groovix.getOffset();
						Point size		= getSize();
						Point curCenter = new Point(size.x/2, size.y/2);
						
						if (old != v && v != 10 && v != 0.2) {
							if (curCenter.x != 0) {
								ptOffset.x += sign * (curCenter.x < 0 ? +du : -du);
							}
							if (curCenter.x != 0) {
								ptOffset.y += sign * (curCenter.y < 0 ? +du : -du);
							}
						}
						
						groovix.setOffset(ptOffset);
						*/
						redraw();
					}
				}
			}
		);
		container.addMouseTrackListener(new MouseTrackListener() {
			@Override
			public void mouseHover(MouseEvent e) {
				drag = false;
			}
			@Override
			public void mouseExit(MouseEvent e) {
				drag = false;
			}
			@Override
			public void mouseEnter(MouseEvent e) {
				drag = false;
			}
		});
		container.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				engine.cancel();
				engine.done(Status.CANCEL_STATUS);
			}
		});
		
		blackboard.setContent(container);
		blackboard.setAlwaysShowScrollBars(true);
		blackboard.setExpandHorizontal(true);
		blackboard.setExpandVertical(true);
		
		timedLineContainer = new GroovixTimedLine(inside, this);
		timedLineContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(4).equalWidth(false).create());
		timedLineContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).align(SWT.CENTER, SWT.BOTTOM).hint(SWT.DEFAULT, 100).create());
	}
	private void deleteUIElem(UIElem elem) {
		if (groovix.getTriggers().contains(elem)) {
			groovix.getTriggers().remove(elem);
		}
		if (groovix.getCues().contains(elem)) {
			groovix.getCues().remove(elem);
		}
		if (groovix.getListeners().contains(elem)) {
			groovix.getListeners().remove(elem);
		}
		if (groovix.getSynchros().contains(elem)) {
			groovix.getSynchros().remove(elem);
		}
		if (groovix.getTimebar().contains(elem)) {
			groovix.getTimebar().remove(elem);
		}
	}
	@Override
	public void dispose() {
		doSaveAs();
		super.dispose();
		engine.cancel();
		engine.done(Status.CANCEL_STATUS);
	}
	@Override
	public boolean isSaveOnCloseNeeded() {
		engine.cancel();
		engine.done(Status.CANCEL_STATUS);
		return true;
	}
	private void handleMouseMove(MouseEvent e) {
		if (lastMouse == null) {
			lastMouse = new Point();
		}
		lastMouse.x = e.x;
		lastMouse.y = e.y;
	}
	private void draw(PaintEvent e) {
		drawGrid(e);
		drawUIElem(e);
		//drawMouseInfo(e);
	}
	void drawUIElem(PaintEvent e) {
		for (UIElem c : getUIElements()) {
			if (c instanceof TimeBar) {
				drawTrack(e, (TimeBar)c);
			} else if (c instanceof EventElem) {
				drawEvent(e, (EventElem) c);
			}
		}
	}
	void drawEvent(PaintEvent e, EventElem t) {
		float f = groovix.getZoomFactor();
		Point coords = t.getBounds().getLocation();
		Dimension dim = t.getBounds().getSize();
		Point xy = toPosition(coords.x, coords.y);
		double du 	= f * GRID_STEP;
		double w 	= (du * dim.width) / 2; 
		double h 	= (du * dim.height) / 2; 
		
		int x  = (int) (xy.x-w);
		int y  = (int) (xy.y-h);
		int dx = (int) w * 2;
		int dy = (int) h * 2;

		if (t instanceof EventTrigger) {
			drawTrigger(e, t, x, y, dx, dy);
		} else if (t instanceof EventCue) {
			drawCue(e, t, x, y, dx, dy);
		} else if (t instanceof EventListener) {
			drawListener(e, t, x, y, dx, dy);
		} else if (t instanceof EventSynchro) {
			drawSynchro(e, t, x, y, dx, dy);
		}
		if (groovix.getSelection().contains(t)) {
			drawSelection(e, t, x, y, dx, dy);
		}
	}
	private void drawSelection(PaintEvent e, UIElem t, int x, int y, int dx, int dy) {
		e.gc.setLineWidth(4);

		e.gc.setForeground(ColorConstants.red);
		e.gc.setBackground(ColorConstants.red);

		e.gc.drawRectangle(x-5, y-5, dx+10, dy+10);
	}
	private void drawTrigger(PaintEvent e, EventElem t, int x, int y, int dx, int dy) {
		if (t.getBang()<=0) {
			e.gc.setForeground(lightBlue);
			e.gc.setBackground(lightBlue);
		} else {
			e.gc.setForeground(ColorConstants.red);
			e.gc.setBackground(ColorConstants.red);
		}
		e.gc.setLineWidth(2);
		org.eclipse.swt.graphics.Rectangle clipRect = 
				new org.eclipse.swt.graphics.Rectangle(x-1, y-1, dx+2, dy+2);
		e.gc.setClipping(clipRect);
		e.gc.fillOval(x, y, dx, dy);
		e.gc.setForeground(ColorConstants.white);
		e.gc.setBackground(ColorConstants.white);
		e.gc.drawOval(x, y, dx, dy);
		e.gc.setClipping(e.x, e.y, e.width, e.height);
		t.setCenter(new Point(x, y));
		t.setRadius((double)dx);
	}
	private void drawListener(PaintEvent e, EventElem t, int x, int y, int dx, int dy) {
		e.gc.setLineWidth(2);
		if (t.getBang()<=0) {
			e.gc.setForeground(ColorConstants.orange);
			e.gc.setBackground(ColorConstants.orange);
		} else {
			e.gc.setForeground(ColorConstants.red);
			e.gc.setBackground(ColorConstants.red);
		}
		org.eclipse.swt.graphics.Rectangle clipRect = 
				new org.eclipse.swt.graphics.Rectangle(x-1, y-1, dx+2, dy+2);
		e.gc.setClipping(clipRect);
		e.gc.fillRectangle(x, y, dx, dy);
		e.gc.setForeground(ColorConstants.white);
		e.gc.setBackground(ColorConstants.white);
		e.gc.drawRectangle(x, y, dx, dy);
		e.gc.setClipping(e.x, e.y, e.width, e.height);
		t.setCenter(new Point(x, y));
		t.setRadius((double)dx);
	}
	private void drawCue(PaintEvent e, EventElem t, int x, int y, int dx, int dy) {
		if (t.getBang()<=0) {
			e.gc.setForeground(ColorConstants.blue);
			e.gc.setBackground(ColorConstants.blue);
		} else {
			e.gc.setForeground(ColorConstants.red);
			e.gc.setBackground(ColorConstants.red);
		}
		e.gc.setLineWidth(2);
		
		org.eclipse.swt.graphics.Rectangle clipRect = 
				new org.eclipse.swt.graphics.Rectangle(x-1, y-1, dx+2, dy+2);
		e.gc.setClipping(clipRect);
		
		Point head = new Point(x, y + dx / 2);
		Point p2 = new Point(head.x + dx, head.y - dx);
		Point p3 = new Point(head.x + dx, head.y + dx);

		int[] trianglePts = new int[]{head.x, head.y, p2.x, p2.y, p3.x, p3.y};
		
		e.gc.fillPolygon(trianglePts);
		
		e.gc.setForeground(ColorConstants.white);
		e.gc.setBackground(ColorConstants.white);
		
		e.gc.drawPolygon(trianglePts);
		
		e.gc.setClipping(e.x, e.y, e.width, e.height);
		t.setCenter(new Point(x, y));
		t.setRadius((double)dx);
	}
	
	private void drawSynchro(PaintEvent e, EventElem t, int x, int y, int dx, int dy) {
		if (t.getBang()<=0) {
			e.gc.setForeground(ColorConstants.yellow);
			e.gc.setBackground(ColorConstants.yellow);
		} else {
			e.gc.setForeground(ColorConstants.red);
			e.gc.setBackground(ColorConstants.red);
		}
		e.gc.setLineWidth(2);
		
		org.eclipse.swt.graphics.Rectangle clipRect = 
				new org.eclipse.swt.graphics.Rectangle(x-1, y-1, dx+2, dy+2);
		e.gc.setClipping(clipRect);
		
		int dx0 = x;
		int dx1 = x + dx/3;
		int dx2 = x + 2 * dx/3;
		int dx3 = x + dx;
		
		int dy0 = y;
		int dy1 = y + dy/3;
		int dy2 = y + 2 * dy/3;
		int dy3 = y + dy;
		
		
		//                10     20
		//           01   11     21    31
		//           02   12     22    32
		//                13     23     
		//
		
		int[] pts = new int[]{
			dx1, dy0, dx2, dy0, dx2, dy1, dx3, dy1, dx3, dy2, dx2, dy2,
			dx2, dy3, dx1, dy3, dx1, dy2, dx0, dy2, dx0, dy1, dx1, dy1,  
		};
		
		e.gc.fillPolygon(pts);
		
		e.gc.setForeground(ColorConstants.white);
		e.gc.setBackground(ColorConstants.white);
		
		e.gc.drawPolygon(pts);
		
		e.gc.setClipping(e.x, e.y, e.width, e.height);
		t.setCenter(new Point(x, y));
		t.setRadius((double)dx);
	}
	
	private void drawTrack(PaintEvent e, TimeBar c) {
		e.gc.setForeground(ColorConstants.lightGreen);
		float f = groovix.getZoomFactor();
		Point coords = c.getBounds().getLocation();
		Dimension dim = c.getBounds().getSize();
		Point xy 	= toPosition(coords.x, coords.y);
		
		dim.width	= new Float(dim.width * c.getScale()).intValue();
		dim.height	= new Float(dim.height * c.getScale()).intValue();
		
		double du 	= f * GRID_STEP;
		double w 	= (du * dim.width) / 2; 
		double h 	= (du * dim.height) / 2; 
		
		float ratio = c.getTimecursor().getCompletion() / 100f;
		
		int l = c.getTimecursor().getLength();
		du = (du / 2) * l; 
		
		double angle = Math.PI * 2 * ratio;
		
		double ca = Math.cos(angle);
		double sa = Math.sin(angle);
		
		double x0 = w * ca;
		double y0 = h * sa;

		double x1 = xy.x + (w - du) * ca;
		double y1 = xy.y + (h - du) * sa;

		double x2 = xy.x + (w + du) * ca;
		double y2 = xy.y + (h + du) * sa;
		

		if (c instanceof Circle) {
			drawCircle(e, (Circle) c, xy, w, h, x0, y0, x1, y1, x2, y2);
		} else if (c instanceof Track) {
			drawTrack(e, (Track) c, xy, w, h);
		} 
		
		if (groovix.getSelection().contains(c)) {
			drawSelection(e, c, (int)(xy.x - w / 2), (int)(xy.y - h / 2), (int)w, (int)h);
		}
		if (isRunning()) {
			QuanticMojo.INSTANCE.acceptLocalAgentCmd(
				OscCmdUtils.INSTANCE.createOscCmd(
					"/ez/sequencer/cursor", 
					c.getLabel(), 
					new Integer((int)x0), 
					new Integer((int)y0),
					new Float(Math.cos(angle)),
					new Float(Math.sin(angle)),
					new Float(c.getTimecursor().getCompletion()),
					new Float(c.getTimecursor().getTime())
				)
			);
			evalTriggers(angle, x0, y0, x1, y1, x2, y2);
			for (EventCue cue : evalCues(angle, x0, y0, x1, y1, x2, y2)) {
				if (cue.getKind().equals(CUE_TYPE.FLIP)) {
					int direction = c.getTimecursor().getDirection();
					c.getTimecursor().setDirection(direction == 1 ? -1 : 1);
				} else if (cue.getKind().equals(CUE_TYPE.RESET)) {
					c.getTimecursor().setCompletion(cue.getJump());
				} 

			}
		}
	}
	private void drawTrack(PaintEvent e, Track c, Point xy, double w, double h) {
		//
		// Points are organized w/ 4 point cycle first, last and 2 midlle control points for beziers curve drawing purposes 
		//
		int max = c.getPolyline().getPoints().size();
		if (max%4 == 0) {
			for (int i=0;i<max;i+=4) {
				Point pt0 = c.getPolyline().getPoints().getPoint(i);
				Point pt1 = c.getPolyline().getPoints().getPoint(i+1);
				Point pt2 = c.getPolyline().getPoints().getPoint(i+2);
				Point pt3 = c.getPolyline().getPoints().getPoint(i+3);
				
				Point xy0 	= toPosition(pt0.x, pt0.y);
				Point xy1 	= toPosition(pt1.x, pt1.y);
				Point xy2 	= toPosition(pt2.x, pt2.y);
				Point xy3 	= toPosition(pt3.x, pt3.y);
				
				float [] pts = KineticMotionUtils.INSTANCE.bezier(xy0.x, xy0.y, xy1.x, xy1.y, xy2.x, xy2.y, xy3.x, xy3.y, 10);
				e.gc.setForeground(ColorConstants.orange);
				e.gc.setBackground(ColorConstants.orange);
				for (int ii=0;ii<5;ii++) {
					e.gc.fillRectangle((int)pts[ii], (int)pts[ii+1], 8, 8);
				}
			}
		}
	}
	private void drawCircle(PaintEvent e, Circle c, Point xy, double w, double h, double x0, double y0, double x1, double y1, double x2, double y2) {
		e.gc.setLineWidth(2);
		
		//e.gc.setClipping((int) (xy.x-w-1), (int) (xy.y-h-1), (int) (w * 2 + 2), (int) (h * 2 + 2));
		
		e.gc.drawOval((int) (xy.x-w), (int) (xy.y-h), (int) w * 2, (int) h * 2);

		e.gc.setForeground(ColorConstants.red);
		e.gc.setBackground(ColorConstants.red);
		
		//e.gc.setClipping((int)(xy.x - w - 1), (int)(xy.y - h - 1), (int)(w + 2), (int)(h + 2));

		e.gc.fillOval((int) (x0 + xy.x - 4), (int) (y0 + xy.y - 4), 8, 8);
		e.gc.setLineWidth(4);
		e.gc.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
		

		c.setCenter(new Point(xy.x, xy.y));
		c.setRadius(w);
	}
	private void evalTriggers(double a, double x0, double y0, double x1, double y1, double x2, double y2) {
		for (final EventTrigger t : groovix.getTriggers()) {
			double cx = t.getCenter().x;
			double cy = t.getCenter().y;
			double cr = t.getRadius();
			boolean intersects = KineticMotionUtils.INSTANCE.circleLineIntersect(x1, y1, x2, y2, cx, cy, cr);
			if (intersects) {
				t.setBang(5*engine.getIncrement());
				QuanticMojo.INSTANCE.acceptLocalAgentCmd(
					OscCmdUtils.INSTANCE.createOscCmd(
						"/ez/sequencer/trigger", 
						t.getLabel(),
						new Integer((int)cx), 
						new Integer((int)cy),
						new Integer((int)cr)
					)
				);
				for(EmitInfo info : t.getEmits()) {
					if (info.getTargets().isEmpty()) {
						for (Cmd cmd :info.getCmd()) {
							if (cmd instanceof OscCmd) {
								QuanticMojo.INSTANCE.acceptLocalAgentCmd(
									(OscCmd) cmd
								);						
							}
						}
					} else {
						for (EZMojoTarget target : info.getTargets()) {
							CmdPipe pipe = EZMojoTargetUtils.INSTANCE.getCmdPipe(target, true);
							if (pipe != null) {
								for (Cmd cmd : info.getCmd()) {
									pipe.send(cmd);
								}
							}
						}
					}
				}
			}
		}
	}
	private List<EventCue> evalCues(double a, double x0, double y0, double x1, double y1, double x2, double y2) {
		List<EventCue> lst = new ArrayList<EventCue>();
		for (final EventCue t : groovix.getCues()) {
			double cx = t.getCenter().x;
			double cy = t.getCenter().y;
			double cr = t.getRadius();
			boolean intersects = KineticMotionUtils.INSTANCE.circleLineIntersect(x1, y1, x2, y2, cx, cy, cr);
			if (intersects) {
				t.setBang(5*engine.getIncrement());
				lst.add(t);
				QuanticMojo.INSTANCE.acceptLocalAgentCmd(
					OscCmdUtils.INSTANCE.createOscCmd(
						"/ez/sequencer/cue", 
						new Integer((int)cx), 
						new Integer((int)cy),
						new Integer((int)cr)
					)
				);
			}
		}
		return lst;
	}
	private void drawPositionSquare(PaintEvent e, Point coords) {
		e.gc.setForeground(ColorConstants.orange);
		Point xy = toPosition(coords.x, coords.y);
		e.gc.setLineWidth(2);
		e.gc.drawRectangle(xy.x-2, xy.y-2, 4, 4);
	}
	@SuppressWarnings("unused")
	private void drawMouseInfo(PaintEvent e) {
		GC gc = e.gc;
		float f = groovix.getZoomFactor();
		gc.drawText("zoom : " + f, 20, 20);
		
		Point pt = toCoordinates(e.width, e.height, lastMouse.x, lastMouse.y);
		
		if (lastCoordinates.x == pt.x && lastCoordinates.y == pt.y) {
			drawPositionSquare(e, pt);
		} else {
			redraw();
		}
		
		lastCoordinates = pt;
		gc.drawText("coordinates  : " + pt.x + ", " + pt.y, 40, 20);
	}
	private Point toPosition(int coordX, int coordY) {
		return toPosition(getSize(), coordX, coordY);
	}
	private Point toPosition(Point dim, int coordX, int coordY) {
		return toPosition(dim.x, dim.y, coordX, coordY);
	}
	@SuppressWarnings("deprecation")
	private Point toPosition(int w, int h, int coordX, int coordY) {
		float f			= groovix.getZoomFactor();
		Point offset	= groovix.getOffset();
		float du		= GRID_STEP * f;
		return new Point(
			offset.x + (w / 2) + (coordX * du), 
			offset.y + (h / 2) + (coordY * du)
		);
	}
	@SuppressWarnings("deprecation")
	private Point toCoordinates(int w, int h, int x, int y) {
		float f = groovix.getZoomFactor();
		Point offset	= groovix.getOffset();
		float cx = new Float(offset.x + (w / 2));
		float cy = new Float(offset.y + (h / 2));
		
		float dx = new Float(x - cx);
		float dy = new Float(y - cy);
		
		float du = f * GRID_STEP;
		return new Point(dx / du, dy / du);
	}
	private void drawGrid(PaintEvent e) {
		GC gc = e.gc;
		
		gc.setForeground(ColorConstants.gray);
		
		float v = groovix.getZoomFactor();
		v = v < 0.2f ? 0.2f : v;
		v = v > 10 ? 10 : v;
		groovix.setZoomFactor(v);
		
		int w2 = e.width / 2;
		int h2 = e.height / 2;

		Float d	= new Float(GRID_STEP * v);
		int dx = groovix.getOffset().x;
		int dy = groovix.getOffset().y;
		
		for (int l=h2+dy; l>=0;l-=d) {
			gc.drawLine(0, l, e.width, l);
		}
		for (int r=dy; r<=h2;r+=d) {
			int ny = r + (e.height / 2);
			gc.drawLine(0, ny, e.width, ny);
		}
		for (int t=w2+dx; t>=0;t-=d) {
			gc.drawLine(t, 0, t, e.height);
		}
		for (int b=dx; b<=w2;b+=d) {
			int nx = b + (e.width / 2);
			gc.drawLine(nx, 0, nx, e.height);
		}
		
		gc.setForeground(ColorConstants.orange);
		gc.setLineWidth(2);
		Point pt = toPosition(0, 0);
		gc.drawRectangle(pt.x-5, pt.y-5, 10, 10);
		gc.setLineWidth(1);
	}	
	boolean isEmpty(int x, int y) {
		for (UIElem b : getUIElements()) {
			if (b.getBounds().x == x && b.getBounds().y == y) {
				return false;
			}
		}
		return true;
	}
	@SuppressWarnings("unused")
	private UIElem getUIElemAt(int x, int y) {
		for (UIElem b : getUIElements()) {
			if (b.getBounds().x == x && b.getBounds().y == y) {
				return b;
			}
		}
		return null;
	}
	private EventElem getEventElemAt(int x, int y) {
		for (EventElem b : getEventElements()) {
			if (b.getBounds().x == x && b.getBounds().y == y) {
				return b;
			}
		}
		return null;
	}
	private EventElem getEventElem(int x, int y) {
		for (EventElem t : getEventElements()) {
			float f = groovix.getZoomFactor();
			Point coords = t.getBounds().getLocation();
			Dimension dim = t.getBounds().getSize();
			Point xy = toPosition(coords.x, coords.y);
			double du 	= f * GRID_STEP;
			double w 	= (du * dim.width) / 2; 
			double h 	= (du * dim.height) / 2; 
			
			int x1  = (int) (xy.x-w);
			int y1  = (int) (xy.y-h);
			int dx = (int) w * 2;
			int dy = (int) h * 2;
			
			if (new Rectangle(x1, y1, dx, dy).contains(x, y)) {
				return t;
			}
		}
		return null;
	}
	private TimeBar getTimeBar(int x, int y) {
		for (TimeBar t : getTracks()) {
			float f = groovix.getZoomFactor();
			Point coords = t.getBounds().getLocation();
			Dimension dim = t.getBounds().getSize();
			Point xy = toPosition(coords.x, coords.y);
			double du 	= f * GRID_STEP;
			double w 	= (du * dim.width) / 2; 
			double h 	= (du * dim.height) / 2; 
			
			int x1  = (int) (xy.x-w);
			int y1  = (int) (xy.y-h);
			int dx = (int) w * 2;
			int dy = (int) h * 2;
			
			if (new Rectangle(x1, y1, dx, dy).contains(x, y)) {
				return t;
			}
		}
		return null;
	}
	private UIElem getUIElem(int x, int y) {
		UIElem e = getTimeBar(x, y);
		if (e instanceof UIElem) {
			return e;
		}
		return getEventElem(x, y);
	}
	private void handleDoubleClick(MouseEvent e) {
		Point size = getSize();
		Point pt = toCoordinates(size.x, size.y, e.x, e.y);
		if (isEmpty(pt.x, pt.y)) {
			int stateMask = e.stateMask;
			int button = -1;
			if ((stateMask & SWT.CTRL) != 0) button = SWT.CTRL;
			if ((stateMask & SWT.ALT) != 0) button = SWT.ALT;
			if ((stateMask & SWT.SHIFT) != 0) button = SWT.SHIFT;
			if ((stateMask & SWT.COMMAND) != 0) button = SWT.COMMAND;
  			if (button == SWT.COMMAND) {
				Circle c = (Circle) GroovixUtils.INSTANCE.createCircleBar();
				c.setLabel("C"+groovix.getTimebar().size()+1);
				c.setBounds(new Rectangle(pt.x, pt.y, 4, 4));
				//c.eAdapters().add(uiAdapter);
				groovix.getTimebar().add(c);
			} else if (button == SWT.ALT){
				EventCue evt = GroovixUtils.INSTANCE.createCue();
				evt.setBounds(new Rectangle(pt.x, pt.y, 1, 1));
				//evt.eAdapters().add(uiAdapter);
				groovix.getCues().add(evt);
			} else if (button == SWT.SHIFT){
				EventListener evt = GroovixUtils.INSTANCE.createListener();
				evt.setBounds(new Rectangle(pt.x, pt.y, 1, 1));
				//evt.eAdapters().add(uiAdapter);
				groovix.getListeners().add(evt);
			} else if (button == SWT.CTRL) {
				EventTrigger evt = GroovixUtils.INSTANCE.createTrigger();
				evt.setBounds(new Rectangle(pt.x, pt.y, 1, 1));
				//evt.eAdapters().add(uiAdapter);
				groovix.getTriggers().add(evt);
			} else  {
				Track track = (Track) GroovixUtils.INSTANCE.createPathBar();
				track.setBounds(new Rectangle(pt.x, pt.y, 4, 1));
				Point p1 = new Point(pt.x, pt.y);
				Point p2 = new Point(pt.x + 1, pt.y);
				Point p3 = new Point(pt.x + 2, pt.y);
				Point p4 = new Point(pt.x + 3, pt.y);
				Polyline pl = new Polyline();
				pl.getPoints().addPoint(p1);
				pl.getPoints().addPoint(p2);
				pl.getPoints().addPoint(p3);
				pl.getPoints().addPoint(p4);
				track.setPolyline(pl);
				//evt.eAdapters().add(uiAdapter);
				groovix.getTimebar().add(track);
			}
		} else {
  			drag = false;
			editEventElem(getEventElemAt(pt.x, pt.y));
		}
		redraw();
	}
	private void editEventElem(EventElem e) {
		//set
	}
	@Override
	public void setFocus() {}
	
	//
	// Selection
	//
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}
	@Override
	public ISelection getSelection() {
		return new StructuredSelection(groovix.getSelection());
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}
	@Override
	public void setSelection(ISelection selection) {
		groovix.getSelection().clear();
		for (Object o : ((StructuredSelection)selection).toArray()) {
			groovix.getSelection().add((UIElem)o);
		}
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}
	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.sequencer";
	}
}
