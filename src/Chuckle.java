import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener, MouseListener {
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.show();
		frame.setTitle("haha");
		
		JPanel panda = new JPanel();
		
		
		frame.add(panda);
		
		JButton button = new JButton();
		JButton bear = new JButton();
		
		button.setText("joke");
		bear.setText("punchline");
		
		panda.add(button);
		panda.add(bear);
		
		frame.pack();
		
		button.addActionListener(this);
		bear.addMouseListener(this);
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "haha");
		//if(event.getSource() == jokeButton)
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "haha");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
