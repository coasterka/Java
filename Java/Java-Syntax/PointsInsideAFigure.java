import java.util.Locale;
import java.util.Scanner;

public class PointsInsideAFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		String result = "";
		if (x >= 12.5 && x <= 22.5 &&
				y >= 6 && y <= 8.5) {
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
		else{
			result = "Outside";
		}
		System.out.println(result);
	}
}
