//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		this(200, 200);
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xS, int yS) {
		super(x, y, w, h, col);
		xSpeed = xS;
		ySpeed = yS;
	}
	
	   
   //add the set methods
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	public int getXSpeed() {
		return xSpeed;
	}
	
	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
	public int getYSpeed() {
		return ySpeed;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  super.draw(window, Color.white);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
	  super.draw(window, super.getColor());

		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		if (toString().equals(obj.toString())) {
			return true;
		}
		return false;	}   

   //add the get methods

   //add a toString() method
	public String toString() {
		return super.toString() + "/" + getXSpeed() + ", " + getYSpeed();
	}
}