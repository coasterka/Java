import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		char[] binaryNum = (Integer.toBinaryString(number)).toCharArray();
		int counterOfBits = 0;
		for (int i = 0; i < binaryNum.length; i++) {
			if (binaryNum[i] == '1') {
				counterOfBits++;
			}
		}
		System.out.print(counterOfBits);
	}
}
