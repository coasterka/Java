import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(scan.next());
		}
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}