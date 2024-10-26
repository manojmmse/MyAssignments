package testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws Exception 
	{
		//Chrome Browser Launch
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		//System.out.println("Chrome Driver Passed Successfully");
		
		//Edge Browser Launch
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\edgedriver_win64\\msedgedriver.exe");
		//System.out.println("Edge Driver Passed Successfully");

		//WebDriver Manager Using
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		System.out.println("Title of the Webpage is :"+driver.getTitle());
		System.out.println("Current URL of the Webpage is :"+driver.getCurrentUrl());
		driver.quit();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.google.co.in/");
		driver1.manage().window().maximize();
		System.out.println("Title of the Webpage is :"+driver1.getTitle());
		System.out.println("Current URL of the Webpage is :"+driver1.getCurrentUrl());
		driver1.quit();



	}

}
