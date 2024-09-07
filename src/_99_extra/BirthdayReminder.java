
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 23rd";
		String dadsBirthday = "June 21st";
		String myBirthday = "February 2nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		
	String input = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
	if (input.equals("mom")){
	JOptionPane.showMessageDialog(null,"June 23rd");	
	}
	if (input.equals("dad")){
		JOptionPane.showMessageDialog(null,"June 21st");	
	}		
		if (input.equals("anthony")){
			JOptionPane.showMessageDialog(null,"February 2nd");	
			
		}
	}

}



		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	




	
