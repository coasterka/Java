import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = (scan.nextLine()).split(" ");
		HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
        
        for (String word : input) {
                Integer counter = wordCounter.get(word);
                if(counter == null){
                        counter = 0;
                }
                wordCounter.put(word, counter + 1);
        }
       
        Entry<String, Integer> maxEntry = null;

        for(Entry<String, Integer> entry : wordCounter.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
       
        for (int i = 0; i < maxEntry.getValue(); i++) {
                System.out.print(maxEntry.getKey() + " ");
        }

	}

}
