/**
 * 
 *//*
package demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import configurationFactory.ExcelDataFactory;
import configurationFactory.ObjectFactory;

*//**
 * @author Lenovo
 *
 *//*
public class ExcelReading2 {

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
			List<String> extra1  = new ArrayList<String>();
			List<String> extra2  = new ArrayList<String>();
			
			for (int j = 0; j < columns_Sheet1; j++) {
				if(j == 0 ) {
					sheet1Id = ExcelDataFactory.getData("Sheet1", i, j);
				} else if (j == 1) {
					sheet1Pass = ExcelDataFactory.getData("Sheet1", i, j);
				} else {
					try {
						String extra = ExcelDataFactory.getData("Sheet1", i, j);
						extra1.add(extra);
					} catch (Exception e) {
						System.out.println("Failed due to "+e);
					}
				}
			}
			
			for (int j = 0; j < columns_Sheet2; j++) {
				if(j == 0 ) {
					 sheet2Id = ExcelDataFactory.getData("Sheet2", i, j);
				} else if (j == 1) {
					 sheet2Pass = ExcelDataFactory.getData("Sheet2", i, j);
				} else {
					try {
						String extra = ExcelDataFactory.getData("Sheet2", i, j);
						extra2.add(extra);
					} catch (Exception e) {
						System.out.println("Failed due to "+e);
					}
				}
			}
			
			System.out.print(sheet1Id + "sheet1"+ sheet1Pass + " ");
			for (String str : extra1)
				System.out.print(str + " ");
			System.out.println(" ");
			
			System.out.print(sheet2Id + "sheet2"+ sheet2Pass + " ");
			for (String str2 : extra2)
			System.out.print(str2 + " ");
			System.out.println("");

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