
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	
		
Robot rob = new Robot();	
String color = JOptionPane.showInputDialog(null,"What color do you want the robot to draw?");		
if (color.equals("red")) {
	rob.setPenColor(Color.red);
}
else if (color.equals("blue")) {
		rob.setPenColor(Color.blue);
}
else if (color.equals("green")) {
	rob.setPenColor(Color.green);
}
else if (color.equals("yellow")) {
	rob.setPenColor(Color.yellow);
}
else if (color.equals("orange")) {
	rob.setPenColor(Color.orange);
}
else if (color.equals("pink")) {
	rob.setPenColor(Color.pink);
}
else if (color.equals("grey")) {
	rob.setPenColor(Color.darkGray);
}
else if (color.equals("magenta")) {
	rob.setPenColor(Color.MAGENTA);
}
	
	
	
rob.penDown();
rob.setSpeed(50);
rob.move(100);
rob.turn(90);
rob.move(150);
rob.turn(90);
rob.move(150);
rob.turn(-90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(300);
rob.move(60);
rob.move(60);
rob.move(10);
rob.turn(60);
rob.turn(60);
rob.move(100);
rob.setSpeed(10000);
rob.turn(360);
rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);
rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360);rob.turn(360); rob.move(80);rob.move(60);rob.turn(120);
rob.move(30);	rob.move(30); rob.turn(80); rob.turn(180); rob.move(40); rob.turn(30); rob.move(70);;;
	
	
	
	
	
	}
}
