package pageObjects;

import org.openqa.selenium.By;
import testUtils.TestBase;

public class CheckoutAndPayment extends TestBase 
{

	public By addCartSymbol = By.xpath("//a[@class='action showcart']");

	public By proceedToChechout = By.xpath("//button[@id='top-cart-btn-checkout']");

	public By companyTxtbox = By.xpath("//input[@name='company']");

	public By addressTxtbox1 = By.xpath("//input[@name='street[0]']");

	public By addressTxtbox2 = By.xpath("//input[@name='street[1]']");

	public By addressTxtbox3 = By.xpath("//input[@name='street[2]']");

	public By cityTxtbox = By.xpath("//input[@name='city']");

	public By stateDropdown = By.xpath("//select[@name='region_id']");

	public By postalCodeTxtBox = By.xpath("//input[@name='postcode']");

	public By countryDropdown = By.xpath("//select[@name='country_id']");

	public By phoneNumberTxtbox = By.xpath("//input[@name='telephone']");
	
	public By radioBtnShippingmethods = By.xpath("//td[text()='Flat Rate']");

	public By shippingMethodsHeader = By.xpath("//div[text()='Shipping Methods']");

	public By nextBtn = By.xpath("//button[@type='submit']//span[text()='Next']");

	public By billingAddress = By.xpath("//div[@class='billing-address-details']");

	public By shippingAddress = By.xpath("(//div[@class='shipping-information-content'])[1]");

	public By placeOrderBtn = By.xpath("//span[text()='Place Order']");

	public By orderId = By.xpath("//a[@class='order-number']//strong");

	public By continueShopping = By.xpath("//span[text()='Continue Shopping']");

	public By accMenuDropdown = By.xpath("(//button[@class='action switch'])[1]");

	public By signOut = By.xpath("(//div[@class='customer-menu'])[1]/ul/li[3]/a[contains(text(),'Sign ')]");

}
