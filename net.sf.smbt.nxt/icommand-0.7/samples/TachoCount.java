import icommand.nxt.Motor;
import icommand.nxt.Sound;
import icommand.nxt.comm.NXTCommand;

/**
 * Sample to spin motors and output Tachometer counts.
 * @author BB
 *
 */
public class TachoCount {
	
	public static void main(String [] args) throws Exception {
		NXTCommand.open();
		
		NXTCommand.setVerify(true);
		System.out.println("Tachometer A: " + Motor.A.getTachoCount());
		System.out.println("Tachometer B: " + Motor.B.getTachoCount());
		Motor.A.rotate(5000);
		Motor.B.rotate(-5000);
		Thread.sleep(10000);
		Sound.playTone(1000, 1000);
		System.out.println("Tachometer A: " + Motor.A.getTachoCount());
		System.out.println("Tachometer B: " + Motor.B.getTachoCount());
		
		NXTCommand.close();
	}	
}