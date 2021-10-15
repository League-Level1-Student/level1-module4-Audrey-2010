package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_thing implements ActionListener {
	int one;
	int two;
	
	double three;
	
	JFrame cookie = new JFrame();
	JPanel roll = new JPanel();
	
	JButton skittles = new JButton();
	JButton twix = new JButton();
	JButton snickers = new JButton();
	JButton kitkat = new JButton();
	JTextField cake = new JTextField(20);
	JTextField notcake = new JTextField(20);
	JLabel notlabel = new JLabel();
	
	
void setup() {
	
	
	
	
	cookie.add(roll);
	roll.add(kitkat);
	roll.add(skittles);
	roll.add(snickers);  
	roll.add(twix);
	roll.add(cake);
	roll.add(notcake);
	roll.add(notlabel);
	
	skittles.addActionListener(this);
	twix.addActionListener(this);
	snickers.addActionListener(this);
	kitkat.addActionListener(this);
	
	skittles.setText("add");
	twix.setText("sub");
	snickers.setText("multiply");
	kitkat.setText("divide");
	
	
	
	
	
	cookie.setVisible(true);
	cookie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	cookie.pack();
}

void add() {
three=one+two;
}

void sub() {
	three=one-two;
}

void multiply() {
	three=one*two;
}
void divide() {
	three=(double)one/two;
}

//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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	one=Integer.parseInt(cake.getText());
	two=Integer.parseInt(notcake.getText());
	
	
	if(e.getSource() == skittles) {
		add();
	}
	if(e.getSource() == twix) {
		sub();
	}
	if(e.getSource() == snickers) {
		multiply();
	}
	if(e.getSource() == kitkat) {
		divide();
	}
	notlabel.setText(String.valueOf(three));
	cookie.pack();
	
}
}
