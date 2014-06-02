import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] input = (scan.nextLine()).split(" "); 
		int[] numbers = new int[input.length];
		int counter = 1;
        int sequenceLength = 1;
        int endPosition = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
       
        System.out.print(numbers[0] + " ");
        
        for (int i = 1; i < numbers.length; i++) {
               
        	if(numbers[i] > numbers[i - 1]) {
            	counter++;
            	System.out.print(numbers[i] + " ");                        
        	}
        	else {
        		counter = 1;
        		System.out.println();
        		System.out.print(numbers[i] + " ");
            }
            if(counter > sequenceLength) {
            	sequenceLength = counter;
            	endPosition = i;
            }
    	}       
        int startPosition = endPosition - sequenceLength + 1;
        System.out.println();
       
        System.out.print("Longest: ");
        for (int i = startPosition; i <= endPosition; i++) {
            System.out.print(numbers[i] + " ");
        }
	}
}