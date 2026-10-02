/**
 *	Target.java
 *
 *	To compile Linux:	javac -cp .:acm.jar Target.java
 *	To execute Linux:	java -cp .:acm.jar Target
 *	To compile MS Powershell:	javac -cp ".;acm.jar" Target.java
 *	To execute MS Powershell:	java -cp ".;acm.jar" Target
 *
 *	@author	Sanvitti Shah
 *	@since	September 23th, 2026
 */
 
/*	All package classes should be imported before the class definition.
 *	"java.awt.Color" means package java.awt contains class Color. */
import java.awt.Color;
import acm.graphics.GCanvas;

/*	The following libraries are in the acm.jar file. */
import acm.program.GraphicsProgram;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.graphics.GRectangle;

public class Target extends GraphicsProgram {
	
	/*	All fields and constants should be declared here.
	 *	Only constants (final) are initialized here. */
	 private GOval [] circle;
	 private final int DIAMETER = 500; 
	 private int width;
	 private int height;

	
	/**	The init() method is executed before the run() method.
	 *	All initialization steps should be performed here.
	 */
	public void init() {
		GCanvas canvas = getGCanvas(); 
		circle = new GOval[5];
		width = canvas.getWidth(); //this method gets the width of the canvas, not the width of the circle
		height = canvas.getHeight(); //this method gets the height of the canvas, not the height of the circle

	}
	
	/**	The run() method is executed after init().
	 *	The bulk of the program should be performed here.
	 *	Exercise hint: Use one-dimensional arrays for the GOval's and GRect's.
	 */
	public void run() {
		for(int i = 0; i < 5; i++)
		{
			circle[i] = new GOval(width/2-(DIAMETER-75*i)/2, height - (DIAMETER - 75*i)/2, DIAMETER-75*i, DIAMETER-75*i);
			//this checks to see which circle "number" it is and then based on that it sets the color to red or white
			if(i == 0 || i == 2 || i == 4)
			{
				circle[i].setFillColor(Color.RED);
			}
			else if(i == 1 || i == 3)
			{
				circle[i].setFillColor(Color.WHITE);
			}
			circle[i].setFilled(true);
			add(circle[i]);
		}
		for(int i = 0; i < 5; i++)
		{
			circle[i] = new GOval(width/2-(DIAMETER-75*i)/2, height - (DIAMETER-75*i)/2, DIAMETER-75*i, DIAMETER-75*i);
			//this makes the circles show up, there are 5 circles total so i used a for loop to loop 5 times and also each of
			//the five times we make a new circle with different length and width and x,y points. There was also 
			//different colors for each rings to make the target color.
		}
	}

}
