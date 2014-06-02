import java.util.Locale;
import java.util.Scanner;

public class SmallestOfThreeNums { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		double firstNum = scan.nextDouble();
		double secondNum = scan.nextDouble();
		double thirdNum = scan.nextDouble();
		double tempMin = Math.min(firstNum, secondNum);
		double smallest = Math.min(tempMin, thirdNum);
		System.out.println(smallest);
	}
}
