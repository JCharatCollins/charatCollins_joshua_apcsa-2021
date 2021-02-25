import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		System.out.println(ListOddToEven.go(Arrays.asList(new Integer[] {-99,1,2,3,4,5,6,7,8,9,10,5})));
		System.out.println(ListOddToEven.go(Arrays.asList(new Integer[] {11,9,8,7,6,5,4,3,2,1,-99,7})));
		System.out.println(ListOddToEven.go(Arrays.asList(new Integer[] {2,7,11,21,5,7})));
		System.out.println(ListOddToEven.go(Arrays.asList(new Integer[] {2,4,6,8,8})));

	}
}