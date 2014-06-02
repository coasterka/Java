import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OrderOfProducts {
	public static void main(String[] args) {
		writeBill();
	}
	public static void writeBill(){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"));
			bw.write(String.format("Total Bill: %.2f", calculateBill()));
			bw.close();
		}
		catch(IOException ioex){
			ioex.printStackTrace();
		}
	}
	private static double calculateBill() throws FileNotFoundException {
		FileReader fr = new FileReader("Order.txt");
		double totalBill = 0;
		try{
			BufferedReader br = new BufferedReader(fr);
			int countOfLines = countLines("Order.txt");
			Product[] products = extractProducts();
			
			for (int i = 0; i < countOfLines; i++) {
				String[] orderInfo = br.readLine().split(" ");
				for (int j = 0; j < products.length; j++) {
					if (orderInfo[1].equals(products[j].getProductName())) {
						totalBill = totalBill + products[j].getProductPrice()*Double.parseDouble(orderInfo[0]);
					}
				}
			}
			fr.close();
		}
		catch(IOException ioex){
			ioex.printStackTrace();
		}
		catch (IllegalArgumentException iaex) {
			iaex.printStackTrace();
		}
		return totalBill;
	}
	private static Product[] extractProducts() throws FileNotFoundException {
			FileReader fr = new FileReader("Products.txt");
			try{
				BufferedReader br = new BufferedReader(fr);
				int linesCount = countLines("Products.txt");
				Product[] products = new Product[linesCount];
				String[] info = new String[2];
				for (int i = 0; i < linesCount; i++) {
					String currentLine = br.readLine();
					info = currentLine.split(" ");
					products[i] = new Product(" ", 0);
					products[i].setProductName(info[0].toString());
					products[i].setProductPrice(Double.parseDouble(info[1]));					
				}
				fr.close();
				return products;
			}
			catch(IOException ioex){
				ioex.printStackTrace();
			}
		return null;
	}
	private static int countLines(String fileName) throws IOException, FileNotFoundException{
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int linesCounter = 0;
		while(line != null){
			linesCounter++;
			line = br.readLine();
		}
		br.close();
		return linesCounter;
	}
}
