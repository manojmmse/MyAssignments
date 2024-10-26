package testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHoverAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
				
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
		
		System.out.println("title -"+tit);
		
		WebElement signUp = driver.findElement(By.xpath("//div//input[@id='email']"));
		
		signUp.sendKeys("123456@gmail.com");
		
		WebElement button = driver.findElement(By.xpath("//a//img[@id='enterimg']"));
		
		button.click();
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='SwitchTo.html']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@href='Index.html']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele1).perform();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
