/**
 * 
 *//*
package demo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import configurationFactory.ExcelDataFactory;
import configurationFactory.ObjectFactory;

*//**
 * @author Lenovo
 *
 *//*
public class ExcelReading3 {

	@Test
	public void excelReadingData() {

		ObjectFactory.getExcelClass();

		int rows_Sheet1 = ExcelDataFactory.getRowCount("Sheet1");

		int columns_Sheet1 = ExcelDataFactory.getColumnCount("Sheet1");

		System.out.println("Count of column:" + columns_Sheet1);

//		int rows_Sheet2 = ExcelDataFactory.getRowCount("Sheet2");

		int columns_Sheet2 = ExcelDataFactory.getColumnCount("Sheet2");

		for (int i = 0; i < rows_Sheet1 - 1; i++) {

			List<String> extra1 = new ArrayList<String>();
			List<String> extra2 = new ArrayList<String>();
			
			for (int j = 0; j < columns_Sheet1; j++) {
				try {
					String extra = ExcelDataFactory.getData("Sheet1", i, j);
					extra1.add(extra);
				} catch (Exception e) {
					System.out.println("Failed due to " + e);
				}
			}

			for (int j = 0; j < columns_Sheet2; j++) {
				try {
					String extra = ExcelDataFactory.getData("Sheet2", i, j);
					extra2.add(extra);
				} catch (Exception e) {
					System.out.println("Failed due to " + e);
				}
			}

			for (String str : extra1)
				System.out.print(str + " ");
			System.out.println(" ");

			for (String str2 : extra2)
				System.out.print(str2 + " ");
			System.out.println("");

			
			 * for (int m = 0; m < rows_Sheet2; m++) {
			 * 
			 * for (int n = 0; n < columns_Sheet2-1; n++) {
			 * 
			 * // System.out.println(" ");
			 * 
			 * String data1 = ExcelDataFactory.getData("Sheet2", m, n+1);
			 * 
			 * System.out.print(data1 + " ");
			 * 
			 * 
			 * }
			 * 
			 * }
			 
		}

	}

}
*/