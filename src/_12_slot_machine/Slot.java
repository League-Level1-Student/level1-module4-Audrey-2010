package _12_slot_machine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel alsolabel = new JLabel();
	JLabel otherlabel = new JLabel();
	Random bop = new Random();
	
	String one = "pixel.png";
	String two = "pixel2.png";
	String three = "pixel3.png";
	
	Icon purple;
	Icon cyan;
	Icon yellow;
	
void setup() {
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	panel.add(alsolabel);
	panel.add(otherlabel);
	bop.nextInt(20);
	
	frame.setTitle("step right up and try your luck");
	button.setText("spinnnn");
	
	yellow = loadImageFromComputer(one);
	
	cyan = loadImageFromComputer(two);
	purple = loadImageFromComputer(three);
	
	changeIcons();
	
	button.addActionListener(this);
	
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}

void changeIcons() {
	randomMaker(label);
	randomMaker(otherlabel);
	randomMaker(alsolabel);
	//  \(--)/
	//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
}

void randomMaker(JLabel x) {
	int number = bop.nextInt(3);
	if(number==0) {
		x.setIcon(yellow);
	}
	if(number==1) {
		x.setIcon(cyan);
	}
	if(number==2) {
		x.setIcon(purple);
	}
}

public Icon loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return icon;
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(label.equals(alsolabel) && label.equals(otherlabel) && alsolabel.equals(otherlabel)) {
		JOptionPane.showMessageDialog(null, "you win :)");
	}
		
	
	
	changeIcons();
}
}
//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