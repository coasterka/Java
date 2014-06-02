import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		String[] faces = (scan.nextLine()).split("[\\W\\s]+");
		
		//LinkedHashMap will iterate in the order in which the entries were put into the map
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		List<String> faceOccurance = new ArrayList<String>();
		
		for (int i = 0; i < faces.length; i++) {
			if (!faceOccurance.contains(faces[i])) {
				faceOccurance.add(faces[i]);
			}
		}
		
		for (int i = 0; i < faceOccurance.size(); i++) {
            int counter = 0;
            String currentFace = faceOccurance.get(i);

            for (int j = 0; j < faces.length; j++) {
                if (currentFace.equals(faces[j])) {
                    counter++;
                }
            }
            lhm.put(currentFace, counter);
        }
		
		double length = faces.length;

        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
        	DecimalFormat df = new DecimalFormat("#.00");
            String key = entry.getKey();
            int value = entry.getValue();
            double occurance = (value / length) * 100;
            System.out.printf("%s -> %s%s\n", key, df.format(occurance), "%");
        }
	}
}