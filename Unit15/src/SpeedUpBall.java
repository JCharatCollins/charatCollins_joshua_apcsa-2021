//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

class SpeedUpBall extends Ball
{

   //constructors
   public SpeedUpBall()
   {
		super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }

   public SpeedUpBall(int x, int y, int wid, int ht)
   {
	   super(x, y, wid, ht);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }
   
   
}