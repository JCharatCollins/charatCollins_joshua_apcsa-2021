//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		System.out.println(test);
		test.setRemover("ssssxsssessss", 's');
		System.out.println(test);
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test);
		test.setRemover("abababaabababa", 'a');
		System.out.println(test);
	}
}