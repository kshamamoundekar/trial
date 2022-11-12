package practice_program;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization_loop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File X=new File("C:\\Users\\Admin\\Desktop\\Velocity\\Your Holding Details - K364607.xlsx");
		
		Cell book = WorkbookFactory.create(X).getSheet("Sheet1").getRow(0).getCell(0);
		
		CellType type = book.getCellType();
		
		System.out.println(type);
		
		
	}
	
}
