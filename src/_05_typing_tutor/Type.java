package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Type implements KeyListener {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	char generateRandomLetter() { 
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
 
void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	currentLetter=generateRandomLetter();

	label.setText(String.valueOf(currentLetter));
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	//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
	frame.addKeyListener(this);
	panel.add(label);
	frame.add(panel);
	
	frame.setSize(100, 100);
}
public static void main(String[] args){
	Type tutor = new Type();
	tutor.setup(); 
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyChar()==currentLetter) {
		System.out.println("correct");
		panel.setBackground(Color.GREEN);
	}
	else {
		panel.setBackground(Color.RED);
	}
	currentLetter=generateRandomLetter();
	label.setText(String.valueOf(currentLetter));
	System.out.println(currentLetter);
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}