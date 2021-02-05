//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven a = new StringOddOrEven("cat");
		
		System.out.println(a);
		a.setString("boot");
		
		System.out.println(a);
		a.setString("it");
		
		System.out.println(a);
		a.setString("a");
		
		System.out.println(a);
		a.setString("eleven");
		
		System.out.println(a);
		a.setString("thirteen");
		
		System.out.println(a);
		a.setString("odd");
		
		System.out.println(a);
		a.setString("even");
		
		System.out.println(a);
	}
}