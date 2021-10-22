package _11_whack_a_mole;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mole implements ActionListener {
	
	JButton mole;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	GridLayout grid = new GridLayout(6,4);
	Random ran = new Random();
	
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
	frame.dispose();
	frame=new JFrame();
	panel=new JPanel();
	setup();
}
}
