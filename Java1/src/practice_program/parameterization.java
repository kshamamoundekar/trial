package practice_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {
	
	public static void main(String[] args) throws IOException {
		
		File X=new File("C:\\Users\\Admin\\Desktop\\Velocity\\Your Holding Details - K364607.xlsx");
		
		Sheet A = WorkbookFactory.create(X).getSheet("Sheet1");
		
		int row = A.getLastRowNum();
		
		short cell = A.getRow(row).getLastCellNum();
		
		for(int x=0;x<=row;x++) {
			for(int y=0;y<=cell-1;y++) {
				
				Cell i = A.getRow(x).getCell(y);
				System.out.print(i+" | ");
			}
			System.out.println();
			
			
		}
		
		
	}

}
