package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig {
void setup(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20);
	JButton button = new JButton();

	JLabel notText = new JLabel();
	
	frame.add(panel);
	panel.add(button);
	panel.add(text);
	panel.add(notText);
	
	button.setText("translate");
	frame.setTitle("the pig translator");
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();

}
}
