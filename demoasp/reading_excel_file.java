package demoasp;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class reading_excel_file {

	public static void main(String[] args) throws BiffException, IOException {
	Workbook wb = Workbook.getWorkbook(new File("D:\\junction_testing\\Automation testing.xlsx"));
	Sheet sh=wb.getSheet(1);
	for(int i=0;i<=sh.getRows();i++) {
	System.out.println("U name: "+ sh.getCell(0, i).getContents());
	System.out.println("U Passward: "+ sh.getCell(1, i).getContents());
		   
		
		
	
		
		
	}
		
		

	}

}
