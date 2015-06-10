import icommand.nxt.Motor;
import icommand.nxt.comm.NXTCommand;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

/*
 * This program is for the "9797" kit three-wheeled robot that allows you
 * to steer it around the floor with the arrow keys.
 *
 * Assumes that, facing forwards
 *
 * -- motor A drives the right wheel
 * -- motor B drives the left  wheel
 *
 * David Wakeling
 * University of Gloucestershire
 * 15/10/2006
 */
public class RadioControl extends Frame implements Runnable, KeyListener {

	public static final int FRAME_HEIGHT = 50;

	public static final int FRAME_WIDTH = 300;

	public static final int DELAY_MS = 100;

	public static final int COMMAND_NONE = 1;

	public static final int COMMAND_FORWARDS = 2;

	public static final int COMMAND_BACKWARDS = 3;

	public static final int COMMAND_LEFT = 4;

	public static final int COMMAND_RIGHT = 5;

	public static final int DIRECTION_FORWARDS = 1;

	public static final int DIRECTION_BACKWARDS = 2;

	private int command;

	private int direction;

	/*
	 * Constructor.
	 */
	public RadioControl() {
		this.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		this.addKeyListener(this);
		this.setVisible(true);
		command = COMMAND_NONE;
		direction = DIRECTION_FORWARDS;
	}

	public void run() {		
		while (true) { /* loop forever */
			switch (command) {
			case COMMAND_NONE:
				setTitle("None");
				Motor.A.stop();
				Motor.B.stop();
				break;
			case COMMAND_FORWARDS:
				setTitle("Forwards");
				direction = DIRECTION_FORWARDS;
				Motor.A.forward();
				Motor.B.forward();
				break;
			case COMMAND_BACKWARDS:
				setTitle("Backwards");
				direction = DIRECTION_BACKWARDS;
				Motor.A.backward();
				Motor.B.backward();
				break;
			case COMMAND_LEFT:
				setTitle("Left");
				if (direction == DIRECTION_FORWARDS) {
					Motor.A.forward();
				} else {
					Motor.A.backward();
				}
				Motor.B.stop();
				break;
			case COMMAND_RIGHT:
				setTitle("Right");
				if (direction == DIRECTION_FORWARDS) {
					Motor.B.forward();
				} else {
					Motor.B.backward();
				}
				Motor.A.stop();
				break;
			default:
				System.out.println("unknown command " + command);
				System.exit(1);
			}

			try {
				Thread.sleep(DELAY_MS);
			} catch (Exception e) {
				System.out.println(e);
				System.exit(1);
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		int kc = e.getKeyCode();

		switch (kc) {
		case java.awt.event.KeyEvent.VK_UP:
			command = COMMAND_FORWARDS;
			break;
		case java.awt.event.KeyEvent.VK_DOWN:
			command = COMMAND_BACKWARDS;
			break;
		case java.awt.event.KeyEvent.VK_LEFT:
			command = COMMAND_LEFT;
			break;
		case java.awt.event.KeyEvent.VK_RIGHT:
			command = COMMAND_RIGHT;
			break;
		default:
			command = COMMAND_NONE;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		command = COMMAND_NONE;
	}

	public void keyTyped(KeyEvent e) { /* do nothing */
	}

	/*
	 * Window closing event.
	 */
	protected void processWindowEvent(WindowEvent e) {		
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			NXTCommand.close(); // clean up Bluetooth connection
			System.exit(0);
		}
	}

	/*
	 * Main.
	 */
	public static void main(String[] args) {
		NXTCommand.open(); // setup Bluetooth connection

		RadioControl s = new RadioControl();
		Thread t = new Thread(s);
		t.start();
	}
}