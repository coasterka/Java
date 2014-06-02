import java.util.Scanner;

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String wordToSearch = (scan.nextLine()).toLowerCase();
		int substringCounter = 0;
		
		for (int i = 0; i <= input.length() - wordToSearch.length(); i++) {
			if (input.substring(i, wordToSearch.length() + i).contains(wordToSearch)) {
				substringCounter++;
			}
		}
		
		System.out.println(substringCounter);
	}

}
