//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int counter = 1;
		while (counter < a || counter < b || counter < c) {
			if (a % counter == 0 && b % counter == 0 && c % counter == 0) {
				max = counter;
			}
			counter++;
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a < number; a++) {
			for (int b = 1; b < a; b++) {
				for (int c = 1; c < b; c++) {
					if ((a*a) == (b*b) + (c*c) && a % 2 != 0) {
						if (b % 2 == 0) {
							if (c % 2 != 0 ) {
								if (greatestCommonFactor(a, b, c) > 1) {
								} else {
									output += a + " " + b + " " + c + "\n";
								}
							}
						} else {
							if (c % 2 == 0) {
								if (greatestCommonFactor(a, b, c) > 1) {
								} else {
									output += a + " " + b + " " + c + "\n";
								}
							}
						}
					}
				}
			}
		}
		return output;
	}
}