package _01_else_if._4_are_you_happy;

import javax.imageio.ImageIO;
import javax.swing.*;

public class AreYouHappy {

	public static void main(String[] args) {
	String feelings = JOptionPane.showInputDialog(null,"are you happy");
	if(feelings == "yes") {
		JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing.");
	}
	
	
	else {
		String morefeelings = JOptionPane.showInputDialog(null,"Do you want to be happy?");
		if(morefeelings == "yes") {
			JOptionPane.showMessageDialog(null, "Change Something");		
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
		
	}

}