package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

import constant.ConstantClass;

public class ExcelUtilityClass1 


{

		static FileInputStream f;//FileInputStream is an inbuilt class in IO package to read data from file
		static XSSFWorkbook wb;//XSSFWorkbook is an inbuilt class in apachae to read data
		static XSSFSheet   sh;//XSSFSheet is an inbuilkt class in apachae used to read data from sheet
		
		/*public static String getStringData(int a,int b,String sheet) throws IOException
		{
			f=new FileInputStream(ConstantClass.TESTDATAFILE);
			wb= new XSSFWorkbook(f);
			sh=wb.getSheet(sheet);//getSheet is a method used to get values/data from sheet
			XSSFRow r =sh.getRow(a);//XSSFRow inbuilt class of apachae used to take data from row, and method used is getRow
			XSSFCell c = r.getCell(b);//XSSFCell nbuilt class of apachae used to take data from column, and method used is getCell
			return c.getStringCellValue();// is a method used to get string data frm cell
		}
		*/

		    public static String getStringData(int a, int b, String sheet) throws IOException
		    {
		        f = new FileInputStream(ConstantClass.TESTDATAFILE);
		        wb = new XSSFWorkbook(f);
		        sh = wb.getSheet(sheet);

		        XSSFRow r = sh.getRow(a);
		        XSSFCell c = r.getCell(b);

		        DataFormatter formatter = new DataFormatter();
		        return formatter.formatCellValue(c);
		    }
	
		
		
		public static String getIntegerData(int a, int b,String sheet) throws IOException
		{
			f=new FileInputStream(ConstantClass.TESTDATAFILE);
			wb=new XSSFWorkbook(f);
			sh=wb.getSheet(sheet);
			XSSFRow r=sh.getRow(a);
			XSSFCell c=r.getCell(b);
			int x=(int)c.getNumericCellValue();//typecasting. getNumericCellValue method is used to get double value to int and get it
			return String.valueOf(x);//Type conversion is done with valueOf method
			
			
		}
}
