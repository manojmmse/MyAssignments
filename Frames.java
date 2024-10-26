package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
		
		System.out.println("title -"+tit);
		
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(singleFrame);
		
		WebElement firstName1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		firstName1.sendKeys("Manoj");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Single Frame Pass");
		
		Thread.sleep(5000);

		WebElement Multiple = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		
		Multiple.click();
		
		WebElement MultipleFrames = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(MultipleFrames);
		
		WebElement SingleFrame = driver.findElement(By.xpath("//div[@class='iframe-container']//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(SingleFrame);
				
		WebElement firstName = driver.findElement(By.xpath("//input[@type='text']"));
		
		firstName.sendKeys("Manoj");
		
		System.out.println("Multiple Frame Pass");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
