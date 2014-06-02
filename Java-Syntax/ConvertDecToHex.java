import java.util.Scanner;
public class ConvertDecToHex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.format(("%h").toUpperCase(), number);
	}
}
