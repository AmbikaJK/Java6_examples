package classdesign;

public class CardEnumTest {

	enum Cards {CLUB, SPADE, DIAMOND, HEARTS};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (Cards card : Cards.values()) {
			System.out.println(card + " ");
		}
	}

}
