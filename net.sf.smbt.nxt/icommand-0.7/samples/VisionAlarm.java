import icommand.vision.*;

/**
 * VisionAlarm demonstrates some functions of the Vision package.
 * You do not need to connect or turn on your NXT to run this.
 * NOTE: You must set up a property file first. See readme for more
 * information on setting up the Vision API.
 * @author Lawrie/BB
 *
 */
public class VisionAlarm implements MotionListener, ColorListener {
  long lastPlay = 0;
  private final int blue = 0xa0b0c0;

  public static void main(String [] args) {
    (new VisionAlarm()).run();
  }

  private void run() {
    Vision.setImageSize(320, 240);
    Vision.flipHorizontal(false);
    Vision.addRectRegion(1, 30, 100, 50, 100);
    Vision.addMotionListener(1, this);
    Vision.addRectRegion(2, 130, 100, 50, 100);
    Vision.addMotionListener(2, this);
    Vision.addRectRegion(3, 230, 100, 50, 100);
    Vision.addColorListener(3, this, blue);
    Vision.startViewer("Alarm");
  }

  public void motionDetected(int region) {
    if ((System.currentTimeMillis() - lastPlay) > 1000) {
      lastPlay = System.currentTimeMillis();
      Vision.playSound("blip.wav");
    }   
  }
  public void colorDetected(int region, int color) {
    if ((System.currentTimeMillis() - lastPlay) > 1000) {
      lastPlay = System.currentTimeMillis();
      Vision.playSound("quack.wav");
      Vision.stopViewer();
      System.exit(0);
    }   
  }
}