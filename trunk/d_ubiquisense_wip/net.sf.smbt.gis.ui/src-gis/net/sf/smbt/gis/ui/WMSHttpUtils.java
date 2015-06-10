package net.sf.smbt.gis.ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.eclipse.core.runtime.Platform;
import org.geotools.data.ows.WMSCapabilities;
import org.geotools.data.wms.WebMapServer;
import org.geotools.data.wms.request.GetMapRequest;
import org.geotools.data.wms.response.GetMapResponse;
import org.geotools.ows.ServiceException;

public class WMSHttpUtils {

	public final static WMSHttpUtils INSTANCE = new WMSHttpUtils();
	
	public File getImage() {
		URL url = null;
		try {
			url = url = new URL("http://www2.dmsolutions.ca/cgi-bin/mswms_gmap?VERSION=1.1.0&REQUEST=GetCapabilities");
		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//URL url =  url = new URL("http://localhost:8080/cgi-bin/mswms_gmap?VERSION=1.1.0&REQUEST=GetCapabilities");

		WebMapServer wms = null;
		try {
			wms = new WebMapServer(url);
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WMSCapabilities capabilities = wms.getCapabilities();

		// gets all the layers in a flat list, in the order they appear in
		// the capabilities document (so the rootLayer is at index 0)
		List layers = capabilities.getLayerList();

		//WebMapServer class also knows how to set up a GetMap request for several different version of the WMS standard.

		GetMapRequest request = wms.createGetMapRequest();
		request.setFormat("image/png");
		request.setDimensions("583", "420"); //sets the dimensions to be returned from the server
		request.setTransparent(true);
		request.setSRS("EPSG:4326");
		request.setBBox("-131.13151509433965,46.60532747661736,-117.61620566037737,56.34191403281659");

		GetMapResponse response = null;
		try {
			response = (GetMapResponse) wms.issueRequest(request);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedImage image = ImageIO.read(response.getInputStream());
			
			File pngFile = Platform.getLocation().append(UUID.randomUUID().toString()).addFileExtension("png").toFile();
			ImageIO.write(image, "png", pngFile);
			
			return pngFile;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
