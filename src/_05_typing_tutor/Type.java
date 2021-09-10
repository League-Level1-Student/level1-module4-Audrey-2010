package _05_typing_tutor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Type {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	currentLetter=generateRandomLetter;
	JLabel label = new JLabel();
	label.setText("");
}
