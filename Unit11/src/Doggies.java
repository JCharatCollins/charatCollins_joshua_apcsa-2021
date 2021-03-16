//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot >= pups.length) {
		} else {
			pups[spot] = new Dog(age, name);
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int maxAge = pups[0].getAge();
		int index = 0;
		for (int i = 1; i < pups.length; i++) {
			if (pups[i].getAge() > maxAge) {
				maxAge = pups[i].getAge();
				index = i;
			} 
		}
		return pups[index].getName();
	}

	public String getNameOfYoungest()
	{
		int minAge = pups[0].getAge();
		int index = 0;
		for (int i = 1; i < pups.length; i++) {
			if (pups[i].getAge() < minAge) {
				minAge = pups[i].getAge();
				index = i;
			} 
		}
		return pups[index].getName();	
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}