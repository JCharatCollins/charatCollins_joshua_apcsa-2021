//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int behaviorTimer = 0;

	public AlienHorde(int size)
	{
		int alienCount = 0;
		aliens = new ArrayList<Alien>();
		while(alienCount < size) {
			add(new Alien());
			alienCount++;
		}
//		aliens = new Alien[(int)Math.ceil(size/10.0)][10];
//		int alienCount = 0;
//		while (alienCount < size) {
//			for (int row = 0; row < aliens.length; row++) {
//				for (int col = 0; col < aliens[row].length; col++) {
//					aliens[row][col] = new Alien((col * 30) + 10, (row * 30));
//					alienCount++;
//				}
//			}
//		}
	}

	public void add(Alien al)
	{
		al.setPos((aliens.size() % 8) * 80 + 50, (aliens.size()/8) * 100);
		aliens.add(al);
//		if (aliens[aliens.length-1].length == 10) {
//			Alien[][] newAliens = new Alien[aliens.length+1][10];
//			for (int row = 0; row < aliens.length; row++) {
//				for (int col = 0; col < aliens[row].length; col++) {
//					newAliens[row][col] = aliens[row][col];
//				}
//			}
//			newAliens[aliens.length+1][0] = new Alien(10, (aliens.length+1)*30);
//		} else {
//			Alien[] newAliens = new Alien[aliens[aliens.length-1].length + 1];
//			for (int i = 0; i < aliens[aliens.length-1].length; i++) {
//				newAliens[i] = aliens[aliens.length-1][i];
//			}
//			newAliens[aliens[aliens.length-1].length] = new Alien((aliens[aliens.length-1].length -1)*30 + 10, (aliens.length - 1) * 30);
//			aliens[aliens.length-1] = newAliens;
//		}
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens) {
			al.draw(window);
		}
//		for (int row = 0; row < aliens.length; row++) {
//			for (int col = 0; col < aliens[row].length; col++) {
//				aliens[row][col].draw(window);
//			}
//		}
	}

	public void moveEmAll()
	{
		for (Alien al : aliens) {
			if (behaviorTimer / 50 == 0) {
				al.move("left");
			} else if (behaviorTimer / 50 == 1) {
				al.move("right");
			} else if (behaviorTimer / 50 == 2) {
				al.move("down");
			}
		}
		behaviorTimer++;
		if (behaviorTimer > 200) {
			behaviorTimer = 0;
		}
		System.out.println(behaviorTimer);
//		for (int row = 0; row < aliens.length; row++) {
//			for (int col = 0; col < aliens[row].length; col++) {
//				aliens[row][col].move("down");
//			}
//		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (Ammo shot : shots) {
			for (int i = 0; i < aliens.size(); i++) {
				if (Math.abs(aliens.get(i).getX()-shot.getX()) < 10 && Math.abs(aliens.get(i).getY()-shot.getY()) < 10) {
					aliens.remove(i);
					i--;
				}
			}
		}
//		for (int row = 0; row < aliens.length; row++) {
//			for (int col = 0; col < aliens[row].length; col++) {
//				for (Ammo al : shots) {
//					if (Math.abs(aliens[row][col].getX()-al.getX()) < 5 && Math.abs(aliens[row][col].getY()-al.getY()) < 5) {
//						
//					}
//				}
//			}
//		}
	}
	
	public List<Alien> getList() {
		return aliens;
	}

	public String toString()
	{
		return aliens.toString();
	}
}
