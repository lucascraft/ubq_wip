package net.sf.smbt.gis.ui.actions;

import java.io.File;
import java.io.IOException;

import net.sf.smbt.gis.ui.MapView;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.map.MapContext;
import org.geotools.styling.Style;
import org.geotools.swt.SwtMapPane;
import org.geotools.swt.control.JFileDataStoreChooser;
import org.geotools.swt.utils.Utils;

/**
 * Command that delegates to the gt-swt open shapefile.
 * 
 * @author Andrea Antonello (www.hydrologis.com)
 */
public class OpenShapefileCommand extends AbstractHandler {

    @Override
    public Object execute( ExecutionEvent event ) throws ExecutionException {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        MapView mapView = (MapView) activePage.findView(MapView.ID);

        SwtMapPane mapPane = mapView.getMapPane();

        Display display = Display.getCurrent();
        Shell shell = new Shell(display);
        File openFile = JFileDataStoreChooser.showOpenFile(new String[]{"*.shp"}, shell); //$NON-NLS-1$

        try {
            if (openFile != null && openFile.exists()) {
                MapContext mapContext = mapPane.getMapContext();
                FileDataStore store = FileDataStoreFinder.getDataStore(openFile);
                SimpleFeatureSource featureSource = store.getFeatureSource();
                Style style = Utils.createStyle(openFile, featureSource);
                mapContext.addLayer(featureSource, style);
                mapPane.redraw();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
