import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class AngleUnitConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers will you enter?");
		int n = scan.nextInt();
		scan.nextLine();
		String[] strings = new String[n];
		double[] numbers = new double[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextDouble();
			strings[i] = scan.next();
			scan.nextLine();
			convertAngles(numbers[i], strings[i]);
		}		
	}

	private static void convertAngles(double number, String str) {
		DecimalFormat decPoints = new DecimalFormat("#.000000");
		if (str.equals("deg")) {
			number *= 0.0174532925;
			String convertedValue = decPoints.format(number);
			System.out.println(convertedValue + " rad");
		}
		if(str.equals("rad")){
			number *= 57.2957795;
			String convertedValue = decPoints.format(number);
			System.out.println(convertedValue + " deg");
		}
	}
}
