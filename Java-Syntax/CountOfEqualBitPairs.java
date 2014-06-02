import java.util.Scanner;

public class CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String binaryNum = Integer.toBinaryString(input);
		int counterOfPairs = 0;
		for (int i = 0; i < binaryNum.length() - 1; i++) {
			if (binaryNum.charAt(i) == binaryNum.charAt(i+1)) {
				counterOfPairs++;
			}
		}
		System.out.println(counterOfPairs);
	}
}
