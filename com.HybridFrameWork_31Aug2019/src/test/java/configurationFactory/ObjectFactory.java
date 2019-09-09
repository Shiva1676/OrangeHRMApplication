/**
 * 
 */
package configurationFactory;

/**
 * @author Lenovo
 *
 */
public class ObjectFactory {

	public static PropertiesData getPropertyClass(){
		
		PropertiesData pro = new PropertiesData();
		
		return pro;
	}
	
	public static ExcelDataFactory getExcelClass(){
		
		ExcelDataFactory excel = new ExcelDataFactory();
		
		return excel;
	}
	
}
