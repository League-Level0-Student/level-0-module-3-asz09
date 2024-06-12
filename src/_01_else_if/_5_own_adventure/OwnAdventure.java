package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure{




	public static void main(String[] args) {

		String story = JOptionPane.showInputDialog(null, "There was a boy called Dominic, he built a little cabin in the woods.");

		if(story.equals("okay")){
			JOptionPane.showMessageDialog(null,"Dominic is currently 13 years old, and he has lived in the cabin since he was 3. Every year, the cabin gets bigger.");


			JOptionPane.showMessageDialog(null,"In Maine, the weather was to become very poor in that summer. His house, built only of wood is no match.");
			JOptionPane.showMessageDialog(null,"Dominic found more wood, he covered the inside roof to prevent water. He continued to use more planks to build a door.");
			String question  = JOptionPane.showInputDialog("Would you like to quit reading, or move on. Say 'quit' to exit. Say 'continue' to move along");
			if (question.equals("quit")){
				System.exit(0);
			} else if(question.equals("continue")) {

				JOptionPane.showMessageDialog(null,"Dominic's upgrades proved to be a success. He got a bucket of water from a lake and dumped it on his roof. Nothing came through.");
				JOptionPane.showMessageDialog(null,"Dominic then got some hard plants to throw at his door. The door stayed firmly in place.");
				JOptionPane.showMessageDialog(null,"It began storming, and Dominic huddled inside his cabin. The door was staying in place and the roof is sending the rain off the side.");
				JOptionPane.showMessageDialog(null, "Are you still there? if you'd like to keep going, press OK.");
				String question1  = JOptionPane.showInputDialog("Would you like to quit reading, or move on. Say 'quit' to exit. Say 'continue' to move along");
				if (question1.equals("quit")){
					System.exit(0);

				}
				JOptionPane.showMessageDialog(null,"It soon became night, and Dominic got into his hammock. The rain gets harder every minute.");
				JOptionPane.showMessageDialog(null,"It soon became day, and he opened his eyes. Dominic is completely dry, he hops out of the hammock and goes outside.");
				JOptionPane.showMessageDialog(null,"He is in awe on how well the cabin held up, there is no damage. He says to himself, he is going to build a house.");
				JOptionPane.showMessageDialog(null,"Thank you for reading, the end......");


			}

		}


	}	


}



