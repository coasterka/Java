import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoDurations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> input = new ArrayList<String>();
		String inputLine = scan.nextLine();
		String end = "End";
		
		while(!inputLine.equals(end)) {
			input.add(inputLine);
			inputLine = scan.nextLine();
			if (inputLine.equals(end)) {
				break;
			}
		}
		String[] splittedLines = new String[2];
		int hours = 0;
		int mins = 0;
		int totalMins = 0;
		for (String string : input) {
			splittedLines = string.split(":");
			hours=Integer.parseInt(splittedLines[0]);
			mins=Integer.parseInt(splittedLines[1]);
			totalMins = totalMins + hours * 60 + mins;
		}
		int totalHours = totalMins / 60;
		totalMins = totalMins % 60;
		System.out.printf("%d:%02d\n", totalHours, totalMins);
	}
}