//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	String[] bank = str.split("");
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = bank[(size*i)+j];
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	return checkRight(word, 0, 0);
    }

	public boolean checkRight(String w, int r, int c)
   {
		if (c + w.length() > m.length) {
			return false;
		}
		boolean found = true;
		String[] word = w.split("");
		for (int i = 0; i < w.length(); i++) {
			if (!m[r][c+i].equals(word[i])) {
				found = false;
			}
		}
		return found;
   }

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	String ret = "";
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			ret += m[i][j] + " ";
    		}
    		ret += "\n";
    	}
    	return ret;
    }
}
