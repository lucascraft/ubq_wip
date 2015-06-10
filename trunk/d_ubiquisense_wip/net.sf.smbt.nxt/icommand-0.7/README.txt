iCommand 0.7 - January 10, 2008

0.0 - Contents
1.0 - Introduction
2.0 - Installation
  2.1 - iCommand Install
  2.2 - RXTX Install
  2.3 - NEW Setting up the COM port
  2.4 - Running the test
  2.5 - Vision Setup
  2.6 - Windows Mobile PDA Setup
3.0 - Troubleshooting
4.0 - Change Log
5.0 - Future Improvements
6.0 - Licensing 
7.0 - Contact Information

1.0 - Introduction
This package allows you to control your NXT using Java and a Bluetooth connection. It uses the standard Lego NXT firmware to receive commands from Java code on your computer.

2.0 - Installation Overview
Installation is simple for users of Windows who are using the Windows Bluetooth Stack or the popular Widcomm stack. You won't have to do anything special, other than adding the BlueCove JAR to your classpath. Windows users using the Toshiba stack (i.e. a Toshiba computer with internal Bluetooth) will need to follow some special instructions for using RXTX (below).

There are several things to set up to get iCommand working: Java SDK (you probably already have it if you program in Java), Eclipse (optional IDE but recommended), and iCommand (this).

  2.1.1 - iCommand Install (General)
    1. Unzip the contents of the iCommand zip file into a directory.
    2. Set your classpath environment variable to include icommand.jar. Windows users should click Start, *right-click* My Computer, Click Properties, Advanced, Environment Variables. You can enter the location of icommand.jar there under the classpath setting. Also, make sure to put a dot (.) followed by an ; as your first classpath (. is the current directory). Also, if you are using Windows you must add the location of bluecove.jar to the classpath (it's included in the dist directory of iCommand. You complete classpath might look like this:
.;c:\icommand\dist\icommand.jar;c:\icommand\dist\bluecove.jar
    3. Alternately, copy icommand.jar to the Java directory /Library/Java/Extensions/. There is no need to set classpath if you use this directory.
    4. In Eclipse, after you start a new project, select Project, Properties, Java Build Path and "Add External Jars...", then browse to icommand.jar.
    That's all!

  2.2 RXTX Install
  2.2.1 - RXTX Install (Windows)
    1. Download RXTX from http://www.rxtx.org.
    2 Set the Java build path to include RXTXcomm.jar. In Eclipse, after you start a new project, select Project, Properties, Java Build Path and "Add External Jars...", then browse to RXTXcomm.jar.
    3. (Windows) There are some dll's that come with RXTX. Make the dll's accessible by copying them to your Java bin directory e.g. c:\j2sdk1.4.2_12\bin. In Eclipse, select the RXTXcomm.jar you just added and expand it by clicking +. Select "Native library location" and browse to the RXTX subdirectory \Windows\i368-mingw32 (or the directory for your platform).
    
  2.2.2 - RXTX Install (Mac OSX)
    1. Download RXTX 2.1 or greater from rxtx.org - at the time of this writing,
    the correct download is labelled "source/Mac OS X" with the filename 
    "rxtx-2.1-7r2.zip"
    2. Extract the zip file, and navigate to MACOSX_IDE\ForPackageMaker\ and
    run the RXTX_Tiger package. Follow the instructions.
    3. Make a directory called /var/lock and give it read/write permissions (777).
    
    Alternate MacOSX Install:
    1. Download RXTX from http://www.rxtx.org.
    2. Copy files RXTXComm.jar, rxtxSerial.jnilib and iCommand.jar in the directory /Library/Java/Extensions/ (No need to set classpath now.)
    3. Create directory /var/spool/uucp,and set up appropriate permissions (e.g. 777), and include your username in the uucp group using the NetInfo manager.

  2.3 Setting up the COM port (RXTX and Javacomm options only!)
  2.3.1 - The COM port serial service (Windows)
    When you installed the Lego software, it set up a COM port already. You just need to figure out how to find the COM port.
    1. Go to Control Panel, System. Click the Hardware tab and select Device Manager.
    2. You can now expand 'Ports(COM & LPT)' tree to see the COM ports.
    3. The one you want is the lowest Bluetooth COM port in the list e.g. COM4
    4. In the file icommand.properties set the value of nxtcomm to the value of your COM port e.g. COM4.
    5. Put the file icommand.properties into your home directory, or your working directory.
    6. To check the location and contents of the file, execute the command: java -jar icommand.jar

  2.3.2 - The COM port serial service (Linux)
   Instructions for setting up/testing Bluetooth: http://nxt.ivorycity.com
   Instructions for serial service: http://wass.homelinux.net/howtos/Comm_How-To.shtml 

  2.3.3 - The COM port serial service (Mac OSX)
    1. Pair your NXT and your computer with the Bluetooth setup assistant.
    2. Go to "Open Bluetooth Preferences," select "Edit Serial Ports" for your 
    NXT and name it. This should create a new serial port, /dev/tty.NXTPORTNAME
    3. In the file icommand.properties set the value of nxtcomm to the value of your serial port.
    4. Put the file icommand.properties into your home directory, or your working directory.
    5. To check the location and contents of the file, execute the command: java -jar icommand.jar
      
    Alternate MacOSX:
    1. Set up the NXT with the computer, and establish a serial channel to
    it using the Bluetooth setup utility on OS X. You can verify that this
    is set up by listing the contents of the /dev/ directory
    e.g. Typing "ls" shows "tty.NXT_1", which is what was defined as the connection in the BT tool.
    2. In the file icommand.properties set the value of nxtcomm to the value of your serial port, /dev/tty.NXT_1
    3. Put the file icommand.properties into your home directory, or your working directory.
    4. To check the location and contents of the file, execute the command: java -jar icommand.jar

  2.4 - Running a test
    1. Make sure your NXT brick is paired with your computer first.
    2. Make a simple 2-wheeled robot (or hook motors to port A and B).
    3. Make sure the NXT is on and run the RemoteControl.class program from the samples directory. Use the arrow keys to steer it around.
When you run a Java program using iCommand it takes about five seconds before Bluetooth connectivity is established. You will see the <> symbol on your NXT screen when it connects. After the initial connection, commands are near instantaneous, unless you NXTCommand.setVeryfy(true).

  2.5 - Vision Setup
    Use these instructions only if you own a webcam and intend to use the 
    classes in the icommand.vision package.
    1. You need to set up yet another annoying JAR file. It's called 
    the Java Media Framework API:
    http://java.sun.com/products/java-media/jmf/
    2. Make sure your camera is plugged into your computer (and turned on if 
    appropriate) then run the Java Media Framework install program. Will take 
    a while to detect camera (few minutes), even on fast system. Give it time. 
    Reboot when it tells you.
    3. The JMF setup will add the classpath automatically, but you still need 
    to add it to Eclipse. Go to Project, Properties, Buildpath, ... and add 
    c:\Program Files\JMF1.x\JMF.jar.  <-- use exact path it installed to. 
    4. 5. If using Eclipse, you need to give it access to the native DLL's.
    Click + to expand and add the following to the Native Library setting:
    C:\WINDOWS\system32 (or don't let it copy into this directory on install)
    5. Not done yet. You need to set add a video.properties file to define 
    your camera. To find your camera, go to Program Files, Java Media FrameWork, 
    JMStudio. In JMStudio select File, Preferences. 
    Click Capture Devices tab. Highlight the image capture name and copy/paste 
    the text. Properties looks as follows:
		video-device-name=vfw:Microsoft WDM Image Capture (Win32):0
		sound-device-name=JavaSound audio capture
		resolution-x=160
		resolution-y=120
		colour-depth=24
(use Direrct Sound Capture over Java Sound Capture (doesnt work))
    
    2.6 Windows Mobile PDA Setup
    	1.Download and install the Mysaifu JVM:
		http://www2s.biglobe.ne.jp/~dat/java/project/jvm/download_en.html
		2.Download the package for commAPI support:
		http://prdownloads.sourceforge.jp/mysaifujvm/16920/javaxcomm.0.0.1.zip
		3.Copy "javaxcomm.dll" to "\Program Files\Mysaifu JVM\jre\bin" and 
		"javaxcomm.jar" to "\Program Files\Mysaifu JVM\jre\lib\ext" on your PDA.
		(You might need to create the "ext" directory.)
		4. Copy the .class files to the PDA.
		5. Establish the Bluetooth Connection between PDA and NXT
		6. Check which COM PORT bluetooth is using (WM2003): Tap the Bluetooth icon, and then go to Bluetooth
		Settings -> Tab Services, select Serial Port and press Advanced and write down the value of Outbound COM
		PORT field.
		7. Edit the file "icommand.properties" and set the value of your COM port followed by a colon ":".
		(e.g. COM6: for COM6). Transfer the file to the same directory with your .class files on the PDA.
		8. Modify the icommand.properties file to use the Java Communication API instead of RXTX. (Need more detail on this.)
		9. Run your application not forgetting to include the "new" icommand.jar to your CLASSPATH.
		
3.0 - Troubleshooting
  3.0 - If you get "java.lang.NullPointerException" it probably means you didn't call NXTCommand.open(). When your program is done, make sure to call NXTCommand.close() otherwise it won't end.
  3.1 - If you see something like: Exception in thread "main" java.lang.NoClassDefFoundError: 
gnu/io/PortInUseException, this means you haven't set up bluecove.jar (or RXTX.jar) in the classpath setting. See section 2.
  3.2 - If you see "java.lang.UnsatisfiedLinkError: no rxtxSerial in java.library.path thrown while loading gnu.io.RXTXCommDriver. -- Exception in thread "main" java.lang.UnsatisfiedLinkError: no rxtxSerial in java.library.path" See 2.2 step 3.
  3.3 If you see "gnu.io.NoSuchPortException
	at gnu.io.CommPortIdentifier.getPortIdentifier" This means you probably chose the wrong COM number in your NXTCOMM setting. See 2.3.
  3.4 If the program just hangs when you send a command, and you don't see the <> on the NXT LCD, you probably chose the wrong COM number. Stop your program, turn off/on your NXT and go back to 2.3 and try another. 
  3.5 If your program works the first time, but subsequent execution attempts result 
  in a "Port In Use" message, you probably forgot the NXTComm.close(); at the end of 
  your program. You'll have to stop the Eclipse program manually, since the JVM is still probably running. (CLick the button with the red square.) Also, turn your NXT off and back on.
  3.6 If you notice problems with the Lego NXT-G software and/or want to restart everything from scratch, you can delete all of the COM ports you see in Device manager (see 2.3.1 Windows - you probably have to disable the ports before uninstalling), then run the Lego software again and it will install the COM ports. 
  3.7 The Bluetooth SPP will not work with an application installed by the X10 
  camera (X10Nets.exe) running at the same time. This applies to the regular Lego software too.
  Hit CTRL-ALT-DEL to end X10Nets.exe.  
  3.8 - If you see "Port in use exception" it might be because you already established
  a Bluetooth connection. Don't try to establish the bluetooth connection
  yourself. Just run the program and the RXTX software will do it, otherwise
  you will get port in use exception.

4.0 - Change Log

  Changes for 0.7 - January 10, 2008
- Remembered to include Bluez package for Linux users
- Fixed bug with Lego Communication Protocol (required leJOS NXJ fix first)
- Motor API is closer to leJOS NXJ now

  Changes for 0.6 - September 3, 2007
- Added Bluecove (Windows) and Bluez (Linux) support
- Changed interface to make it more similar to leJOS NXJ
- Changed icommand.nxt.comm classes around, now uses NXTCommFactory
- Added Windows Mobile PDA setup instructions using Mysaifu JVM and Java Communications API.
- Added support for NRLink adapter by Mindsensors.com.
- Add Vision package sample to detect motion, play sound.
- Added Sun Java Communications API (javax.comm) support as alternative to RXTX.

  Changes made to 0.5 - Oct. 29, 2006
- BUG FIXED File methods using String commands are now working for Linux and MacOSX.
- Added Sensor wrappers. e.g. Light lightsensor = new Light(Sensor.S1);
- Changed Sound to Speaker because Sound now used for Sound Sensor.
- Added Lawrie's Vision package from leJOS.
- Added Navigation package from leJOS and added prelim ServoNavigator and CompassNavigator.
- Replaced Motor.setPower() to Motor.setSpeed()
- Added Motor.rotateTo() command.
- Added calibration methods to Ultrasonic
- Added SyncMotors class for synchronizing two motors.
- Added CompassSensor class for mindsensors.com compass.
- Added Ultrasonic.getDistances() to return multiple pings.
- Improved stability of I2C and Ultrasonic method calls.
- Changed UltrasonicSensor to Ultrasonic.
- Changed I2CSensor.getValues() to read all 8 values in one call.

  Changes made to 0.4 - Sep-22-2006:
- Added I2CSensor and UltrasonicSensor support.
- Changed API so it duplicates architecture of leJOS API (static calls).
- iCommand now reads the COM port using the environment variable NXTCOMM.
- Fixed bug in Motor.stop() so it now stops dead instead of floating.
- Kludge to make motor stop dead after tacho limit with Motor.forward(int) and Motor.backward(int)
- Added an NXT class with methods for brick name, running Lego executables, checking versions, checking memory.
- Proper tune for Melody sample.
- Added a (bad looking) GUI app called NXTDirect for controlling motors and sensors in the samples directory.

  Changes made to 0.3 - Aug-23-2006:
- Fixed bug where NXT brick had to be shut off/on after each program execution (still not fully resolved)
- Added optional verification of all commands
- Added more commands to Motor classes
- Completed all Direct Commands.
- Added commands for uploading/downloading files to NXT.
- Made a sample directory.

  Changes made to 0.2 - Aug-13-2006:
- Added packages and JAR file
- Added Motor, Sensor, Battery, Sound classes in icommand.platform.nxt

  Released 0.1 - Aug-4-2006
- raw commands using NXT Bluetooth protocol

5.0 - Future Improvements
  - Fix problems with API docs - many are cut off due to syntax. e.g. compass
  - More I2C problems. Someone wrote: 
  "I found the problem: if I do NXTCommand.setVerify(true) before  
anything else, it now works. This seems to be a necessary step (if  
it's in the documentation somewhere, I must have overlooked it)."
	I think this problem is caused by firmware bug making it need a 30 ms delay 
	between commands to work reliably. setVerify() must delay it just enough.
  - Ultrasonic.getDistances() no longer works (string bug fix?)
  - Ultrasonic.setRange() method (increases accuracy with less range)

- Java Technology for the Wireless Industry 1.0 (JSR-185)
- Wireless Messaging API 1.1 (JSR-120)
- Change Motor to Servo then create Motor class for RCX motors?
- BUG where setPower() makes motor stop working? Couldn't replicate.
- Method to detect load bearing on motors
- Method to determine motor speed.
- Add float values for Ultrasonic.getDistance() - more accuracy, less range by changing divisor from 14 to 2 (?).  
- Enable remaining System commands: IO-Map Access commands, openWriteLinear, openReadLinear, openWriteData, openAppendData, boot, bluetoothFactoryReset, message?
- Add package for PC side speech recognition and synthesis?
- Improve accuracy of Motor.forward/backward(tacho) and SyncMotors.left/right(tacho)
- Better samples - Spruce up sorry GUI for NXTDirect. Make better control panel with battery polling, keepalive.
- LCD control by writing directly to memory location for display.
- Put Sensor and Motor constants in seperate interface.
- Kludge: Motor.forward(long) doesn't truly use long internally. Concats the int.
- Timeout feature if NXT takes too long to connect or reply? Doesn't seem to be a problem.
- Add multiple brick support. The Lego software sets up 3 or 4 Bluetooth COM ports, possibly to control 3 bricks. Rohit Singh knows something about this (leJOS mailing list)
- USB support using either jUSB nxt.natulte.net or Java LibUsb-Win32 wrapper http://inf.ntb.ch/infoportal/help/topic/ch.ntb.infoportal/projects.html.
- More unified error handling system for methods (RuntimeExceptions that don't have
to be caught?)
- Uniform documentation for all methods.
- Get rid of some kludges in the code, specifically array/string manipulation in NXTCommand.
- Perhaps add tools to API for converting sound files to RSO, MIDI to RSO, Gfx converting.
- Abstraction for Master-Slave NXT bricks, allowing easy control of 6 or more motors
as though all part of one brick. NXTMaster nxt = new NXTMaster(NXT slave);
- Support for multiplexors and sensors from mindsensors.com and hitechnic.com. Try to keep implementation transparent, consistent. 

6.0 Licensing
  This software uses the GPL. More information can be found at http://www.gnu.org/copyleft/gpl.html
  NOTE: This does not necessarily mean the authors of this package endorse any ideological beliefs expressed in
  the GPL.

7.0 - Contact Information
Brian Bagnall - bbagnall@mts.net
Questions/comments - www.lejos.org/forum