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

package net.sf.smbt.gis.ui.actions;

import static org.geotools.data.shapefile.ShpFileType.PRJ;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import net.sf.smbt.gis.shp.ShpUtils;
import net.sf.smbt.gpx.utils.Gpx1Utils;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.geotools.data.shapefile.ShpFileType;
import org.geotools.data.shapefile.ShpFiles;
import org.geotools.data.shapefile.shp.ShapeType;
import org.geotools.data.shapefile.shp.ShapefileWriter;

import com.topografix.gpx.v1._1.GpxType;
import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.Geometry;

/**
 * Command that delegates to the gt-swt open geotiffs.
 * 
 * @author Andrea Antonello (www.hydrologis.com)
 */
public class Gpx2ShpImportCommand extends AbstractHandler {

    @Override
    public Object execute( ExecutionEvent event ) throws ExecutionException {
        // IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        // MapView mapView = (MapView) activePage.findView(MapView.ID);
        // SwtMapPane mapPane = mapView.getMapPane();
        
        FileDialog fDlg = new FileDialog(Display.getDefault().getActiveShell());
        fDlg.setFilterExtensions(new String[]{"gpx"});
        String file = fDlg.open();
        if (file != null && file.endsWith("gpx")) {
        	try {
				Map<ShpFileType, File> files = ShpUtils.INSTANCE.createShpFile(file.replace(".gpx", ""));

		        File prj = files.remove(PRJ);

		        ShpFiles shapefiles = new ShpFiles(prj);
		        
		        File shp = files.get(ShpFileType.SHP);
		        File shx = files.get(ShpFileType.SHX);
		        
		        
		        assert(files.equals(shapefiles.getFileNames()));
		        
		        
		        GpxType gpx = Gpx1Utils.INSTANCE.loadGPX(file);
		        
		        Geometry geometry = ShpUtils.INSTANCE.dump2Shp(gpx);
		        
		        try {
		            ShapefileWriter sw = new ShapefileWriter(
		            	new FileOutputStream(shp).getChannel(),
		                new FileOutputStream(shx).getChannel()
		            );
		            
		            sw.writeHeaders(new Envelope(0, 1000, 0, 1000), ShapeType.ARC, 1, 0);
		            sw.writeGeometry(geometry);
		            sw.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }		        

        	} catch (Exception e) {
				e.printStackTrace();
			}
        }

        return null;
    }

}
