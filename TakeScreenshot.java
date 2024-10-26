package testing1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TakeScreenshot 
{

	public static void main(String[] args)  
	{
		try {
			TakeScreenShot1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void TakeScreenShot1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		
		takeSnapShot(driver);
		
		String tit = driver.getTitle();
		
		System.out.println("title -"+tit);
		
		driver.quit();
	}
	
	public static void takeSnapShot(WebDriver webdriver) throws Exception
	{
		
		String filename =  new SimpleDateFormat("yyyyhhmmss").format(new Date());
		
		String fileWithPath = "C:\\Users\\Divya\\OneDrive\\Desktop\\New folder\\"+filename+".jpg";
		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile=new File(fileWithPath);
		
		FileUtils.copyFile(SrcFile, DestFile);
		
		System.out.println("Screenshot is captured");
	}

}
