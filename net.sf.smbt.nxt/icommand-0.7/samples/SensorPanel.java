import icommand.nxt.comm.*;

import java.awt.*;
import java.awt.event.*;

public class SensorPanel extends Panel implements ActionListener, ItemListener {

	private static final long serialVersionUID = 8881330; // Just picked random #. No idea.
	
	private static final NXTCommand nxtCommand = NXTCommand.getSingleton();

	CheckboxGroup portSelect;
		
	TextField portText;
	TextField modeText;
	TextField typeText;
	TextField validText;
	TextField rawADText;
	TextField normalizedADText;
	TextField scaledText;
	TextField calibratedText;
	TextField calibratedValueText;
	
	Choice typeChoice;
	Choice modeChoice;
	
	public SensorPanel() {
		this.setLayout(new GridLayout(2,1));
		makeGUI();
		getSensorValues();
	}
	
	// Here is where command is sent to NXTCommand
	public void setSensorMode() {
		
		int port = Integer.parseInt(portText.getText());
		byte sensorType = (byte)Byte.parseByte(typeText.getText(), 16);
		byte sensorMode = (byte)Short.parseShort(modeText.getText(), 16);
		
		nxtCommand.setInputMode(port, sensorType, sensorMode);
		System.out.println("Port mode sent: T " + sensorType + "  M " + sensorMode);
	}
	
	public void getSensorValues() {
		// 1. Check which sensor selected
		String name = portSelect.getSelectedCheckbox().getLabel();
		int portNumber = 0;
		if(name == "2")
			portNumber = 1;
		if(name == "3")
			portNumber = 2;
		if(name == "4")
			portNumber = 3;
		
		// 2. refreshData()
		InputValues vals = nxtCommand.getInputValues(portNumber);
		refreshData(vals);
	}
	
	public void refreshData(InputValues vals) {
		
		
		modeText.setText(Integer.toHexString((byte)vals.sensorMode));
		typeText.setText(Integer.toHexString((byte)vals.sensorType));
		// !! Figure out which mode Choice to select?
		// !! Figure out which type Choice to select?
				
		portText.setText("" + vals.inputPort);
		validText.setText("" + vals.valid);
		rawADText.setText("" + vals.rawADValue);
		normalizedADText.setText("" + vals.normalizedADValue);
		scaledText.setText("" + vals.scaledValue);
		calibratedText.setText("" + vals.isCalibrated);
		calibratedValueText.setText("" + vals.calibratedValue);
		
	}
	
	public void makeGUI() {	
		
		// Port selection components:
		Panel portPanel = new Panel(new GridLayout(2,6));
		portSelect = new CheckboxGroup();
		Checkbox check1 = new Checkbox("1", portSelect, true);
		Checkbox check2 = new Checkbox("2", portSelect, false);
		Checkbox check3 = new Checkbox("3", portSelect, false);
		Checkbox check4 = new Checkbox("4", portSelect, false);
		
		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		check4.addItemListener(this);
			
		portPanel.add(new Label("Port Port: "));
		portPanel.add(check1);
		portPanel.add(check2);
		portPanel.add(check3);
		portPanel.add(check4);
		
		Button start = new Button("Set Port");
		start.addActionListener(this);
		portPanel.add(start);
		
		this.add(portPanel);
		
		// Type and Mode components:
		modeChoice = new Choice();
		modeChoice.add("RAWMODE = 0x00");
		modeChoice.add("BOOLEANMODE = 0x20");
		modeChoice.add("TRANSITIONCNTMODE = 0x40");
		modeChoice.add("PERIODCOUNTERMODE = 0x60");
		modeChoice.add("PCTFULLSCALEMODE = 0x80");
		modeChoice.add("CELSIUSMODE = 0xA0");
		modeChoice.add("FAHRENHEITMODE = 0xC0");
		modeChoice.add("ANGLESTEPSMODE = 0xE0");
		modeChoice.add("SLOPEMASK = 0x1F");
		modeChoice.add("MODEMASK = 0xE0");
		modeChoice.addItemListener(this);
		
		typeChoice = new Choice();
		typeChoice.add("NO_SENSOR = 0x00");
		typeChoice.add("SWITCH = 0x01");
		typeChoice.add("TEMPERATURE = 0x02");
		typeChoice.add("REFLECTION = 0x03");
		typeChoice.add("ANGLE = 0x04");
		typeChoice.add("LIGHT_ACTIVE = 0x05");
		typeChoice.add("LIGHT_INACTIVE = 0x06");
		typeChoice.add("SOUND_DB = 0x07");
		typeChoice.add("SOUND_DBA = 0x08");
		typeChoice.add("CUSTOM = 0x09");
		typeChoice.add("LOWSPEED = 0x0A");
		typeChoice.add("LOWSPEED_9V = 0x0B");
		typeChoice.add("NO_OF_SENSOR_TYPES = 0x0C");
		typeChoice.addItemListener(this);
		
		//Panel modePanel = new Panel(new GridLayout(1,4));
		// Trying out portPanel instead of modepanel
		portPanel.add(new Label("Mode"));
		portPanel.add(modeChoice);
		portPanel.add(new Label("Type"));
		portPanel.add(typeChoice);
		//this.add(modePanel);

		// INFORMATION:
		Panel infoPanel = new Panel(new GridLayout(10,2));
		
		portText = new TextField(3);
		portText.setEnabled(false);
		typeText = new TextField(4);
		modeText = new TextField(4);
		validText = new TextField(7);
		validText.setEnabled(false);
		rawADText = new TextField(7);
		rawADText.setEnabled(false);
		normalizedADText = new TextField(7);
		normalizedADText.setEnabled(false);
		scaledText = new TextField(7);
		scaledText.setEnabled(false);
		calibratedText = new TextField(7);
		calibratedText.setEnabled(false);
		calibratedValueText = new TextField(7);
		calibratedValueText.setEnabled(false);
				
		infoPanel.add(new Label("Input Port (0 to 3)"));
		infoPanel.add(portText);
		infoPanel.add(new Label("Port Type  0x"));
		infoPanel.add(typeText);
		infoPanel.add(new Label("Port Mode  0x"));
		infoPanel.add(modeText);
		infoPanel.add(new Label("Valid?"));
		infoPanel.add(validText);
		infoPanel.add(new Label("Raw AD Value"));
		infoPanel.add(rawADText);
		infoPanel.add(new Label("Normalized AD Value"));
		infoPanel.add(normalizedADText);
		infoPanel.add(new Label("Scaled Value"));
		infoPanel.add(scaledText);
		infoPanel.add(new Label("Calibrated?"));
		infoPanel.add(calibratedText);
		infoPanel.add(new Label("Calibrated Value"));
		infoPanel.add(calibratedValueText);
		
		Button refresh = new Button("Read Port");
		refresh.addActionListener(this);
		infoPanel.add(refresh);
				
		this.add(infoPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);
		if (command == "Set Port")
			setSensorMode();
		if (command == "Read Port")
			getSensorValues();
	}
	
	public void itemStateChanged(ItemEvent e) {
		String item = e.getItem().toString();
		
		// Refresh data if Port switched:
		if(item == "1"|item == "2"|item == "3"|item == "4")
			getSensorValues();
		else {
			// Change mode and type values if Choice changes:
			typeText.setText(typeChoice.getSelectedItem().substring(typeChoice.getSelectedItem().length() - 2));
			modeText.setText(modeChoice.getSelectedItem().substring(modeChoice.getSelectedItem().length() - 2));
		}
	}
}