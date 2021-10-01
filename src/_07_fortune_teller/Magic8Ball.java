package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	int number;

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random ran = new Random();
	
	number = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(number);
	// 4. Get the user to enter a question for the 8 ball
String question = JOptionPane.showInputDialog("what's your (yes or no) question?");
	// 5. If the random number is 0
if(number ==0) {
	JOptionPane.showMessageDialog(null, "yep");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if(number==1) {
	JOptionPane.showMessageDialog(null, "no");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if(number==2) {
	JOptionPane.showMessageDialog(null, "idk ask google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
if(number==3) {
	JOptionPane.showMessageDialog(null, ".__(--)_/`");
}
}
}
