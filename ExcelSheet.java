package testing1;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell; // Corrected import statement
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelSheet 
{
	@SuppressWarnings("resource")
	public static void xssfmethod() throws Exception 
	{
		FileInputStream fis = new FileInputStream("E:\\Excel\\Laptop.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		int colnum = 2;
		Row r;
		@SuppressWarnings("unused")
		Cell c;
		for (int i = 0; i < rownum; i++) 
		{
			r = sheet.getRow(i);
			for (int j = 0; j <= colnum; j++) 
			{
				c = r.getCell(j);
				System.out.println(sheet.getRow(i).getCell(j));
				
				//CellType type = c.getCellType();
				//String cellType = String.valueOf(type);
				//System.out.println(type);
				//System.out.println(sheet.getRow(1).getCell(1));
				//String value = c.getStringCellValue();
				//System.out.println(value);
				
				/*switch (cellType) 
				{
				  case "Numeric":
					int val = (int) c.getNumericCellValue();
					String cellVal = String.valueOf(val);
				    System.out.println(cellVal);
				    break;
				    
				  case "String":
					String cellVal1 = 
					c.getStringCellValue();
					System.out.println(cellVal1);
				    break;
				}*/
				
                

			}
		}
	}

	public static void main(String[] args) throws Exception 
	{
		xssfmethod();
	}
}