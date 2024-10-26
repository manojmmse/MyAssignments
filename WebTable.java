package testing1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Divya\\eclipse-workspace\\SamWeb\\src\\main\\resources\\Driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("file:///E:/Excel/WebTable.html");
        driver.manage().window().maximize();
        String tit = driver.getTitle();
        System.out.println("title -" + tit);
        System.out.println("Passed");
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        WebElement row = rows.get(2);
        String s = row.getText();
        System.out.println(s);
        
        // Fetching columns within the first row
        List<WebElement> col = row.findElements(By.tagName("td"));
        for (int i = 0; i < col.size(); i++) {
            WebElement co = col.get(i);
            String c = co.getText();
            System.out.println(c);
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
