/*
 * File name: RobotFace
 * --------------------
 * This program is draw a robot face.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram{
	public void run(){
		GRect face = new GRect(250, 60, 200, 300);
		face.setFilled(true);
		face.setColor(Color.GRAY);
		GOval eye1 = new GOval(285, 135, 30, 30);
		GOval eye2 = new GOval(385, 135, 30, 30);
		eye1.setFilled(true);
		eye1.setColor(Color.ORANGE);
		eye2.setFilled(true);
		eye2.setColor(Color.ORANGE);
		GRect nose = new GRect(345, 195, 10, 30);
		nose.setFilled(true);
		nose.setColor(Color.BLACK);
		GRect mouth = new GRect(285, 275, 135, 35);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(face);
		add(eye1);
		add(eye2);
		add(nose);
		add(mouth);
	}
}
