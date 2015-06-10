package net.sf.smbt.gis.ui.actions;

import java.io.File;

import net.sf.smbt.gis.ui.MapView;
import net.sf.smbt.gis.ui.WMSHttpUtils;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.geotools.coverage.grid.io.AbstractGridCoverage2DReader;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.map.MapContext;
import org.geotools.map.MapLayer;
import org.geotools.styling.Style;
import org.geotools.swt.SwtMapPane;
import org.geotools.swt.utils.Utils;

/**
 * Command that delegates to the gt-swt open geotiffs.
 * 
 * @author Andrea Antonello (www.hydrologis.com)
 */
public class OpenWMSGeoTiffCommand extends AbstractHandler {

    @Override
    public Object execute( ExecutionEvent event ) throws ExecutionException {
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        MapView mapView = (MapView) activePage.findView(MapView.ID);

        SwtMapPane mapPane = mapView.getMapPane();

        File openFile = WMSHttpUtils.INSTANCE.getImage();

        if (openFile != null && openFile.exists()) {
            AbstractGridFormat format = GridFormatFinder.findFormat(openFile);
            AbstractGridCoverage2DReader tiffReader = format.getReader(openFile);
            Style rgbStyle = Utils.createRGBStyle(tiffReader);

            MapContext mapContext = mapPane.getMapContext();
            MapLayer layer = new MapLayer(tiffReader, rgbStyle);
            layer.setTitle(openFile.getName());
            mapContext.addLayer(layer);
            mapPane.redraw();
        }
    

        return null;
    }

}
