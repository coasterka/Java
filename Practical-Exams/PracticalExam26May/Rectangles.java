import java.util.Scanner;

public class Rectangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] rectangles = input.split("\\D+");
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 6; i < rectangles.length; i+=2) {
			int firstA = Integer.parseInt(rectangles[i-5]);
			int firstB = Integer.parseInt(rectangles[i-4]);
			int secondA = Integer.parseInt(rectangles[i-3]);
			int secondB = Integer.parseInt(rectangles[i-2]);
			int thirdA = Integer.parseInt(rectangles[i-1]);
			int thirdB = Integer.parseInt(rectangles[i]);
			int sum = firstA*firstB + secondA*secondB + thirdA*thirdB;
			if (sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
