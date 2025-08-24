package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String j = "His feet.";
	String l = "His looks.";
	String m = "Her quick thinking.";
	String o = "Nothing. There is nothing remarkable about him. Just a chill guy.";
	
	while (true) {
		
		String answer = JOptionPane.showInputDialog("Who do you want to find out more about? (John, Lamelo, Marissa, or Ollie)");
		if (answer.equals("John")) { 
			JOptionPane.showMessageDialog(null, "The most remarkable thing about John is: " + j);
			break;
		if (answer.equals("Lamelo")) { 
			JOptionPane.showMessageDialog(null, "The most remarkable thing about Lamelo is: " + l);	
			break;
		if (answer.equals("Marissa")) { 
			JOptionPane.showMessageDialog(null, "The most remarkable thing about Marissa is: " + m);
			break;
		if (answer.equals("Ollie")) { 
			JOptionPane.showMessageDialog(null, "The most remarkable thing about Ollie is: " + o);
			break;
		}
		else {
			JOptionPane.showMessageDialog(null, "Only choose from one of the 4 people listed.");
		}
		
		
		
		
	

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 



