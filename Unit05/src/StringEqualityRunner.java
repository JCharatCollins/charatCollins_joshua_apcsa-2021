//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality checker = new StringEquality("hello", "goodbye");
		checker.toString();
		
		checker.setWords("one", "two");
		System.out.println(checker.toString());
		
		checker.setWords("three", "four");
		System.out.println(checker.toString());

		checker.setWords("TCEA", "UIL");
		System.out.println(checker.toString());
		
		checker.setWords("State", "Champions");
		System.out.println(checker.toString());
		
		checker.setWords("ABC", "ABC");
		System.out.println(checker.toString());

		checker.setWords("Same", "Same");
		System.out.println(checker.toString());
	}
}