package testing1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcel
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception 
	{
		String path = "E:\\Excel\\Laptop.xlsx";
		
		FileInputStream fi = new FileInputStream(path);
		
		Workbook wb = new XSSFWorkbook(fi);
		
		Sheet sh = wb.getSheetAt(0);
		
		int lastRow = sh.getLastRowNum();
		
		for (int i = 0; i <= lastRow; i++) 
			
		{
			Row row = sh.getRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue("Manoj");
			
		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
	}
}
