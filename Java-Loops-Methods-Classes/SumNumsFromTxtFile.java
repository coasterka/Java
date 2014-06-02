import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumsFromTxtFile {
	public static void main(String[] args) throws IOException {
	//"Input.txt" contains some integer numbers, for example
	//32
	//67
	/134
	//22
	    try(BufferedReader br = new BufferedReader(new FileReader("Input.txt"))) {
	        StringBuilder sb = new StringBuilder();
	        int result = 0;
	        String line = "";
	        while((line = br.readLine())!=null){
	        	result+=Integer.parseInt(line);
	        }	        
	        System.out.print("Sum = " + result);
	    }
	}
}
