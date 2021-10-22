package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20);
	JButton button = new JButton();

	JLabel notText = new JLabel();
	PigLatinTranslator translator = new PigLatinTranslator();
	
void setup(){

	
	frame.add(panel);
	panel.add(button);
	panel.add(text);
	panel.add(notText);
	
	button.setText("translate");
	frame.setTitle("the pig translator");
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	
	button.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String latin= text.getText();
	String notpiglatin = translator.translate(latin);
	notText.setText(notpiglatin);
	frame.pack();
}



}
