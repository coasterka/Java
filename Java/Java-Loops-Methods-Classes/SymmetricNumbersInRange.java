import java.util.Scanner;

public class SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		for (int i = start; i <= end; i++) {
			char[] charArray = Integer.toString(i).toCharArray();
			if (Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString())){
				printResult(i);
			}
		}
	}

	private static void printResult(int i) {
		System.out.println(i);
	}
}
