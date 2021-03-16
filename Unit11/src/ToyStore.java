//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.System.*;

public class ToyStore implements Comparator<Toy>

{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<>();
	}

	public void loadToys( String toys )
	{
		boolean hasToy;
		Scanner toyString = new Scanner(toys);
		while (toyString.hasNext()) {
			hasToy = false;
			String tempName = toyString.next();
			for (Toy toy : toyList) {
				if (toy.getName().equals(tempName)) {
					toy.setCount(toy.getCount()+1);
					hasToy = true;
				}
			}
			if (!hasToy) {
				toyList.add(new Toy(tempName));
			}
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy : toyList) {
  			if (toy.getName().equals(nm)) {
  				return toy;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = toyList.get(0).getCount();
  		Toy freqToy = toyList.get(0);
  		for (Toy toy : toyList) {
  			if (toy.getCount() > max) {
  				max = toy.getCount();
  				freqToy = toy;
  			}
  		}
  		return freqToy.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Collections.sort(toyList, new ToyStore());
  	}
  	
  	public int compare(Toy a, Toy b) {
  		return a.getCount() - b.getCount();
  	}
  	  
	public String toString()
	{
		String ret = "[";
		for (Toy toy : toyList) {
			ret += toy.getName() + " " + toy.getCount() + ", ";
		}
		ret += "]";
		return ret;
	}
}