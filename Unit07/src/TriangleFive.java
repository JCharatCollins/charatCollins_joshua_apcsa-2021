//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A');
		setAmount(5);
	}
	

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output = "";
		for (int i = amount; i > 0; i--) {
			for (int j = amount; j > amount - i; j--) {
				for (int k = j; k > 0; k--) {
					char let = (char)(letter + amount - j);
					if (let < 65) {
						let = (char)(91 - (65 - let));
					}
					if (let > 90) {
						let = (char)(64 + (let - 90));
					}
					output += let;
				}
				output += " ";
			}
			output += "\n";
		}
		return output;
	}
}