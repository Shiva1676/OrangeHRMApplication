/**
 * 
 */
package configurationFactory;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Lenovo
 *
 */
public class ExcelDataFactory {

	static FileInputStream fis;

	static XSSFWorkbook wb;

	public ExcelDataFactory() {

		String path = System.getProperty("user.dir") + "/TestData/LoginData.xlsx";

		File src = new File(path);

		try {
			fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("==========Excel is not loaded==========");

			System.out.println(e.getMessage());

		}
	}

	public int getRowCount(String sheetName) {

		int rows = wb.getSheet(sheetName).getPhysicalNumberOfRows();

		return rows;
	}

	public  int getColumnCount(String sheetName) {

		int columns = wb.getSheet(sheetName).getRow(0).getLastCellNum();

		return columns;
	}
	
	
	public  String getData(String sheetName, int row, int column){
		
		XSSFCell cell = wb.getSheet(sheetName).getRow(row).getCell(column);
		
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(cell);
		
		return value;
		
	}

}
