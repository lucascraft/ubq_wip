import icommand.nxt.comm.NXTCommand;
import icommand.nxt.*;
public class NXJTest {

	public static void main(String[] args) throws Exception {
		NXTCommand.open();
		NXTCommand.setVerify(true);
		Motor.B.setSpeed(700);
		System.out.println("Battery = " + Battery.getVoltageMilliVolt());
		System.out.println("Waiting for motor to stop");
		Motor.B.rotateTo(400);
		System.out.println("Motor has stopped.");
		System.out.println("Motor tacho = " + Motor.B.getTachoCount());
		LightSensor ls = new LightSensor(SensorPort.S1);
		System.out.println("Light sensor Port 1: " + ls.getLightValue());
		System.out.println("% Light Port 1: " + ls.getLightPercent());
		System.out.println("Closing shop");
		NXTCommand.close();
	}
}
