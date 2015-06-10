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
import net.sf.smbt.ezmojo.provider.EzmojoItemProviderAdapterFactory;
import net.sf.smbt.ezsequence.EventElem;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.UIElem;
import net.sf.smbt.ezsequence.provider.EzsequenceItemProviderAdapterFactory;
import net.sf.smbt.midi.ezmidi.provider.EzmidiItemProviderAdapterFactory;
import net.sf.smbt.osccmd.provider.OsccmdItemProviderAdapterFactory;
import net.sf.smbt.sequencer.engine.GroovixUtils;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.sequencer.actions.AddCircleAction;
import net.sf.smbt.ui.sequencer.actions.AddPathAction;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.swt.graphics.Color;
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
/*
import javafx.embed.swt.FXCanvas;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
*/

public class GroovixEditor4 extends EditorPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {
	
	private Sequencer groovix;
	private Composite inside, container;
	@SuppressWarnings("unused")
	private GroovixTimedLine timedLineContainer;
	private GroovixEngine engine;
	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	@SuppressWarnings("unused")
	private UIAdapterImpl uiAdapter;
	@SuppressWarnings("unused")
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));
	
	private DMXLibrary dmxLib;
	
	@SuppressWarnings("unused")
	private double mouseX = 0, mouseY = 0;
	
	// JavaFX
	/*
	private Scene scene;
	private ZoomPane root;
	private Group topNode;
	*/
	
	private boolean running = false;
	@SuppressWarnings("unused")
	private boolean drag = false;
	@SuppressWarnings("unused")
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
	
	private AddCircleAction addCircleAction;
	private AddPathAction addPathAction;
	
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
	public GroovixEditor4() {
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
		initDMX();
		initEngine();
		initActions();
		setSelection(new StructuredSelection(groovix));
		initUIAdapter();
	}
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
			//return new GroovixPropertySheetPage(this);
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
		inside.redraw();
	}
	public Point getSize() {
		org.eclipse.swt.graphics.Point pt = inside.getSize();
		return new Point(pt.x, pt.y);
	}
	@Override
	public void createPartControl(Composite parent) {
	   	parent.setLayout(GridLayoutFactory.fillDefaults().create());
    	parent.setLayoutData(GridDataFactory.fillDefaults().create());
		
		inside = GUIToolkit.INSTANCE.createComposite(parent);

		inside.setLayout(GridLayoutFactory.fillDefaults().create());
		inside.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	
		container = GUIToolkit.INSTANCE.createComposite(inside, SWT.DOUBLE_BUFFERED);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		/*
	    FXCanvas fxCanvas = new FXCanvas(container, SWT.NONE) {
		    public org.eclipse.swt.graphics.Point computeSize(int wHint, int hHint, boolean changed) {
		        getScene().getWindow().sizeToScene();
		        int width	= (int) getScene().getWidth();
		        int height	= (int) getScene().getHeight();
		        return new org.eclipse.swt.graphics.Point(width, height);
		    }
		};
		fxCanvas.setLayout(GridLayoutFactory.fillDefaults().create());
		fxCanvas.setLayoutData(GridDataFactory.fillDefaults().create());

		topNode = new Group();

		root	= new ZoomPane(topNode);
		root.setMaxSize(10000, 10000);
		root.setMinSize(10000, 10000);

		StackPane.setAlignment(root, Pos.CENTER);

		ScrollPane sp = new ScrollPane();
		scene	= new Scene(
			sp, 
			2500, 
			2500, 
			new javafx.scene.paint.Color(100d/255d, 100d/255d, 100d/255d, 1d)
		);   
		
		sp.setPannable(true);
		sp.setContent(root);
		
		sp.setHvalue(0);
		sp.setVvalue(0);
		sp.setHmin(-5000);
		sp.setVmin(-5000);
		sp.setHmax(+5000);
		sp.setVmax(+5000);
		
		sp.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
		sp.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);

		fxCanvas.setScene(scene);
		
		FXUtils.INSTANCE.initFXSequencer(groovix, scene, topNode);
		FXUtils.INSTANCE.drawFXGrid(topNode);
		
		inside.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				engine.cancel();
				engine.done(Status.CANCEL_STATUS);
			}
		});
		
		PerspectiveCamera camera = new PerspectiveCamera();
		camera.setFieldOfView(60);
			
		scene.setCamera(camera);
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount()==2) {
					Point point = new Point(
						event.getSceneX()+root.getTranslateX()+topNode.getTranslateX(),
						event.getSceneY()+root.getTranslateY()+topNode.getTranslateY()
					);
					handleAddTimeBar(point);
				}
			}
		});

		//timedLineContainer = new GroovixTimedLine(inside, this);
		timedLineContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(4).equalWidth(false).create());
		timedLineContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).align(SWT.CENTER, SWT.BOTTOM).hint(SWT.DEFAULT, 100).create());
		*/
	}
	@SuppressWarnings("unused")
	private void handleAddTimeBar(Point pt) {
		//topNode.getChildren().add(new GCircle(pt.preciseX(), pt.preciseY(), 20));
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
