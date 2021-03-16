//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore store = new ToyStore();
		store.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(store);
		System.out.println(store.getThatToy("bat"));
		System.out.println(store.getMostFrequentToy());
		store.sortToysByCount();
		System.out.println(store);
	}
}