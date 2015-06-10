/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.ableton.widget;

import net.sf.smbt.ezableton.TRACK_MUTE_STATUS;
import net.sf.smbt.ezableton.TRACK_SOLO_STATUS;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.osc.ableton.utils.AbletonLiveControllerUtils;
import net.sf.smbt.osc.ableton.utils.AbletonLive8Utils;
import net.sf.smbt.ui.ableton.Activator;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiPieMeter;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("unused")
public class XUITrack extends Composite implements IXUIItem {
		private LiveTrack track;
		private AbletonLiveControllerUtils liveController;
		private UbiSlider vuSlider;
		private UbiKnob knobPan;
		private Button soloButton, muteButton, stopTrackButton;
		private Image muteOnImage, muteOffImage, soloOnImage, soloOffImage, stoppedImage, stoppableImage;
		private UbiKnob knobA, knobB;
		private TreeViewerColumn column;
		private UbiPieMeter pie;
		
		public XUITrack(Composite parent, LiveTrack track, TreeViewerColumn column, AbletonLiveControllerUtils liveController) {
			super(parent, SWT.DOUBLE_BUFFERED);
			this.track = track;
			this.liveController = liveController;
			setLayout(GridLayoutFactory.fillDefaults().create());
			setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).grab(false, true).create());
			setBackground(GUIToolkit.BG);
			this.column = column;
			muteOnImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/mute-on.png").createImage();
			muteOffImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/mute-off.png").createImage();
			soloOnImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/solo-on.png").createImage();
			soloOffImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/solo-off.png").createImage();
			stoppedImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-stop.png").createImage();
			stoppableImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-stop-green.png").createImage();
			createContent(this);
		}
		
		
		@Override
		public void redraw() {
			super.redraw();
			vuSlider.redraw();
		}
		
		private void createContent(Composite parent) {
			
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			container.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).grab(false, false).create());
			container.setBackground(GUIToolkit.BG);


			/*
			Composite top = new Composite(container, SWT.NONE);
			top.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			top.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
			top.setBackground(GUIToolkit.BG);
			
			stopTrackButton = new Button(top, SWT.TOGGLE);
			stopTrackButton.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.BEGINNING, SWT.CENTER).hint(20, 20).grab(false, false).create());
			stopTrackButton.setImage(stoppableImage);
			stopTrackButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					liveController.getAbletonOscEngine().send(
						AbletonLiveUtils.INSTANCE.createLiveTrackSolo(
							track.getTrackID(), 
							TRACK_SOLO_STATUS.SOLO.equals(track.getSolo()) ? TRACK_SOLO_STATUS.UNSOLO : TRACK_SOLO_STATUS.SOLO
						)
					);
					if (stopTrackButton.getSelection()) {
						stopTrackButton.setImage(stoppedImage);
					} else {
						stopTrackButton.setImage(stoppableImage);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});
			
			
			pie = new UbiPieMeter(top, SWT.NONE);
			pie.setSectors(10);
			pie.setSectors(3);
			pie.setLayout(GridLayoutFactory.fillDefaults().create());
			pie.setLayoutData(
				GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).
					grab(false, false).hint(20, 20).create()
			);

			
			knobA = new UbiKnob(container, SWT.HORIZONTAL);
			knobA.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.BEGINNING, SWT.TOP).hint(50, 50).create());
			knobA.setMax(100f);
			knobA.addSelectionListener(new UbiSelectionListener() {
				@Override
				public void handle() {
					liveController.getAbletonOscEngine().send(
						AbletonLiveUtils.INSTANCE.createLiveTrackSend(
							track.getTrackID(), 
							knobB.getValue()/100f
						)
					);
				}
			});
			
			knobB = new UbiKnob(container, SWT.HORIZONTAL);
			knobB.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.END, SWT.BOTTOM).hint(50, 50).create());
			knobB.setMax(100f);
			knobB.addSelectionListener(new UbiSelectionListener() {
				@Override
				public void handle() {
					liveController.getAbletonOscEngine().send(
						AbletonLiveUtils.INSTANCE.createLiveTrackPitch(
							track.getTrackID(), 
							knobB.getValue()/100f
						)
					);
				}
			});
			 
			Label aLbl = new Label(container, SWT.NONE);
			aLbl.setLayoutData(GridDataFactory.fillDefaults().create());
			aLbl.setText("A");

			Label bLbl = new Label(container, SWT.NONE);
			bLbl.setLayoutData(GridDataFactory.fillDefaults().create());
			bLbl.setText("B");

			 */

			Composite middle = new Composite(parent, SWT.DOUBLE_BUFFERED);
			middle.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			middle.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			middle.setBackground(GUIToolkit.BG);
			middle.addPaintListener(new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					e.gc.setForeground(GUIToolkit.FG);
					e.gc.drawLine(e.width, 0, e.width-1, e.height);
				}
			});
			
			Composite middleLeft = new Composite(middle, SWT.DOUBLE_BUFFERED);
			middleLeft.setLayout(GridLayoutFactory.fillDefaults().create());
			middleLeft.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
			middleLeft.setBackground(GUIToolkit.BG);
			
			knobPan = new UbiKnob(middleLeft, SWT.HORIZONTAL);
			knobPan.setMax(100f);
			knobPan.setLayout(GridLayoutFactory.fillDefaults().create());
			knobPan.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.BEGINNING, SWT.CENTER).hint(50, 50).grab(false, false).create());
			knobPan.addSelectionListener(new UbiSelectionListener() {
				@Override
				public void handle() {
					float value = new Float(knobPan.getSelection()/100f);
					track.setPan(value);
				}
			});
			
			Label panLbl = new Label(middleLeft, SWT.NONE);
			panLbl.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
			panLbl.setText("Pan");
			panLbl.setBackground(GUIToolkit.BG);
			panLbl.setForeground(GUIToolkit.FG);
			
			soloButton = new Button(middleLeft, SWT.TOGGLE);
			soloButton.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.CENTER, SWT.CENTER).hint(30, 30).grab(false, false).create());
			soloButton.setImage(soloOffImage);
			soloButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					liveController.getAbletonOscEngine().send(
						AbletonLive8Utils.INSTANCE.createLiveTrackSolo(
							track.getTrackID(), 
							soloButton.getSelection() ? TRACK_SOLO_STATUS.SOLO : TRACK_SOLO_STATUS.UNSOLO
						)
					);
					if (soloButton.getSelection()) {
						soloButton.setImage(soloOnImage);
					} else {
						soloButton.setImage(soloOffImage);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});
			
			muteButton = new Button(middleLeft, SWT.TOGGLE);
			muteButton.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.CENTER, SWT.CENTER).hint(30, 32).grab(false, false).create());
			muteButton.setImage(muteOffImage);
			muteButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					liveController.getAbletonOscEngine().send(
						AbletonLive8Utils.INSTANCE.createLiveTrackMute(
							track.getTrackID(), 
							muteButton.getSelection() ? TRACK_MUTE_STATUS.MUTE : TRACK_MUTE_STATUS.UNMUTE
						)
					);
					if (muteButton.getSelection()) {
						muteButton.setImage(muteOnImage);
					} else {
						muteButton.setImage(muteOffImage);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});
			
			Composite middleRight = new Composite(middle, SWT.DOUBLE_BUFFERED);
			middleRight.setLayout(GridLayoutFactory.fillDefaults().create());
			middleRight.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
			middleRight.setBackground(GUIToolkit.BG);
	
			vuSlider = new UbiSlider(middleRight, SWT.VERTICAL);
			vuSlider.setMax(100f);
			vuSlider.setLayout(GridLayoutFactory.fillDefaults().create());
			vuSlider.setLayoutData(
				GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).
					grab(true, true).hint(20, 150).create()
			);
			vuSlider.addSelectionListener(new UbiSelectionListener() {
				@Override
				public void handle() {
					float value = new Float(vuSlider.getSelection()/100f);
					track.setVolume(value);
					liveController.getAbletonOscEngine().send(
						AbletonLive8Utils.INSTANCE.createLiveTrackVolume(
							track.getTrackID(), 
							value
						)
					);
				}
			});
			
		}
		
		public void dispose() {
			if (knobA != null && !knobA.isDisposed()) {
				knobA.dispose();
			}
			if (knobB != null && !knobB.isDisposed()) {
				knobB.dispose();
			}
			if (knobPan != null && !knobPan.isDisposed()) {
				knobPan.dispose();
			}
			if (vuSlider != null && !vuSlider.isDisposed()) {
				vuSlider.dispose();
			}
			if (muteButton != null && !muteButton.isDisposed()) {
				muteButton.dispose();
			}
			if (soloButton != null && !soloButton.isDisposed()) {
				soloButton.dispose();
			}
			super.dispose();
		}
		
		public UbiSlider getVuSlider() {
			return vuSlider;
		}
		
		public UbiKnob getKnobPan() {
			return knobPan;
		}
		
}
