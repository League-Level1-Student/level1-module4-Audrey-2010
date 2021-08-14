package _01_nasty_surprise;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickOrTreat implements ActionListener, MouseListener {
void setup() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	//button:treat
	JButton otherButton = new JButton();
	//otherButton:trick
	frame.add(panel);
	panel.add(button);
	button.setText("treat");
	panel.add(otherButton);
	otherButton.setText("trick");
	
	button.addActionListener(this);
	//https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcKJ0EK7ziOVc8Tu4JOZb7SZ4KY3YX1jvAiA&usqp=CAU
	
	otherButton.addMouseListener(this);
	
	frame.pack();
	frame.setVisible(true);

}
public static void main(String[] args) {
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//treat
	
	showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcKJ0EK7ziOVc8Tu4JOZb7SZ4KY3YX1jvAiA&usqp=CAU");
	
	  
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	//trick
	
	
	showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQf0qWUbB6a7xaiX35mLTk6RpjCmtoRS2BqW-KvbxkiYvp_77aFq-6GALcQRLmNgglTVgY&usqp=CAU");
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


