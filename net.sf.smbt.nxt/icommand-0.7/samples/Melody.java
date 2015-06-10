import icommand.nxt.FileSystem;
import icommand.nxt.Sound;
import icommand.nxt.comm.NXTCommand;

import java.io.File;

	/**
	 * This class uploads a melody file (an undocumented sound file
	 * discovered by John Hansen) to the NXT and plays it. John Hansen's
	 * midi to melody conversion utility can be found at:
	 * http://bricxcc.sourceforge.net/utilities.html
	 * @author BB
	 *
	 */
	public class Melody {

		public static void main(String [] args) {
			NXTCommand.open();
			File myFile = new File("Monkey Island.rso");
			byte status = FileSystem.upload(myFile);
			if(status == 0)
				System.out.println("File successfully uploaded");
			else {
				System.out.println("Error uploading " + myFile.getName() + ": " + Integer.toHexString(status));
				return;
			}
			Sound.playSoundFile(myFile.getName());

			NXTCommand.close();
		}
}