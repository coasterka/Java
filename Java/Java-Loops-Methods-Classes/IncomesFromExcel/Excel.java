import java.text.DecimalFormat;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		readXLSXFile();
		
	}

	private static void readXLSXFile() throws IOException, FileNotFoundException {
		
		Locale.setDefault(Locale.ROOT);
		
		InputStream excelFileToRead = new FileInputStream("Incomes-Report.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(excelFileToRead);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		int colNum = sheet.getRow(0).getLastCellNum();
		List<String> offices = new ArrayList<>();
		List<Double> incomes = new ArrayList<Double>();
		TreeMap<String, List<Double>> officeNameIncome = new TreeMap<>();

		for (int i = 1; i <= rowNum; i++) {			
			XSSFRow row = sheet.getRow(i);			
			for (int j = 0; j < colNum; j++) {				
				XSSFCell cell = row.getCell(j);				
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING
						&& j == 0) {					
					offices.add(cell.getStringCellValue());						
				}				
				if (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA
						&& j == colNum - 1) {					
					incomes.add(cell.getNumericCellValue());					
				}
			}
		}
		
		for (int i = 0; i < offices.size(); i++) {			
			String officeName = offices.get(i);
			Double officeIncome = incomes.get(i);			
			List<Double> tempIncomeList = new ArrayList<Double>();			
			if (officeNameIncome.containsKey(officeName)) {
				officeNameIncome.get(officeName).add(officeIncome);				
			}			
			else {				
				tempIncomeList.add(officeIncome);
				officeNameIncome.put(officeName, tempIncomeList);				
			}
		}

		DecimalFormat df = new DecimalFormat("#.00");
		double grandTotal = 0.0;
		
		for (Map.Entry<String, List<Double>> office : officeNameIncome.entrySet()) {		
			String key = office.getKey();
			List<Double> value = office.getValue();			
			double tempSum = 0.0;			
			for (int i = 0; i < value.size(); i++) {				
				tempSum += value.get(i);				
			}			
			grandTotal += tempSum;
			System.out.println(key + " Total -> " + df.format(tempSum));			
		}		
		System.out.println("Grand Total -> " + df.format(grandTotal));
	}	
}
