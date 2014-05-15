import java.util.Scanner;
import java.util.Arrays;

public class SortStringArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.printf("Enter %d strings: %n", n);
		String[] stringArray = new String[n];
		for(int i = 0; i < stringArray.length; i++){
			stringArray[i] = scan.nextLine();
		}
		Arrays.sort(stringArray);
		for(int i = 0; i < stringArray.length; i++){
			System.out.println(stringArray[i]);
		}
	}
}
