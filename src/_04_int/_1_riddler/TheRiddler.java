package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		String answer = JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		if (answer.equals("Meat")) {
			JOptionPane.showMessageDialog(null, "Correct! You get a point.");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was wrong. Next question.");
		}
		String answe = JOptionPane.showInputDialog("What is always on its way but never arrives?");
		if (answe.equals("Tomorrow")) {
			JOptionPane.showMessageDialog(null, "Correct! You get a point.");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was wrong. Next question.");
		}
		String answ = JOptionPane.showInputDialog("I am an odd number. Take away a letter and I become even. What number am I?");
		if (answ.equals("Seven")) {
			JOptionPane.showMessageDialog(null, "Correct! You get a point.");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, that was wrong. Next question.");
		}

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

