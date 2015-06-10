import icommand.nxt.*;
import icommand.nxt.comm.*;

public class AccelDemo {
	public static void main(String [] args) throws Exception {
		NXTCommand.open();
		NXTCommand.setVerify(true);
		TiltSensor a = new TiltSensor(SensorPort.S1);
		
		System.out.println("Prod ID " + a.getProductID());
		System.out.println("Port Type " + a.getSensorType());
		System.out.println("Version " + a.getVersion());
				
		for(;;) {
			
			//TiltSensor.AccelData aData = a.getAccelData();
			System.out.println("TILT: x " + a.getXTilt() + "  y " + a.getYTilt() + " z " + a.getZTilt());
			//System.out.println("TILT: x " + aData.xTilt + "  y " + aData.yTilt + " z " + aData.zTilt);
			System.out.println("ACCEL: x " + a.getXAccel() + "  y " + a.getYAccel() + " z " + a.getZAccel());
			//System.out.println("ACCEL: x " + aData.xAccel + "  y " + aData.yAccel + " z " + aData.zAccel);
			
		}
		// NXTCommand.close();
	}
}