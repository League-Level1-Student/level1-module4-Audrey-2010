package _12_slot_machine;


import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel alsolabel = new JLabel();
	JLabel otherlabel = new JLabel();
	
	String one = "pixel.png";
	String two = "pixel2.png";
	String three = "pixel3.png";
	
void setup() {
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	panel.add(alsolabel);
	panel.add(otherlabel);
	
	frame.setTitle("step right up and try your luck");
	button.setText("spinnnn");
	
	label = loadImageFromComputer(one);
	alsolabel = loadImageFromComputer(two);
	otherlabel = loadImageFromComputer(three);
	
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}


public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
}
//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