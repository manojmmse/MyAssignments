package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public void Upload()  throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml");

		driver.manage().window().maximize();
		
		String tit = driver.getTitle();

		System.out.println("title -" + tit);
		
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt89_input']"));
        
        uploadElement.sendKeys("C:\\Users\\Divya\\OneDrive\\Documents\\array.txt");
        		
		Thread.sleep(3000);

		driver.close();

	}

}
