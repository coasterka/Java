import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sun.font.StrikeCache;

public class CountBeers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputLine = scan.nextLine();
		List<String> inputList = new ArrayList<String>();
		while(true){
			inputList.add(inputLine);
			inputLine = scan.nextLine();
			if (inputLine.equals("End")) {
				break;
			}
		}
		String[] array = new String[2];
		
		int beersCount = 0;
		int stacksCount = 0;
		
		for (int i = 0; i < inputList.size(); i++) {
			array = (inputList.get(i)).split(" ");
			if ((array[1]).equals("beers")) {
				beersCount += Integer.parseInt(array[0]);
			}
			if ((array[1]).equals("stacks")) {
				stacksCount += Integer.parseInt(array[0]);
			}
			stacksCount += beersCount/20;
			beersCount = beersCount%20;
			
		}
		System.out.printf("%d stacks + %d beers", stacksCount, beersCount);
	}
}