package icommand.nxt.comm;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * NXTCommSun is a class for communicating with the NXT via Bluetooth
 * using the javax.comm classes of the Java Communications API.
 * Usage: All methods in NXTCommSun are static. 
 * NXTCommRXTX.connect();
 * NXTCommRXTX.sendData(message1);
 * byte [] myArray = NXTCommRXTX.readData();
 * 
 * @author <a href="mailto:bbagnall@mts.net">Brian Bagnall</a>
 * @version 0.1  16-November-2006
 */

// !! Need to add timeout so if it sends data and is waiting for reply and none comes,
// it stops waiting and makes the proper Exception. Otherwise it keeps waiting and
// program never terminates.

class NXTCommSun implements NXTComm
{
	
	/** Time given for the RXTX serial port to timeout, in ms. */
	private static final int SERIAL_TIMEOUT = 2000;
	/** Baud rate to transmit using Bluetooth. */
	private static final int BLUETOOTH_BAUD = 460800;
	
	private CommPort commPort;
	private InputStream in;
    private OutputStream out;
	
    private Properties props;
    
	public NXTCommSun(Properties props) {
		this.props = props;
	}
	
	/**
	* Connects to the COM port specified in NXTCOMM environment variable.
	* For more information on configuring Bluetooth, visit www.lejos.org. {link to document]
	*/
	public void open() throws Exception
    {
		String portName = props.getProperty(NXTCommFactory.COM_PORT);
		System.out.println("NXTCOMM = " + portName); // DELETE ME
        if(portName == null)
        	throw new Exception("NXTCOMM is not defined as a system Environment Variable");
		CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if(portIdentifier.isCurrentlyOwned()) {
            System.out.println("Error: Port is currently in use");
            throw new Exception();
        } else {
            commPort = portIdentifier.open("Bluetooth " + portName,SERIAL_TIMEOUT);
            
            if (commPort instanceof SerialPort) {
                SerialPort serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(BLUETOOTH_BAUD,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
                serialPort.setRTS(true); 
                serialPort.setDTR(true); // This allows NXT programs to be run without resetting NXT each time.
                in = serialPort.getInputStream();
                out = serialPort.getOutputStream();
            } else {
                System.out.println("Error: " + portName + " is not a serial port.");
                throw new Exception();
            }
        }
        // !! Start a thread here to send keepalive message every ? seconds.
    }
	
    /**
	*
	*/ 
	public synchronized byte[] readData() {
		byte [] message = null;
		int length = -1;
		
		try {
			do {
				length = in.read(); // First byte specifies length of packet.
			} while (length < 0);
			int MSB = in.read(); // Most Significant Byte value
			//length = length + (MSB<<8);
			length = (0xFF & length) | ((0xFF & MSB) << 8);
			message = new byte[length];
			in.read(message);
		} catch (IOException e) {
			e.printStackTrace();
        }            
        		
		return (null == message)?new byte[0]:message;
	}
	    
    /**
	* Sends a command to the NXT brick.
	* @param message Data to send.
	*/	
    public synchronized void sendData(byte [] message) {
    	
    	// length of packet (Least and Most significant byte)
    	// * NOTE: Bluetooth only. If do USB, doesn't need it.
    	int LSB = message.length;
		int MSB = message.length >>> 8;
		
        try {
        	// Send length of packet:
        	out.write((byte)LSB);
    		out.write((byte)MSB);
        	
        	out.write(message);
        } catch (IOException e) {
        	System.out.println("Error encountered in NXTCommSun.sendData()");
        	e.printStackTrace();
        }            
    }
        
    /**
     *  Terminates the Bluetooth connection. 
     */
    public void close() {
    	try {
    		if(in != null)
    			in.close();
    	   	if(out != null)
    	   		out.close();
    	   	if (commPort != null)
    	   		commPort.close();
    	} catch(IOException e) {
        	e.printStackTrace();    		    		
    	}
    }
}