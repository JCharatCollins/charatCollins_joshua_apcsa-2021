//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		String name1, name2;
		int size1, size2;
		
		System.out.println("Enter 1st monster's name : ");
		name1 = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		size1 = keyboard.nextInt();
		
		System.out.println("Enter 2nd monster's name : ");
		name2 = keyboard.next();
		System.out.println("Enter 2nd monster's size : ");
		size2 = keyboard.nextInt();

		//instantiate monster one
		Skeleton monster1 = new Skeleton(name1, size1);
		Skeleton monster2 = new Skeleton(name2, size2);

		//ask for name and size
		System.out.println("Monster 1 - " + monster1);
		System.out.println("Monster 2 - " + monster2);
		
		if (monster1.isBigger(monster2)) {
			System.out.println("Monster one is bigger than monster two.");
		} else {
			System.out.println("Monster two is bigger than monster one.");
		}
		
		//instantiate monster two
		if (monster1.namesTheSame(monster2)) {
			System.out.println("Monster one has the same name as monster two.");
		} else {
			System.out.println("Monster one does not have the same name as monster two.");
		}
	}
}