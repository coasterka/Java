import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
 
public class ReadFile{
       
    private Scanner scan;
   
    //openFile() checks if there is a file named "Input.txt"
    // and if there is - opens it  from the project directory
    public void openFile(){
        try{
                scan = new Scanner(new File("Input.txt"));
        }
        catch(FileNotFoundException ex){
                System.err.println("File not found!");
        }
    }
        
   //the most important method in the program
    //reads from file
    //sorts the product prices
    //writes to new file
    public void readWriteFile(){
    	
        //two lists to hold each product's name and price
        List<Double> priceList = new ArrayList<Double>();
        List<String> productList = new ArrayList<String>();
        String product = "";
        Formatter formatter = null;
        DecimalFormat df = new DecimalFormat("#.00");
        
        //a Product object which is used as a temporary object to holf info
        Product currentProduct = new Product();
        
        //executes while the scanner reaches the end of the file
        //every line is in the format
        //[productName] [productPrice]
        while(scan.hasNext()){
            product = scan.next();
            double price = Double.parseDouble(scan.next());
            priceList.add(price);
            productList.add(product);
            
            //as the program is using Lists and not Arrays, we are unnable to use
            //Arrays.sort(arrayName)
            Collections.sort(priceList);
        }
        
        //this is unnecesary step, it is only used for your comfort, thus you are
        //able to see what is going on with the products - in the console
        for (int i = 0; i < priceList.size(); i++) {
            System.out.printf("%s %s\n", df.format(priceList.get(i)), productList.get(i));
        }
        try{
            formatter = new Formatter("Output.txt");
            for (int i = 0; i < priceList.size(); i++) {
            	
            	//setting name and price for each product from the above two lists
            	currentProduct.setProductName(productList.get(i));
            	currentProduct.setProductPrice(df.format(priceList.get(i)));
            	
            	//writing the new product info in the newly created file "Output.txt"
                formatter.format("%s %s\r\n", currentProduct.getProductPrice(), currentProduct.getProductName());
            }
        }
        catch(IOException ioex){
                System.err.println("IO Exception occured.");
        }
        
        //closing the used resources from Formatter class
        finally{
                formatter.close();
        }
    }
        
    public void closeFile(){
    	
    	//closing the used resources from Scanner class
        scan.close();
    }
}
