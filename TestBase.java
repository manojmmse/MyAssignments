package testUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    public static WebDriver driver;

    @SuppressWarnings("deprecation")
	public void browserInitialization(String url) {
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);

        String title = driver.getTitle();
        System.out.println("Title - " + title);
    }

    public void waitForElement(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
    }

    public String getTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
    }

    public void scrollDown(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollUP(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", element); // Fixed the comma
    }

    public void hover(WebElement element) {
        new Actions(driver).moveToElement(element).perform();
    }

    public void rightClick(WebElement element) {
        new Actions(driver).contextClick(element).perform();
    }

    public void doubleClick(WebElement element) {
        new Actions(driver).doubleClick(element).perform();
    }

    public void dropdown(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }

    public void dropdownIndex(WebElement option, int index) {
        new Select(option).selectByIndex(index);
    }

    public void explicitVisibility(WebElement element) 
    {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
    }

    public void explicitClickable(WebElement element) 
    {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void screenshot(WebDriver driver, String name) throws Exception {
        String filePath = "C:\\Users\\Divya\\Documents\\Selenium Screenshots\\" + name + ".png";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(filePath));
        System.out.println("Screenshot taken successfully");
    }

    public void storeCreatedAccountDetails(String userName, String password) throws Exception {
        String path = "C:\\Users\\Divya\\Documents\\credentials.xlsx";
        try (FileInputStream fs = new FileInputStream(path);
             XSSFWorkbook wb = new XSSFWorkbook(fs);
             FileOutputStream fos = new FileOutputStream(path)) {
             
            XSSFSheet sheet = wb.getSheetAt(0);
            int lastRow = sheet.getLastRowNum();
            Row row = sheet.createRow(lastRow + 1);
            row.createCell(0).setCellValue(userName);
            row.createCell(1).setCellValue(password);
            wb.write(fos);
        }
    }

    public HashMap<String, String> getStoredAccountDetails() throws Exception {
        String path = "C:\\Users\\Divya\\Documents\\credentials.xlsx";
        HashMap<String, String> credentials = new HashMap<>();
        
        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
             
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row r = sheet.getRow(sheet.getLastRowNum());
            if (r != null) {
                credentials.put("userMail", r.getCell(0).getStringCellValue());
                credentials.put("userPassword", r.getCell(1).getStringCellValue());
            }
        }
        return credentials;
    }
}
