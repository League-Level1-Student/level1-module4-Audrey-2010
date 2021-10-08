package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator_thing implements ActionListener {
	int one;
	int two;
	
	double three;
	
	JButton skittles = new JButton();
	JButton twix = new JButton();
	JButton snickers = new JButton();
	JButton kitkat = new JButton();
	
	
void setup() {
	JFrame cookie = new JFrame();
	JPanel roll = new JPanel();
	
	cookie.add(roll);
	roll.add(kitkat);
	roll.add(skittles);
	roll.add(snickers);  
	roll.add(twix);
	
	skittles.addActionListener(this);
	twix.addActionListener(this);
	snickers.addActionListener(this);
	kitkat.addActionListener(this);
	
	skittles.setText("add");
	twix.setText("sub");
	snickers.setText("multiply");
	kitkat.setText("divide");
	
	cookie.show(true);
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
	three=one/two;
}

//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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
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
}
}
