import java.util.Random;
import java.util.Scanner;

public class RandomHands {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		char clubs = '\u2663';
        char diamonds = '\u2666';
        char hearts = '\u2665';
        char spades = '\u2660';
        
        String[] cards = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10",
        		"J", "Q", "K", "A"};
        char[] suits = new char[] { clubs, diamonds, hearts, spades };
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int indexCards = generator.nextInt(cards.length);
		        String randomCard = (cards[indexCards]);
		        int indexSuits = generator.nextInt(suits.length);
		        char randomSuit = (suits[indexSuits]);
				System.out.printf("%s%c ", randomCard, randomSuit);
			}
			System.out.println();
		}
	}
}
