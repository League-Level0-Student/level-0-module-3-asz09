
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?
		String banana = JOptionPane.showInputDialog(null,"do you like bananas?");
		if(banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
		}
				String feelings = JOptionPane.showInputDialog("Why don't you like bananas?");
				if(feelings.equals("yes")) {
					JOptionPane.showInputDialog("What is your favorite hobby?");
					
					
						
					}
					
					
				}
		
			}
		
	
	

			