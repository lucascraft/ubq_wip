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

package net.sf.smbt.gis.shp;

import static org.geotools.data.shapefile.ShpFileType.DBF;
import static org.geotools.data.shapefile.ShpFileType.PRJ;
import static org.geotools.data.shapefile.ShpFileType.SHP;
import static org.geotools.data.shapefile.ShpFileType.SHX;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.geotools.data.shapefile.BasicShpFileWriter;
import org.geotools.data.shapefile.ShpFileType;
import org.geotools.data.shapefile.ShpFiles;
import org.geotools.renderer.crs.GeographicHandlerFactory;

import com.topografix.gpx.v1._1.BoundsType;
import com.topografix.gpx.v1._1.GpxType;
import com.topografix.gpx.v1._1.TrkType;
import com.topografix.gpx.v1._1.TrksegType;
import com.topografix.gpx.v1._1.WptType;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

public class ShpUtils {

	public final static ShpUtils INSTANCE = new ShpUtils();
	
    public Map<ShpFileType, File> createShpFile(String filename) throws Exception {
        Map<ShpFileType, File> files = createFiles(filename, new ShpFileType[] { SHP, DBF, SHX, PRJ }, false);
        
        String fileName = files.get(SHP).getPath();
        fileName = fileName.substring(0, fileName.length()-4)+".shp";
        ShpFiles shpFiles = new ShpFiles(fileName);

        BasicShpFileWriter requestor = new BasicShpFileWriter(filename);
        URL shpURL = shpFiles.acquireRead(SHP, requestor);
        URL dbfURL = shpFiles.acquireRead(DBF, requestor);
        URL shxURL = shpFiles.acquireRead(SHX, requestor);
        try{
            assert (files.get(SHP).toURI().toURL().toExternalForm().equals(shpURL.toExternalForm()));
            assert (files.get(DBF).toURI().toURL().toExternalForm().equals(dbfURL.toExternalForm()));
            assert(files.get(SHX).toURI().toURL().toExternalForm().equals(shxURL.toExternalForm()));
        }finally{
            shpFiles.unlockRead(shpURL, requestor);
            shpFiles.unlockRead(dbfURL, requestor);
            shpFiles.unlockRead(shxURL, requestor);
        }
        
        return files;
    }
    
    public static Map<ShpFileType, File> createFiles(String string,
            ShpFileType[] values, boolean uppercase) throws IOException {
        Map<ShpFileType, File> files = new HashMap<ShpFileType, File>();

        String extensionWithPeriod = values[0].extensionWithPeriod;
        
        org.eclipse.core.runtime.Path path = new org.eclipse.core.runtime.Path(string);
        
        File dir = path.removeLastSegments(1).toFile();
        File baseFile = File.createTempFile(path.lastSegment(), extensionWithPeriod, dir);
        
        baseFile.createNewFile();
        baseFile.deleteOnExit();

        files.put(values[0], baseFile);

        String baseFileName = values[0].toBase(baseFile);

        for (int i = 1; i < values.length; i++) {
            ShpFileType type = values[i];
            String extension = type.extensionWithPeriod;
            File file = new File(baseFileName + extension);
            file.createNewFile();
            file.deleteOnExit();
            files.put(type, file);
        }

        return files;
    }
    
    
    
    public Geometry dump2Shp(GpxType gpx) {
    	List<Coordinate> points = new ArrayList<Coordinate>();
    	GeometryFactory factory = new GeometryFactory();
    	for (TrkType trk : gpx.getTrk()) {
    		System.out.println("trk " + trk.getNumber());
    		for (TrksegType seg : trk.getTrkseg()) {
        		for (WptType pt : seg.getTrkpt()) {
    				System.out.println(pt.getLat() + ", " + pt.getLon());
    				Coordinate coord = new Coordinate(pt.getLat().intValue(), pt.getLon().intValue()); 
    				points.add(coord);
    			}
    		}
    	}
    	return factory.createLineString(points.toArray(new Coordinate[0]));
    }
    
}
