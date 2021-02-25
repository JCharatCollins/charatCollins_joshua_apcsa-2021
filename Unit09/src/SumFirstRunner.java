import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		System.out.println(ListSumFirst.go(Arrays.asList(new Integer[] {-99,1,2,3,4,5,6,7,8,9,10,5})));
		System.out.println(ListSumFirst.go(Arrays.asList(new Integer[] {10,9,8,7,6,5,4,3,2,1,-99})));
		System.out.println(ListSumFirst.go(Arrays.asList(new Integer[] {32767})));
		System.out.println(ListSumFirst.go(Arrays.asList(new Integer[] {255,255})));
	}
}