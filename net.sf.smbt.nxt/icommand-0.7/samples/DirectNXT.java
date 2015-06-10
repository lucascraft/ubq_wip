import icommand.nxt.comm.NXTCommand;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DirectNXT extends Frame implements WindowListener {
	
	static final long serialVersionUID = 2616710; // Just picked random #. No idea.
	
	public DirectNXT() {
		super("NXTCommand Demonstration");
		this.setSize(640, 800);
		this.addWindowListener(this);
		this.setLayout(new GridLayout(2,1));
		this.add(new MotorPanel());
		this.add(new SensorPanel());
		this.setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NXTCommand.open();
		new DirectNXT(); 
	}
	
	public void windowOpened(WindowEvent e) {
	}
	
	public void windowClosing(WindowEvent e) {
		NXTCommand.close();
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	
	public void windowIconified(WindowEvent e) {}
	
	public void windowDeiconified(WindowEvent e) {}
	
	public void windowActivated(WindowEvent e) {}
	
	public void windowDeactivated(WindowEvent e) {}
	
}