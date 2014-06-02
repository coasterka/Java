import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a < 0) {
			a *= -1;
		}
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		//print the first number in hex format
		String hexA = Integer.toHexString(a);
		printVerticalLine();
		System.out.print(hexA.toUpperCase());
		printWhiteSpaces((10 - hexA.length()));
		printVerticalLine();
		
		//print the first number in binary format 
		String binB = Integer.toBinaryString(a);
		if (binB.length() < 10) {
			printZeroes((10 - binB.length()));
		}
		System.out.print(binB);
		printVerticalLine();
		
		//print the second number with 2 digits after
		//the decimal point
		DecimalFormat twoDecPoints = new DecimalFormat("#.00");
		String formattedB = twoDecPoints.format(b);
		printWhiteSpaces(10 - formattedB.length());
		System.out.print(formattedB);
		printVerticalLine();
		
		//print the third number with 3 digits after
		//the decimal point
		DecimalFormat threeDecPoints = new DecimalFormat("#.000");
		String cString = Double.toString(c);
		if (c == (int) c) {
			System.out.print((int)c);
		}
		else{
			System.out.print(threeDecPoints.format(c));
		}
	}

	private static void printZeroes(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("0");
		}		
	}

	private static void printVerticalLine() {
		System.out.print("|");
	}

	private static void printWhiteSpaces(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print(" ");
		}
	}
}
