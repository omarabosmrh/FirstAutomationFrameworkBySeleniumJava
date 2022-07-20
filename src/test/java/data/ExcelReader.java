package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	static FileInputStream fis=null;
	
	public FileInputStream getFileInputStream() {
		
		String filepath= System.getProperty("user.dir")+
				"/src/test/java/data/ECommerceTestData.xlsx";
		File srcFile=new File(filepath);
		
		try {
			fis= new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			 
			System.out.println("test data file not found, check file path"+e.getMessage());
		}
		
		return fis;
		
	}
	
	public Object [][] getExelData() throws IOException {
		
		
		fis= getFileInputStream();
		XSSFWorkbook wp= new XSSFWorkbook(fis);
		XSSFSheet sheet=wp.getSheetAt(0);
		
		
		int TotalNumberofRows = (sheet.getLastRowNum()+1);
		int TotalNumberofCol=4;
		
		String [] [] arrayExelData= new String [TotalNumberofRows][TotalNumberofCol];
		for (int i = 0; i < TotalNumberofRows; i++) {
			for (int j = 0; j < TotalNumberofCol; j++) {
				XSSFRow row= sheet.getRow(i);
				arrayExelData[i][j]=row.getCell(j).toString();
			}
		}
		
		wp.close();
		
	return arrayExelData;
		
		
	}
	
	
}
