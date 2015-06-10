import icommand.nxt.comm.*;

import java.awt.*;
import java.awt.event.*;

// NOTES: For Motor, need to have one panel for settings you are sending,
// one panel for just motor output. Refreshes regularly or after each command.
// Maybe button on motor side that says "Sync" NXT Settings


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MotorPanel extends Panel implements ActionListener, ItemListener {
	
	private static final NXTCommand nxtCommand = NXTCommand.getSingleton();

	static final long serialVersionUID = 8891978; // Just picked random #. No idea.
	
	CheckboxGroup motorSelect;
	
	TextField runText;
	TextField modeText;
	TextField regText;
	
	TextField portText;
	TextField powerText;
	TextField turnRatioText;
	TextField tachoCountText;
	TextField tachoLimitText;
	TextField rotationText;
	TextField blockText;
	
	Checkbox idleCheck;
	Checkbox rampUpCheck;
	Checkbox runningCheck;
	Checkbox rampDownCheck;
	
	Checkbox modeMotorOn;
	Checkbox modeBrake;
	Checkbox modeRegulated;
	
	Checkbox regulationModeIdle;
	Checkbox regulationModeSpeed;
	Checkbox regulationModeSync;
	
	public MotorPanel() {
		this.setLayout(new GridLayout(3,2));
		makeGUI();
		getOutputCommand();
	}
	
	// Here is where command is sent to NXTCommand
	public void sendMotorCommand() {
		// 1. Read motorA, motorB, or motorC settings from GUI Components
		int port = Integer.parseInt(portText.getText());
		byte power = Byte.parseByte(powerText.getText());
		int mode = Integer.parseInt(modeText.getText());
		int regulationMode = Integer.parseInt(regText.getText());
		int turnRatio = Integer.parseInt(turnRatioText.getText());
		int runState = Integer.parseInt(runText.getText());
		int tachoLimit = Integer.parseInt(tachoLimitText.getText());
		
		nxtCommand.setOutputState(port, power, mode, regulationMode, turnRatio, runState, tachoLimit);
		System.out.println("Motor command sent");
	}
	
	public void getOutputCommand() {
		// 1. Check which motor selected
		String name = motorSelect.getSelectedCheckbox().getLabel();
		int portNumber = 0;
		if(name == "B")
			portNumber = 1;
		if(name == "C")
			portNumber = 2;
		
		// 2. refreshData()
		OutputState motorState = nxtCommand.getOutputState(portNumber);
		refreshData(motorState);
	}
	
	public void refreshData(OutputState motor) {
		runText.setText(Integer.toHexString(motor.runState));
		// Figure out which check box to check
		idleCheck.setState(motor.runState == 0x00);
		rampUpCheck.setState(motor.runState == 0x10);
		runningCheck.setState(motor.runState == 0x20);
		rampDownCheck.setState(motor.runState == 0x40);
				
		modeText.setText(Integer.toHexString(motor.mode));
		// Figure out which check box to check
		modeMotorOn.setState((motor.mode & 0x01) == 0x01);
		modeBrake.setState((motor.mode & 0x02) == 0x02);
		modeRegulated.setState((motor.mode & 0x04) == 0x04);
				
		regText.setText(Integer.toHexString(motor.regulationMode));
		// Figure out which check box to check
		regulationModeIdle.setState(motor.regulationMode == 0x00);
		regulationModeSpeed.setState(motor.regulationMode == 0x01);
		regulationModeSync.setState(motor.regulationMode == 0x02);
		
		portText.setText("" + motor.outputPort);
		powerText.setText("" + motor.powerSetpoint);
		turnRatioText.setText("" + motor.turnRatio);
		tachoCountText.setText("" + motor.tachoCount);
		tachoLimitText.setText("" + motor.tachoLimit);
		rotationText.setText("" + motor.rotationCount);
		blockText.setText("" + motor.blockTachoCount);
	}
	
	public void makeGUI() {				
		Panel motorPanel = new Panel(new GridLayout(4,1));
		motorSelect = new CheckboxGroup();
		Checkbox checkA = new Checkbox("A", motorSelect, true);
		Checkbox checkB = new Checkbox("B", motorSelect, false);
		Checkbox checkC = new Checkbox("C", motorSelect, false);
		checkA.addItemListener(this);
		checkB.addItemListener(this);
		checkC.addItemListener(this);
			
		Panel chooseMotor = new Panel(new GridBagLayout());
		chooseMotor.add(checkA);
		chooseMotor.add(checkB);
		chooseMotor.add(checkC);
		motorPanel.add(chooseMotor);
		
		Button start = new Button("Send Data");
		start.addActionListener(this);
		motorPanel.add(start);
		
		Button refresh = new Button("Refresh Data");
		refresh.addActionListener(this);
		motorPanel.add(refresh);
		
		Button resetTacho = new Button("Reset Rotations");
		resetTacho.addActionListener(this);
		motorPanel.add(resetTacho);
				
		this.add(motorPanel);
		
		// RUNSTATE components:
		CheckboxGroup g2 = new CheckboxGroup();
		Label runLabel = new Label("Run State"); // !! Change to selected Motor
		runText = new TextField(5);
		idleCheck = new Checkbox("IDLE (0x00)", g2, true);
		idleCheck.addItemListener(this);
		rampUpCheck = new Checkbox("RAMPUP (0x10)", g2, false);
		rampUpCheck.addItemListener(this);
		runningCheck = new Checkbox("RUNNING (0x20)", g2, false);
		runningCheck.addItemListener(this);
		rampDownCheck = new Checkbox("RAMPDOWN (0x40)", g2, false);
		rampDownCheck.addItemListener(this);
		
		Panel runStatePanel = new Panel(new GridLayout(6,1));
		runStatePanel.add(runLabel);
		runStatePanel.add(runText);
		runStatePanel.add(idleCheck);
		runStatePanel.add(rampUpCheck);
		runStatePanel.add(runningCheck);
		runStatePanel.add(rampDownCheck);
		this.add(runStatePanel);

		// MODE Components:
		Label modeLabel = new Label("Mode");
		modeText = new TextField(5);
		modeMotorOn = new Checkbox("MOTOR_ON (0x01)");
		modeBrake = new Checkbox("BRAKE (0x02)");
		modeRegulated = new Checkbox("REGULATED (0x04)");
		modeMotorOn.addItemListener(this);
		modeBrake.addItemListener(this);
		modeRegulated.addItemListener(this);
		
		Panel modePanel = new Panel(new GridLayout(5,1));
		modePanel.add(modeLabel);
		modePanel.add(modeText);
		modePanel.add(modeMotorOn);
		modePanel.add(modeBrake);
		modePanel.add(modeRegulated);
		this.add(modePanel);
		
		// REGULATION MODE components:		
		CheckboxGroup g1 = new CheckboxGroup();
		Label regLabel = new Label("Regulation Mode");
		regText = new TextField(5);
		regulationModeIdle = new Checkbox("IDLE (0x00)", g1, true);
		regulationModeSpeed = new Checkbox("MOTOR_SPEED (0x01)", g1, false);
		regulationModeSync = new Checkbox("MOTOR_SYNC (0x02)", g1, false);
		regulationModeIdle.addItemListener(this);
		regulationModeSpeed.addItemListener(this);
		regulationModeSync.addItemListener(this);
		
		Panel regModePanel = new Panel(new GridLayout(5,1));
		regModePanel.add(regLabel);
		regModePanel.add(regText);
		regModePanel.add(regulationModeIdle);
		regModePanel.add(regulationModeSpeed);
		regModePanel.add(regulationModeSync);
		this.add(regModePanel);

		// INFORMATION:
		Panel infoPanel = new Panel(new GridLayout(7,2));
		
		portText = new TextField(3);
		portText.setEnabled(false);
		powerText = new TextField(4);
		turnRatioText = new TextField(4);
		tachoCountText = new TextField(7);
		tachoCountText.setEnabled(false);
		tachoLimitText = new TextField(7);
		rotationText = new TextField(7);
		rotationText.setEnabled(false);
		blockText = new TextField(7);
		blockText.setEnabled(false);
		infoPanel.add(new Label("Output Port (0 to 2)"));
		infoPanel.add(portText);
		infoPanel.add(new Label("Power Set Point (-100 to 100)"));
		infoPanel.add(powerText);
		infoPanel.add(new Label("Turn Ratio :"));
		infoPanel.add(turnRatioText);
		infoPanel.add(new Label("Tacho Count :"));
		infoPanel.add(tachoCountText);
		infoPanel.add(new Label("Tacho Limit :"));
		infoPanel.add(tachoLimitText);
		infoPanel.add(new Label("Rotation Count :"));
		infoPanel.add(rotationText);
		infoPanel.add(new Label("Block Tacho Count :"));
		infoPanel.add(blockText);
		
		this.add(infoPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);
		if (command == "Send Data")
			sendMotorCommand();
		if (command == "Refresh Data")
			getOutputCommand();
		if (command == "Reset Rotations") {
			String name = motorSelect.getSelectedCheckbox().getLabel();
			int portNumber = 0;
			if(name == "B")
				portNumber = 1;
			if(name == "C")
				portNumber = 2;
			nxtCommand.resetMotorPosition(portNumber, false);
			getOutputCommand();
		}
			
	}
	
	public void itemStateChanged(ItemEvent e) {
		String item = e.getItem().toString();
		// Refresh output data if Motor switched
		if(item == "A"|item == "B"|item == "C")
			getOutputCommand();
		
		if(idleCheck.getState())
			runText.setText("" + 0x00);
		if(rampUpCheck.getState())
			runText.setText("" + 0x10);
		if(runningCheck.getState())
			runText.setText("" + 0x20);
		if(rampDownCheck.getState())
			runText.setText("" + 0x40);
		
		if(regulationModeIdle.getState())
			regText.setText("" + 0x00);
		if(regulationModeSpeed.getState())
			regText.setText("" + 0x01);
		if(regulationModeSync.getState())
			regText.setText("" + 0x02);
		
		int modeValue = 0;
		if(modeMotorOn.getState())
			 modeValue = modeValue + 0x01;
		if(modeBrake.getState())
			modeValue = modeValue + 0x02;
		if(modeRegulated.getState())
			modeValue = modeValue + 0x04;
		modeText.setText(Integer.toHexString(modeValue));
	}
}