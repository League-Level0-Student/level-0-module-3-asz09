
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
	int random = new Random().nextInt(101);
	// 2. Print out the random variable above
	System.out.println(+random);
	
	for (int i = 10; i >= 1; --i) {
		
	
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
 String guess = JOptionPane.showInputDialog(null,"Guess a number from 1-100");
 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
 
		int answer = Integer.parseInt(guess);
			// 5. if the guess is correct
		
		
if (answer == random) {
	System.exit(0);
}
else if (answer > random){
	JOptionPane.showMessageDialog(null, "You have guessed a number way too high");
}
else if (answer < random){
	JOptionPane.showMessageDialog(null, "Your guess consists of a number that is way too low");
}
			
	}
// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			
			
			// 7. if the guess is high
				// 8. Tell them it's too high
}
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	

	private static void showInputDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

}


