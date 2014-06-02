public class FullHouse {

	public static void main(String[] args) {
		String[] cards = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A"};
		char[] suits = new char[] {'♣', '♦', '♥', '♠'};
		int fullHouseCount = 0;
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				for (int k = 0; k < suits.length; k++) {
					for (int l = k+1; l < suits.length; l++) {
						for (int m = l+1; m < suits.length; m++) {
							for (int n = 0; n < suits.length; n++) {
								for (int o = n+1; o < suits.length; o++) {
									if (i != j) {
										System.out.printf("%s%c %s%c %s%c %s%c %s%c",
												cards[i], suits[k],
												cards[i], suits[l],
												cards[i], suits[m],
												cards[j], suits[n],
												cards[j], suits[o]);
										fullHouseCount++;
										System.out.println();
									}
								}
							}							
						}						
					}					
				}
			}
		}
		System.out.println("\n" + fullHouseCount);
	}
}
