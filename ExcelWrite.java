package testing1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelWrite 
{
	public static void writeExcel(String brandname, String generation, String processor) throws Exception 
	{
		String path = "E:\\Excel\\Laptop.xlsx";
		FileInputStream fs = new FileInputStream(path);
		try (XSSFWorkbook wb = new XSSFWorkbook(fs)) 
		{
			XSSFSheet sheet1 = wb.getSheetAt(0);
			int lastRow = sheet1.getLastRowNum();
			XSSFRow row = sheet1.createRow(lastRow + 1);
			Cell cell = row.createCell(0);
			Cell cell1 = row.createCell(1);
			Cell cell2 = row.createCell(2);
			cell.setCellValue(brandname);
			cell1.setCellValue(generation);
			cell2.setCellValue(processor);
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
			fos.close();
		}
		
		System.out.println("passed");
	}

	public static void main(String[] args) throws Exception 
	{
		writeExcel("Macbook", "A4", "Intel");
	}
}