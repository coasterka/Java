import java.util.Locale;
import java.util.Scanner;

public class PointsInsideTheHouse {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		String result = "";
		boolean isInTriangle;
		double xA = 12.5;
		double yA = 8.5;
		double xB = 22.5;
		double yB = 8.5;
		double xC = 17.5;
		double yC = 3.5;
		double ABC = Math.abs (xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB));
		double ABP = Math.abs (xA * (yB - y) + xB * (y - yA) + x * (yA - yB));
		double APC = Math.abs (xA * (y - yC) + x * (yC - yA) + xC * (yA - y));
		double PBC = Math.abs (x * (yB - yC) + xB * (yC - y) + xC * (y - yB));
		
		isInTriangle = ABP + APC + PBC == ABC;
		
		if (isInTriangle) {
			result = "Inside";
		}
		else if(x >= 12.5 && x <= 17.5 &&
				y >= 8.5 && y <= 13.5){
			result = "Inside";
		}
		else if(x >= 20 && x <= 22.5 &&
				y >= 8.5 && y <= 13.5){
			result = "Inside";
		}
		else {
			result = "Outside";
		}
		System.out.println(result);
	}
}
