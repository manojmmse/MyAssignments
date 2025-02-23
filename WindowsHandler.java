package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
		
		System.out.println("title -"+tit);
		
		WebElement OpenNewTabbedWindows  = driver.findElement(By.xpath("//a[@href='#Tabbed']"));
		
		OpenNewTabbedWindows.click();
		
		WebElement Click = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		
	    Click.click();
	    
	    Thread.sleep(3000);
	    
	    String parent=driver.getWindowHandle();
	    
	    driver.switchTo().window(parent);
	    
	    Thread.sleep(2000);
	    
		WebElement OpenNewSeperateWindows  = driver.findElement(By.xpath("//a[@href='#Seperate']"));
		
		OpenNewSeperateWindows.click();
		
		WebElement onclick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		onclick.click();
		
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(parent);

	    Thread.sleep(3000);	    
	    
		WebElement OpenSeperateMultipleWindows  = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		
		OpenSeperateMultipleWindows.click();
		
		WebElement onclick1 = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]"));
		
		onclick1.click();
		
		Thread.sleep(3000);
		
	    driver.switchTo().window(parent);

		Thread.sleep(3000);

		driver.quit();


	}

}
