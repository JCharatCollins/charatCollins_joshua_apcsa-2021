//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		int choice;
		choice = (int)Math.floor(Math.random() / 0.33);
		System.out.println(choice);
		if (choice == 0) {
			compChoice = playChoice;
			return "!Draw Game!";
		} else if (choice == 1) {
			if (playChoice == "R") {
				compChoice = "S";
				System.out.println(compChoice);
				return "!Player wins <<Rock Breaks Scissors>>!";
			} else if (playChoice == "P") {
				compChoice = "R";
				System.out.println(compChoice);

				return "!Player wins <<Paper Covers Rock>>!";
			} else {
				compChoice = "P";
				System.out.println(compChoice);

				return "!Player wins <<Scissors Cuts Paper>>!";
			}
		} else {
			if (playChoice == "R") {
				compChoice = "P";
				System.out.println(compChoice);

				return "!Computer wins <<Paper Covers Rock>>!";
			} else if (playChoice == "P") {
				compChoice = "S";
				System.out.println(compChoice);

				return "!Computer wins <<Scissors Cuts Paper>>!";
			} else {
				compChoice = "R";
				System.out.println(compChoice);

				return "!Computer wins <<Rock Breaks Scissors>>!";
			}
		}
	}

	public String toString()
	{
		String returnString = determineWinner();
		return "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + returnString;
	}
}