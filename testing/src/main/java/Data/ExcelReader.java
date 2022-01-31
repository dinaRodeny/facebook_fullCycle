package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.empty.blank.cell;


public class ExcelReader {

	static FileInputStream fis = null ; 
	static XSSFSheet sheet1;
	static int TotalNumberOfRows;
	static int TotalNumberOfCols;
	static String[][] arrayExcelData;
	
	public FileInputStream getFileInputStream() 
	{
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\Data\\dina.xlsx"; 
		File srcFile = new File(filePath);
		
		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found. treminating Process !! : Check file path of TestData");
			System.exit(0);
		}
		return fis ; 
	}
	
	public Object[][] getExcelData() throws IOException
	{
		fis = getFileInputStream(); 
		//System.out.println("1");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//System.out.println("2");
		 sheet1 = wb.getSheetAt(0); 
		//System.out.println("3");
		
		TotalNumberOfRows = (sheet1.getLastRowNum()+1);
		//System.out.println("TotalNumberOfRows");
		//System.out.println(TotalNumberOfRows);
		 TotalNumberOfCols = sheet1.getRow(0).getLastCellNum(); 
		
		//System.out.println("5");
		
		arrayExcelData = new String[TotalNumberOfRows-1][TotalNumberOfCols-1] ; 
		//System.out.println("6");
		
		for (int i = 1; i < TotalNumberOfRows; i++) 
		{
			
			for (int j = 1; j < TotalNumberOfCols; j++) 
			{
				//System.out.println("column");
				XSSFRow row = sheet1.getRow(i);
				//if (((row.getCell(j).toString()) != (null)) && ((row.getCell(0)) != (null)))
				//{
				arrayExcelData[i-1][j-1] = row.getCell(j).toString(); 
				System.out.println(arrayExcelData[i-1][j-1] );
				//}
			
				
				
			}
		}
	
		
		
		
		//wb.close();
		return arrayExcelData; 
	}
}
