import java.util.Hashtable;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int)(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		for (int i = 0; i < vals.length; i++) {
			if (countVals(vals[max]) < countVals(vals[i])) {
				max = i;
			}
		}
		return vals[max];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int sum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j].equals(val)) {
					sum++;
				}
			}
		}
		return sum;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}