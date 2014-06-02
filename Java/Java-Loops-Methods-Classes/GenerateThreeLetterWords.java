import java.util.Scanner;

public class GenerateThreeLetterWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char[] inputChars = input.toCharArray();
		for (int i = 0; i < inputChars.length; i++) {
			for (int j = 0; j < inputChars.length; j++) {
				for (int j2 = 0; j2 < inputChars.length; j2++) {
					System.out.printf("%c%c%c ", inputChars[i], inputChars[j], inputChars[j2]);
				}
			}
		}		
	}
}
