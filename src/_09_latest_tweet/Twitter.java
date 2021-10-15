package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Twitter implements ActionListener {
//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
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JButton button = new JButton();
void setup() {
	frame.add(panel);
	panel.add(button);
	button.setText("into the twitterverse :)");
	frame.setTitle("the amazing tweet retriever");
	
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null,"tweet, tweet");
}
	
}
