import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();		
		int wordCount = 0;
		String[] words = input.split("\\W+");
		
		for (String word : words) {
			wordCount++;	
		}			
		
		System.out.println(wordCount);
	}
}