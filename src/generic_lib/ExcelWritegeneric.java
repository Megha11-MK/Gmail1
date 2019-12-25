package  generic_lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWritegeneric {

	public static void writetoexcel(String sheet,int row,int cell,String data1) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fin= new FileInputStream("./Excel/Data.xlsx");
		Workbook wb=WorkbookFactory.create(fin);
		Cell c=wb.getSheet(sheet).getRow(row).createCell(cell);
		c.setCellValue(data1);
		FileOutputStream fout=new FileOutputStream("./Excel/data.xlsx");
		wb.write(fout);
		
		
	}
	
	
	
}
