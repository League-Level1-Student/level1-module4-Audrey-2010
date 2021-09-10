package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckel implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
void makeButtons(){
	JOptionPane.showMessageDialog(null, "makeButtons :)");
	
	JFrame pandasframe = new JFrame();
	JPanel popcornspanel = new JPanel();
	
	
	pandasframe.add(popcornspanel);
	popcornspanel.add(joke);
	joke.setText("joke");
	popcornspanel.add(punchline);
	punchline.setText("punchline");
	
	joke.addActionListener(this);
	punchline.addActionListener(this);
	pandasframe.show();
	pandasframe.pack();
}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	if(event.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "hi");
	}
	if(event.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "hi");
	}
}
}
