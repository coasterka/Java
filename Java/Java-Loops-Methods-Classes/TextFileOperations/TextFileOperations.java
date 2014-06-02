/*Create a class Product to hold products, which have name (string) and price 
(decimal number). Read from a text file named "Input.txt" a list of products. 
Each product will be in format name + space + price. You should hold the products 
in objects of class Product. Sort the products by price and write them in format 
price + space + name in a file named "Output.txt". Ensure you close correctly all 
used resources. */

public class TextFileOperations {
	
	public static void main(String[] args){
		//creating a ReadFile object to execute methods on it 
		ReadFile rf = new ReadFile();
		
		//method openFile() from ReadFile.java
		//opens the current file "Input.txt" from the project directory
		rf.openFile();
		
		//method redWriteFile() from ReadFile.java
		//reads lines from "Input.txt"
		//writes sorted lines to "Output.txt"
		rf.readWriteFile();
		
		//method closeFile() from ReadFile.java
		//closes the used resources
		rf.closeFile();
	}
}
