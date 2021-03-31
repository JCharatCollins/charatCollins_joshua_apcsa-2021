//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if (num > 0) {
			return 1 - (num % 2) + countEvenDigits(num/10);
		}

		return 0;
	}
}