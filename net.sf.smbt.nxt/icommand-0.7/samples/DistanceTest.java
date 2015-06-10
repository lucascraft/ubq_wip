import icommand.nxt.SensorPort;
import icommand.nxt.UltrasonicSensor;
import icommand.nxt.comm.NXTCommand;

/**
 * Outputs some data from an UltrasonicSensor sensor in port 1.
 * 
 * @author BB
 * 
 */
public class DistanceTest {

	public static void main(String[] args) {
		NXTCommand.open();

		//NXTCommand.setVerify(true);
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
		System.out.println("Version: " + us.getVersion());
		System.out.println("Product ID: " + us.getProductID());
		System.out.println("Port Type: " + us.getSensorType());
		System.out.println("Measurement Interval: "
				+ us.getMeasurementInterval());
		for(int i=0;i<10;i++)
			System.out.println("Distance: " + us.getDistance());
		System.out.println("Factory scale factor: "
				+ us.getFactoryScaleFactor());
		System.out.println("Factory scale divisor: "
				+ us.getFactoryScaleDivisor());
		byte[] distances = us.getDistances();
		for (int i = 0; i < distances.length; i++)
			System.out.println("Distance " + i + " = " + distances[i]);
		
		NXTCommand.close();
	}
}
