import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawHouse extends GraphicsProgram{
	public void run(){
		add(new GRect(200, 150, 300, 200));
		add(new GLine(200, 150, 350, 50));
		add(new GLine(350, 50, 500, 150));
		add(new GRect(325, 200, 50, 150));
		add(new GRect(225,175, 75, 75));
		add(new GRect(400,175, 75, 75));
		add(new GOval(360, 260, 10, 10));
	}
}
