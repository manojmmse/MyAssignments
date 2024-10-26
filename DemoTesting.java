package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTesting 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		//String tit = driver.getTitle();
		
		System.out.println("Title of the Webpage is :"+driver.getTitle());
		System.out.println("Current URL of the Webpage is :"+driver.getCurrentUrl());
		
		WebElement signUp = driver.findElement(By.xpath("//div//input[@id='email']"));
		
		signUp.sendKeys("123456@gmail.com");
		
		WebElement button = driver.findElement(By.xpath("//a//img[@id='enterimg']"));
		
		button.click();
		
		WebElement firstName = driver.findElement(By.xpath("//div//input[@type='text']"));
		
		firstName.sendKeys("Manoj");
		
		WebElement lastName = driver.findElement(By.xpath("(//div//input[@type='text'])[2]"));
		
		lastName.sendKeys("S");
		
		WebElement addRess = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		
		addRess.sendKeys("Coimbatore");
		
		WebElement eMail = driver.findElement(By.xpath("//div//input[@ng-model='EmailAdress']"));
		
		eMail.sendKeys("123@gmail.com");
		
		WebElement pHone = driver.findElement(By.xpath("//div//input[@ng-model='Phone']"));
		
		pHone.sendKeys("8523697415");
		
		WebElement chkBox = driver.findElement(By.xpath("//div//input[@id ='checkbox2']"));
		
		chkBox.click();
		
		WebElement button1 = driver.findElement(By.xpath("//div//input[@value='Male']"));
		
		button1.click();
		
		WebElement Language1 = driver.findElement(By.xpath("//div[@id='msdd']"));
		
		Language1.click();
		
		WebElement Language2 = driver.findElement(By.xpath("//a[text()='Arabic']"));
		
		Language2.click();
		
		WebElement Language3 = driver.findElement(By.xpath("//a[text()='English']"));
		
		Language3.click();		
		
		WebElement sKill = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select s = new Select(sKill);
		
		s.selectByVisibleText("Unix");	
		
		WebElement cOuntry = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select c = new Select(cOuntry);
		
		c.selectByValue("India");
		
		WebElement yearBox = driver.findElement(By.xpath("//select[@id='yearbox']"));
		
		Select y = new Select(yearBox);
		
		y.selectByVisibleText("1992");
		
		WebElement moNth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		
		Select m = new Select(moNth);
		
		m.selectByVisibleText("September");
		
		WebElement dayBox = driver.findElement(By.xpath("//select[@id='daybox']"));
		
		Select d = new Select(dayBox);
		
		d.selectByVisibleText("24");
		
		WebElement passWord = driver.findElement(By.xpath("//div//input[@id='firstpassword']"));
		
		passWord.sendKeys("123456987");

		WebElement validatePassword = driver.findElement(By.xpath("//div//input[@id='secondpassword']"));
		
		validatePassword.sendKeys("123456987");
		
		WebElement signup = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		
		signup.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
