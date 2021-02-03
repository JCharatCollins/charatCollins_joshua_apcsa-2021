//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("23423 is odd :: " + NumberVerify.isOdd(23423));
		System.out.println("23423 is even :: " + NumberVerify.isEven(23423));
		System.out.println("23028 is odd :: " + NumberVerify.isOdd(23028));
		System.out.println("324 is even :: " + NumberVerify.isEven(324));
	}
}