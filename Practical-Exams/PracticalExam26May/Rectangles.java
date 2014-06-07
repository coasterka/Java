import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rectangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(input);
		List<Integer> numbers = new ArrayList<Integer>();
		while (matcher.find()) {
			numbers.add(Integer.parseInt(matcher.group()));		
		}
		int max = Integer.MIN_VALUE;
		for (int i = 6; i < numbers.size(); i+=2) {
			int firstA = numbers.get(i-6);
			int firstB = numbers.get(i-5);
			int secondA = numbers.get(i-4);
			int secondB = numbers.get(i-3);
			int thirdA = numbers.get(i-2);
			int thirdB = numbers.get(i-1);
			int sum = firstA*firstB + secondA*secondB + thirdA*thirdB;
			if (sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
