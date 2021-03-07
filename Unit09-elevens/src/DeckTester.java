/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(new String[] {"Jack", "Queen", "King", "Ace"}, new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}, new int[] {11, 12, 13, 14});
		System.out.println(test.size());
		System.out.println(test.isEmpty());
		for (int i = 0; i <= 16; i++) {
			System.out.println(test.deal());
		}
		test.shuffle();
		for (int i = 0; i <= 16; i++) {
			System.out.println(test.deal());
		}
	}
}
