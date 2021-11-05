package _11_whack_a_mole;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mole implements ActionListener {
	
	JButton mole;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	GridLayout grid = new GridLayout(6,4);
	Random ran = new Random();
	int howmanymoles;
	
	void setup() {
	frame.add(panel);
	panel.setLayout(grid);
	drawButtons();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setTitle("ya like moles");

}
 
void drawButtons() {
	
	int whack = ran.nextInt(24);

	for(int i = 0; i<24; i++) {
	JButton button = new JButton();
	panel.add(button);
	button.addActionListener(this);
	
	if(whack==i) {
		mole=button;
		button.setText("mole!");
	}
	
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == mole) {
		System.out.println("mole!");
		
		howmanymoles=howmanymoles+1;
	}
	
	else {
		System.out.println("not mole");
	}
	
	frame.dispose();
	frame=new JFrame();
	panel=new JPanel();
	setup();
	
	if(howmanymoles==10) {
		private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}
	}
	
}
}
