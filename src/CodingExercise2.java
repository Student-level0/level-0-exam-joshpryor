

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	

	String age = JOptionPane.showInputDialog("how old are you");
	int z = Integer.parseInt(age);
	if (z > 40) {
		JOptionPane.showMessageDialog(null, "you are too old to play this game");
	}
	
	
int i = 2017;
int f = Integer.parseInt(age);
int y = f = f - i;
JOptionPane.showMessageDialog(null, "you were born in " + y);
//int z = Integer.parseInt(age);
//if (z > 40) {
//	JOptionPane.showMessageDialog(null, "you are too old");
//}

}}





































