/**
 * 
 *//*
package demo;

import java.io.File;

import org.testng.annotations.Test;

import configurationFactory.ExcelDataFactory;
import configurationFactory.ObjectFactory;

*//**
 * @author Lenovo
 *
 *//*
public class ExcelReading {

	@Test
	public void excelReadingData() {

		ObjectFactory.getExcelClass();

		int rows_Sheet1 = ExcelDataFactory.getRowCount("Sheet1");

		int columns_Sheet1 = ExcelDataFactory.getColumnCount("Sheet1");
		
		System.out.println("Count of column:"+ columns_Sheet1);

		int rows_Sheet2 = ExcelDataFactory.getRowCount("Sheet2");

		int columns_Sheet2 = ExcelDataFactory.getColumnCount("Sheet2");

		for (int i = 0; i < rows_Sheet1-1; i++) {
			String sheet1Id = "";
			String sheet2Id = "";
			String sheet1Pass = "";
			String sheet2Pass = "";
			
			for (int j = 0; j < columns_Sheet1; j++) {
				if(j == 0 ) {
					sheet1Id = ExcelDataFactory.getData("Sheet1", i, j);
					 sheet2Id = ExcelDataFactory.getData("Sheet2", i, j);
				} else if (j == 1) {
					sheet1Pass = ExcelDataFactory.getData("Sheet1", i, j);
					 sheet2Pass = ExcelDataFactory.getData("Sheet2", i, j);
				} else {
					try {
						String extra1 = ExcelDataFactory.getData("Sheet1", i, j);
						String extra2 = ExcelDataFactory.getData("Sheet2", i, j);
						System.out.println("Extra column value : "+extra1+"----"+extra2);	
					} catch (Exception e) {
						System.out.println("Failed due to "+e);
					}
				}
			}
			
			System.out.println(sheet1Id + "sheet1"+ sheet1Pass);
			System.out.println(sheet2Id + "sheet2"+ sheet2Pass);

			for (int m = 0; m < rows_Sheet2; m++) {

				for (int n = 0; n < columns_Sheet2-1; n++) {

					// System.out.println(" ");

					String data1 = ExcelDataFactory.getData("Sheet2", m, n+1);

					System.out.print(data1 + " ");
					
				
				}

			}

		}

	}

}
*/