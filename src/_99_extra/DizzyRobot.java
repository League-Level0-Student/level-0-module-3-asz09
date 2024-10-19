
package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		// 1. Use the dance method below to make the robot spin.		
		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
	String spin = JOptionPane.showInputDialog("how dizzy do you want the robot to be");
int rotate = Integer.parseInt(spin);
dance(rotate);
	}

	/*****************   Use this method, DON'T CHANGE THE CODE BELOW  **************/
	
	static void dance(int numberOfSpins) {
		robot.setSpeed(40);
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(180);
		}
	}
}

