//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		for (int i = 1; i < wordRay.length; i++) {
			String currentWord = wordRay[i];
			int j = i;
			while (j > 0 && currentWord.compareTo(wordRay[j-1]) < 0) {
				wordRay[j] = new String(wordRay[j-1]);
				j--;
			}
			wordRay[j] = new String(currentWord);
		}
	}

	public String toString()
	{
		return Arrays.toString(wordRay);
	}
}