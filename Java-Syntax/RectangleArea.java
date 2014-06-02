import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sideA = scan.nextInt();
		int sideB = scan.nextInt();
		int area = sideA * sideB;
		System.out.println(area);
	}
}
