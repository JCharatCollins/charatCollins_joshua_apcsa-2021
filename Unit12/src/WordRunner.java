//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\jchar\\Documents\\charatCollins_joshua_apcsa-2021\\Unit12\\src\\words.dat"));

		int size = file.nextInt();
		
		ArrayList<Word> words = new ArrayList<Word>();
		while (words.size() < size) {
			words.add(new Word(file.next()));
		}
		
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < words.size() - 1; i++) {
				if (words.get(i).compareTo(words.get(i+1)) > 0) {
					sorted = false;
					Collections.swap(words, i, i+1);
				}
				if (words.get(i).compareTo(words.get(i+1)) == 0) {
					if (words.get(i).toString().compareTo(words.get(i+1).toString()) > 0) {
						sorted = false;
						Collections.swap(words, i, i+1);
					}
				}
			}
		}
		
		for (Word word : words) {
			System.out.println(word);
		}
		
	}
}