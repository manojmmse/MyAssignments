package testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Alert 
{
	@Test
	public void AlertTestNG() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
		
		System.out.println("title -"+tit);
		
		WebElement AlertwithOK = driver.findElement(By.xpath("//a[@href='#OKTab']"));
		
		AlertwithOK.click();
		
		WebElement button = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		button.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		WebElement AlertwithOKCancel  = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		
		AlertwithOKCancel.click();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		
		button1.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		WebElement AlertwithTextbox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		
		AlertwithTextbox.click();
		
		WebElement promptbox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		promptbox.click();
				
		driver.switchTo().alert().sendKeys(Keys.chord(Keys.CONTROL + "a"));
		
		driver.switchTo().alert().sendKeys(Keys.chord(Keys.BACK_SPACE));
		
		driver.switchTo().alert().sendKeys("Hai Manoj");
		
		driver.switchTo().alert().accept();

		Thread.sleep(5000);		
		
		System.out.println("Alert Page Pass");		
		
		driver.quit();
	}

}
