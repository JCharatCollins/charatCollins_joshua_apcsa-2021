//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	private int p1Score;
	private int p2Score;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(300, 300, 20, 20, Color.blue, 1, 3);
		leftPaddle = new Paddle(30, 300, 10, 100, Color.red, 5);
		rightPaddle = new Paddle(750, 300, 10, 100, Color.green, 5);

		keys = new boolean[4];

		p1Score = 0;
		p2Score = 0;
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.drawString("Player 1 Score: " + p1Score, 300, 500);
		graphToBack.drawString("Player 2 Score: " + p2Score, 300, 510);


		ball.moveAndDraw(graphToBack);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=-30 && ball.getX()<=790))
		{
			graphToBack.setColor(Color.white);
			graphToBack.fillRect(320, 480, 100, 40);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.getX() < -30) {
				p2Score++;
				ball.setPos(300, 300);
				ball.setXSpeed(-3);
				ball.setYSpeed((int)((Math.random() * 5) - 1));
			} else {
				p1Score++;
				ball.setPos(300, 300);
				ball.setXSpeed(3);
				ball.setYSpeed((int)((Math.random() * 5) - 1));
			}
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=520))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		if (
				(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())) &&
				(
					ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() ||
					ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()
				)
			) 
		{
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
			} else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
			
		
		
		//see if the ball hits the right paddle
		if (
				(ball.getX() >= rightPaddle.getX() - 2*rightPaddle.getWidth() - Math.abs(ball.getXSpeed())) &&
				(
					ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight() ||
					ball.getY() + ball.getHeight() >= rightPaddle.getY() && ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight()
				)
			) 
		{
			if (ball.getX() >= rightPaddle.getX() - 2*rightPaddle.getWidth() + Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
			} else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		//see if the paddles need to be moved
		if (keys[1]) {
			leftPaddle.moveUpAndDraw(graphToBack);
		} else 
		if (keys[0]) {
			leftPaddle.moveDownAndDraw(graphToBack);
		} else {
			leftPaddle.draw(graphToBack);
		}
		if (keys[3]) {
			rightPaddle.moveUpAndDraw(graphToBack);
		} else 
		if (keys[2]) {
			rightPaddle.moveDownAndDraw(graphToBack);
		} else {
			rightPaddle.draw(graphToBack);
		}
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}