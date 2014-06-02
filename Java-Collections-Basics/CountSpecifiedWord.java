import java.util.Scanner;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String wordToSearch = scan.nextLine();
		int sameWordCounter = 0;
		
		String[] allWords = input.split("\\W+");
		
		for (String word : allWords) {
			if (word.equalsIgnoreCase(wordToSearch)) {
				sameWordCounter++;
			}
//			if (word.contains("'")) {
//				String[] splittedWord = word.split("'");
//				for (String smallWord : splittedWord) {
//					if (smallWord.equalsIgnoreCase(wordToSearch)) {
//						sameWordCounter++;						
//					}
//				}
//			}
		}
		System.out.println(sameWordCounter);
	}
}