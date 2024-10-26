package pageObjects;

import org.openqa.selenium.By;
import testUtils.TestBase;

public class LoginPage extends TestBase 
{

	protected By createAccount = By.xpath("//div[@class='panel header']//a[text()='Create an Account']");

	public By personalInfo = By.xpath("//span[text()='Personal Information']");

	public By firstname = By.xpath("//input[@id='firstname']");

	public By lastName = By.xpath("//input[@id='lastname']");

	public By signInInfo = By.xpath("//span[text()='Sign-in Information']");

	public By email = By.xpath("//input[@name='email']");

	public By pass = By.xpath("//input[@id='password']");

	public By confirmPass = By.xpath("//input[@id='password-confirmation']");

	public By submitCreateanAccountBtn = By.xpath("//button[@type='submit']//span[text()='Create an Account']");
	
	public By accMenuDropdown = By.xpath("(//button[@class='action switch'])[1]");
	
	public By signOut = By.xpath("(//div[@class='customer-menu'])[1]/ul/li[3]/a[contains(text(),'Sign ')]");

	public By signIn = By.xpath("(//li[@class='authorization-link'])[1]//a");

	public By signInEmail = By.xpath("//input[@name='login[username]']");

	public By signInPass = By.xpath("//input[@name='login[password]']");

	public By signSubmitBtn = By.xpath("(//button[@id='send2']/span[text()='Sign In'])[1]");
	
	public By verifyLoggedIn = By.xpath("//div[@class='panel header']//ul[@class='header links']//li//span[@class='logged-in']");

}
