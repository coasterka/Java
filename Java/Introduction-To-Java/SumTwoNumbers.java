import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = scan.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.printf("Sum = %d%n", sum);
	}
}
