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
	
	int count = 0;
	int count1 = 0;
	int count2 = 0;
	
	int youwon = 0;
	
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
	//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
	//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   (8)
}

void randomMaker(JLabel x) {
	int number = bop.nextInt(3);
	if(number==0) {
		x.setIcon(yellow);
		count = count+1;
	}
	if(number==1) {
		x.setIcon(cyan);
		count = count+2;
	}
	if(number==2) {
		x.setIcon(purple);
		count = count+3;
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
	if(count==3) {
		JOptionPane.showMessageDialog(null, "you won! :)))");
		youwon = youwon+1;
		JOptionPane.showMessageDialog(null, "you won "+youwon+" times so far");
		
	}
	if(count==6) {
		JOptionPane.showMessageDialog(null, "you won! :)))");
		youwon = youwon+1;
		JOptionPane.showMessageDialog(null, "you won "+youwon+" times so far");
		
	}
	if(count==9) {
		JOptionPane.showMessageDialog(null, "you won! :)))");
		youwon = youwon+1;
		JOptionPane.showMessageDialog(null, "you won "+youwon+" times so far");
		
	}
	//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
	
	changeIcons();
}
}
//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
