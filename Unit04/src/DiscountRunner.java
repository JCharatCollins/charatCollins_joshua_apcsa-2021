//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		double amt;
				
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		
		System.out.println(Discount.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		
		System.out.println(Discount.getDiscountedBill(amt));

		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		
		System.out.println(Discount.getDiscountedBill(amt));

		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		
		System.out.println(Discount.getDiscountedBill(amt));

		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		
		System.out.println(Discount.getDiscountedBill(amt));
	}
}