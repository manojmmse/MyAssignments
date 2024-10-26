package testing1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public void Download()  throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml");

		driver.manage().window().maximize();

		String tit = driver.getTitle();

		System.out.println("title -" + tit);

		WebElement downloadElement = driver.findElement(By.xpath("//span[text()='Download']"));

		File dir = new File("C:\\Users\\Divya\\Downloads");
		
		File[] dirContents = dir.listFiles();
		
		int beforeFiles = dirContents.length;
		
		downloadElement.click();
		
		System.out.println(dirContents.length);
		
		Thread.sleep(5000);
		
		dirContents = dir.listFiles();
		
		int afterFiles = dirContents.length;
		
		System.out.println(dirContents.length);
		
		if (afterFiles == beforeFiles + 1) 
		{
			System.out.println("File Downloaded");
		} 
		
		else 
		{
			System.out.println("File Not Downloaded");
		}

		Thread.sleep(3000);
		
		driver.close();
	}

}
