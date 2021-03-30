import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		if (selectedCards.size() == 2) {
			if (containsPairSum11(selectedCards)) return true;
		} else if (selectedCards.size() == 3) {
			if (containsJQK(selectedCards)) return true;
		}
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> boardCards = super.cardIndexes();
		List<Integer> currentCards = new ArrayList<Integer>();
		boolean check = false;
		//11 isn't divisible by 2 so this works luckily
		for (int i = 0; i < boardCards.size(); i++) {
			for (int j = 0; j < boardCards.size(); j++) {
				currentCards.add(boardCards.get(i));
				currentCards.add(boardCards.get(j));
				if (containsPairSum11(currentCards)) check = true;
				currentCards.clear();
			}
		}
		for (int i = 0; i < boardCards.size(); i++) {
			for (int j = 0; j < boardCards.size(); j++) {
				for (int k = 0; k < boardCards.size(); k++) {
					currentCards.add(boardCards.get(i));
					currentCards.add(boardCards.get(j));
					currentCards.add(boardCards.get(k));
					if (containsJQK(currentCards)) check = true;
					currentCards.clear();
				}
			}
		}
		return check;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (super.cardAt(selectedCards.get(0)).pointValue() + super.cardAt(selectedCards.get(1)).pointValue() == 11) {
			return true;
		}
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		String[] JQK = new String[3];
		JQK[0] = super.cardAt(selectedCards.get(0)).rank();
		JQK[1] = super.cardAt(selectedCards.get(1)).rank();
		JQK[2] = super.cardAt(selectedCards.get(2)).rank();
		Arrays.sort(JQK);
		for (String thing : JQK) {
			System.out.print(thing + " ");
			System.out.println("");
		}
		String[] check = {"jack", "queen", "king"};
		Arrays.sort(check);
		boolean possible = true;
		for (int i = 0; i < 3; i++) {
			if (!check[i].equals(JQK[i])) {
				possible = false;
			}
		}
		return possible;
	}
}
