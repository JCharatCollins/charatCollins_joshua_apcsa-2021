/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
package Magpie;

public class Magpie4
{
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		} else if (transformIWantStatement(statement) != "") {
			response = transformIWantStatement(statement);
		} else if (transformIYouStatement(statement) != "") {
			response = transformIYouStatement(statement);
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		} else if (findKeyword(statement, "dog") >= 0 || findKeyword(statement, "cat") >= 0){
			response = "Tell me more about your pets.";
		} else if (findKeyword(statement, "mauro") >= 0){
			response = "Mr. Mauro is a cool dude.";
		} else if (findKeyword(statement, "joshua") >= 0 || findKeyword(statement, "josh") >= 0){
			response = "Josh is a cool dude.";
		} else if (findKeyword(statement, "guitar") >= 0) {
			response = "Guitar is the best instrument";
		} else if (findKeyword(statement, "632146S,P,K,S,HS,D,K,S,632146HS") >= 0) {
			response = "DESTROYED!";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

	private String transformIWantStatement(String statement) {
		int psn = findKeyword(statement, "i want");	
		if (psn >= 0) {
			if (!(findKeyword(statement, "i want to") >= 0)) {
				String something;
				if (statement.indexOf(" ", psn + 7) <= 0) {
					something = statement.substring(psn + 7, statement.length());
				} else {
					something = statement.substring(psn + 7, statement.indexOf(" ", psn + 7));
				}
				return "Would you really be happy if you had " + something + "?";
			}
		}
		return "";
	}
	
	private String transformIYouStatement(String statement) {
		int psn1 = findKeyword(statement, "i");
		int psn2 = findKeyword(statement, "you");
		String mid = statement.substring(psn1 + 2, psn2 - 1);
		if (mid.indexOf(" ") <= 0) {
			return "Why do you " + mid + " me?";
		}
		return "";
	}
}
