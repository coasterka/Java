import java.util.Scanner;

public class PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		int count = 0;
		for (int a : numbers) {
			for (int b : numbers) {
				for (int c : numbers) {
					if (a <= b && (a*a + b*b) == (c*c)) {
						System.out.printf("%d*%d + %d*%d = %d*%d\n",
								a, a, b, b, c, c);
						count++;
					}					
				}				
			}			
		}
		if (count == 0) {
			System.out.println("No");
		}
	}
}