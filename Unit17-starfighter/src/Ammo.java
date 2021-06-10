//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 10);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y, 15, 15);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX()+20, getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		if (direction.equals("left")) {
			setX(getX()-speed);
		} else if (direction.equals("right")) {
			setX(getX()+speed);
		} else if (direction.equals("up")) {
			setY(getY()-speed);
		} else if (direction.equals("down")) {
			setY(getY()+speed);
		}	
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
