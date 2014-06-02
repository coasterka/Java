import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MostFrequentWord {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String[] input = (scan.nextLine()).split("\\W+");
		HashMap<String , Integer> hashMap = new HashMap<>();
		String tempWord = "";
		
		for (int i = 0; i < input.length; i++) {			
			tempWord = input[i].toLowerCase();
			if (hashMap.containsKey(tempWord)) {
				hashMap.put(tempWord, hashMap.get(tempWord) + 1);
			}
			else {
				hashMap.put(tempWord, 1);
			}
		}
		
		List<Integer> occurances = new ArrayList<Integer>();
		occurances.addAll(hashMap.values());
		int maxOccurance = Collections.max(occurances);
		
		List<String> words = new ArrayList<String>();
		words.addAll(hashMap.keySet());
		
		for (int i = 0; i < occurances.size(); i++) {
			if (occurances.get(i) == maxOccurance) {
				System.out.println(words.get(i) + " -> " + maxOccurance);
			}
		}		
	}
}