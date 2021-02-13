//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNumber(0);
   }
   
   public Perfect(int num) {
	   setNumber(num);
   }
	//add a set method
   public void setNumber(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}
	
	//add a toString	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
}