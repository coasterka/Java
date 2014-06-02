import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		
		try {
			Scanner scan = new Scanner(System.in);
			String firstDateStr = scan.nextLine();
			String secondDateStr = scan.nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date firstDate = dateFormat.parse(firstDateStr);
			Date secondDate = dateFormat.parse(secondDateStr);
			long diffInMilli = secondDate.getTime() - firstDate.getTime();
			long diffInDays = TimeUnit.MILLISECONDS.toDays(diffInMilli);
			System.out.println(Math.abs(diffInDays));
		}
		catch(ParseException e){
			e.printStackTrace();
		}		
	}
}
