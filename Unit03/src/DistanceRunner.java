//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//add test cases	
		Distance a = new Distance(1, 2, 1, 1);
		a.calcDistance();
		a.print();
		Distance b = new Distance();
		int x1, x2, y1, y2;
		System.out.println("Enter X1: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter Y2: ");
		y2 = keyboard.nextInt();
		a.setCoordinates(x1, y1, x2, y2);
		a.calcDistance();
		a.print();
		System.out.println("Enter X1: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter Y2: ");
		y2 = keyboard.nextInt();
		a.setCoordinates(x1, y1, x2, y2);
		a.calcDistance();
		System.out.println(a.toString());
	}
}