import icommand.nxt.*;

/**
 * This class demonstrates how to control RCX motors using
 * the NRLink adapter by Mindsensors.com
 * @author BB
 *
 */
public class RCXControl {

	public static void main(String [] args) throws Exception {
		icommand.nxt.comm.NXTCommand.open();
		icommand.nxt.comm.NXTCommand.setVerify(true); // Dick Swan mentions it needs a 30 ms delay between commands to work right.
		RCXLink rcx = new RCXLink(SensorPort.S1);
		
		//System.out.println("Product ID: " + rcx.getProductID());
		System.out.println("Port Type: " + rcx.getSensorType());
		//System.out.println("Version: " + rcx.getVersion());
		
		rcx.C.backward();
		Thread.sleep(2000);
		rcx.C.forward();
		Thread.sleep(2000);
		rcx.C.stop();
		Thread.sleep(1000);
		rcx.powerOff();
		
		Motor.C.setSpeed(25);
		Motor.C.rotate(-120);
		
		icommand.nxt.comm.NXTCommand.close();
	}
}