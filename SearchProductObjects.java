package pageObjects;

import org.openqa.selenium.By;
import testUtils.TestBase;

public class SearchProductObjects extends TestBase {

	public By bottomLine = By.xpath("//small[@class='copyright']/span");

	public By menMenu = By.xpath("//span[text()='Men']");

	public By womenMenu = By.xpath("//span[text()='Women']");

	public By gearMenu = By.xpath("//span[text()='Gear']");

	public By trainingMenu = By.xpath("//span[text()='Training']");

	public By saleMenu = By.xpath("//span[text()='Women']");

	public By menTopsMenu = By.xpath("//a[@id='ui-id-17']//span[text()='Tops']");

	public By menTopsHoodiesMenu = By.xpath("(//span[text()='Hoodies & Sweatshirts'])[2]");

	public By productHoodies = By.xpath("//strong[@class='product name product-item-name']//a[contains(text(),'Bruno ')]");

	public By hoodieSizeXL = By.xpath("(//div[@class='swatch-option text'])[5]");

	public By hoodieColorBlack = By.xpath("//div[@option-label='Black']");

	public By hoodieQuantity = By.xpath("//div//input[@id='qty']");

	public By addToCart = By.xpath("//button[@id='product-addtocart-button']");

}
