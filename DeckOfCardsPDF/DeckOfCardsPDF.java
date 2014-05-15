import java.io.FileOutputStream;
import java.io.IOException;

import javafx.scene.control.Cell;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCardsPDF{
	
	public static void main(String[] args) throws DocumentException, IOException {
		
		//declaring variables
		String card = "";
		char color = ' ';
		char clubs = '\u2663';
        char diamonds = '\u2666';
        char hearts = '\u2665';
        char spades = '\u2660';
        String jack = "J";
        String queen = "Q";
        String knight = "K";
        String ace = "A";
        
        try {
        	
        	//creating a new document
        	Document document = new Document();
        	//setting the name of the document
        	PdfWriter.getInstance(document, new FileOutputStream("DeckOfCards.pdf"));
        	//opening the document
        	document.open();
        	//creating a table to put the cards in it
        	PdfPTable table = new PdfPTable(4);
        	//table preferences
        	table.setWidthPercentage(100);
        	table.getDefaultCell().setFixedHeight(180);
        	//base font of the whole table (currently using Arial as it is a default font
        	BaseFont baseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, true);
        	
        	//creating some font instances which we will be using later
        	Font black = new Font (baseFont, 70f, 0, BaseColor.BLACK);
        	Font red = new Font (baseFont, 70f, 0, BaseColor.RED);
        	
        	//printing the cards in the table
        	for (int i = 2; i <= 14; i++){
                for (int j = 1; j <= 4; j++){
                    switch (i){
                    	case 10: card = "10"; break;
                        case 11: card = " " + jack; break;
                        case 12: card = " " + queen; break;                    	
                        case 13: card = " " + knight; break;
                        case 14: card = " " + ace; break;
                        default: card = " " + i; break;
                    }
                    switch(j){
	                    case 1:{
	                    	color = clubs;
	                   		table.addCell(new Paragraph(card + color + " ", black));
	                 		break;
	                    }
	                    case 2:{
	                    	color = diamonds;
	                    	table.addCell(new Paragraph(card + color + " ", red));
	                    	break;
	                    }
	                    case 3:{
	                    	color = hearts;
	                    	table.addCell(new Paragraph(card + color + " ", red));
	                    	break;
	                    }
	                    case 4:{
	                    	color = spades;
	                    	table.addCell(new Paragraph(card + color + " ", black));
	                    	break;
	                    }
                    }
                }
        	}
        	//adding the table to the document
        	document.add(table);
        	
        	//close the document
        	document.close();
        }
        catch (Exception e){
        	e.printStackTrace();
        }
	}
}
