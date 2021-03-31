//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> returnList = new ArrayList<Integer>();
    	//add code here
		for (int i = 0; i < m.length; i++) {
			int sum = 0;
			for (int j = 0; j < m[i].length; j++) {
				sum += m[i][j];
			}
			returnList.add(sum);
		}
		return returnList;
    }
}
