import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] splittedInput = input.split("\\W+");
		TreeSet<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		
		for (String word : splittedInput) {			
			uniqueWords.add(word);			
		}
		
		for (String word : uniqueWords) {			
			System.out.print(word.replaceAll("\\W+", "").toLowerCase() + " ");			
		}
	}
}