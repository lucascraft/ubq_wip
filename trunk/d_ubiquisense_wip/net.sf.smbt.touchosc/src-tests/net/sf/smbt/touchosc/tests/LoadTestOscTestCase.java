package net.sf.smbt.touchosc.tests;

import net.sf.smbt.touchosc.touchosc.Layout;
import net.sf.smbt.touchosc.touchosc.TouchoscFactory;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.utils.TouchOSCUtils;

public class LoadTestOscTestCase /*extends TestCase*/ {

	
	public void testLoadTouchOscZipFile() {
		
		TouchOscApp touchOscApp = TouchOSCUtils.INSTANCE.loadAppFromTouchOscXML2("test3.touchosc");
		
		touchOscApp.getDefault();
		
	}
	public void testSaveTouchOscXMLFile() {
		
		
		Layout layout = TouchoscFactory.eINSTANCE.createLayout();
		
		
		
	}
}
