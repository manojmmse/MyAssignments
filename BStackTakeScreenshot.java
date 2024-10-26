package testing1;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BStackTakeScreenshot {
	@Test
	public void testBStackTakeScreenShot() throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
//goto url
		driver.get("https://www.browserstack.com");
//Call take screenshot function
		BStackTakeScreenshot.takeSnapShot(driver, "c://test.png");
	}

	/**
	 * This function will take screenshot
	 * 
	 * @param webdriver
	 * @param fileWithPath
	 * @throws Exception
	 */
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
//Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
		File DestFile = new File(fileWithPath);
//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}
