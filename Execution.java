package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageInteractions.LoginInteraction;
import pageInteractions.Payment;
import pageInteractions.SearchProduct;
import testUtils.TestBase;

public class Execution extends TestBase {

	@BeforeTest
	public void Initialization() {
		browserInitialization("https://magento.softwaretestingboard.com/");
	}

	@Test(priority = 0, enabled = true)
	public void createAndLogin() throws Exception {
		LoginInteraction l = new LoginInteraction();
		l.createacc();
		l.loginAccount();

	}

	@Test(priority = 1, enabled = true)
	public void searchProduct() {
		SearchProduct s = new SearchProduct();
		s.productSearch();
		s.selectSizeColor();

	}

	@Test(priority = 2, enabled = true)
	public void payment() throws Exception {
		Payment p = new Payment();
		p.checkout();
		p.payment();
	

	}

	@AfterTest
	public void browserClose() {
		driver.quit();

	}
}
