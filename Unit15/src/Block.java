//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		this(0, 0, 0, 0, Color.black);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		setPos(x, y);
		setDim(0, 0);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setDim(w, h);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w, int h, Color col) {
		setPos(x, y);
		setDim(w, h);
		setColor(col);
	}
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }
   public Color getColor()
   {
	   return color;
   }
   
   public void setX(int x)
   {
	   xPos = x;
   }
   public int getX()
   {
	   return xPos;
   }
   
   public void setY(int y)
   {
	   yPos = y;
   }
   public int getY()
   {
	   return yPos;
   }

   public void setWidth(int w)
   {
	   width = w;
   }
   public int getWidth()
   {
	   return width;
   }
   
   public void setHeight(int h)
   {
	   height = h;
   }
   public int getHeight()
   {
	   return height;
   }

   public void setPos(int x, int y) {
	   setX(x);
	   setY(y);
   }
   public void setDim(int w, int h) {
	   setWidth(w);
	   setHeight(h);
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public String draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   return getX() + ", " + getY();
   }
   
	public boolean equals(Object obj)
	{
		if (toString().equals(obj.toString())) {
			return true;
		}
		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return getX() + ", " + getY() + "/" + getWidth() + ", " + getHeight() + "/" + getColor();
	}
}