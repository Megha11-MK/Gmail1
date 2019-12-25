package generic_lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadGeneric {

	public static String readExcel(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException{
		String val="";
		FileInputStream fs=new FileInputStream("./Excel/Data.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
		val=c.getStringCellValue();
		
		return val;
		
		
		
		
		
		
	}

}
