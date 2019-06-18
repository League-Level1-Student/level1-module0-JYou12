package _01_houses;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();
	static int small = 60;
	static int medium = 120;
	static int large = 250;
	
public static void main(String[] args) {

	
	bob.setX(0);
	bob.setSpeed(500);
	bob.hide();
	bob.penDown();
	
	
	house(small, Color.red);
	house(medium, Color.orange);
	house(large, Color.PINK);
	house(medium, Color.YELLOW);
	house(small, Color.white);
	house(medium, Color.MAGENTA);
	house(large, Color.CYAN);
	house(small, Color.RED);
	house(medium, Color.yellow);
	house(large, Color.ORANGE);
	
	
}

public static void house(int height, Color color) {
	bob.setPenColor(color);
	bob.move(height);
	
	if (height == large) {
drawFlatRoof();
	}else {
drawPointyRoof();
	}
	
	bob.move(height);
	bob.setPenColor(Color.GREEN);
	bob.turn(-90);
	bob.move(40);
	bob.turn(-90);
}

public static void drawPointyRoof() {
	bob.turn(45);
	bob.move(20);
	bob.turn(90);
	bob.move(20);
	bob.turn(45);
}

public static void drawFlatRoof() {
	bob.turn(90);
	bob.move(40);
	bob.turn(90);
}

}
