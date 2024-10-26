package testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
		
		System.out.println("title -"+tit);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);

		action.contextClick(element).perform();
				
		WebElement Copy = driver.findElement(By.xpath("//span[text()='Copy']"));			

		Copy.click();
		
		Thread.sleep(3000);
				
		driver.quit();		
		
	}

}
