package pageInteractions;

import org.openqa.selenium.WebElement;
import pageObjects.CheckoutAndPayment;

public class Payment extends CheckoutAndPayment {

	public void checkout() throws Exception {

//		scrollDown(driver.findElement(addCartSymbol));

		waitForElement(driver.findElement(addCartSymbol));

		explicitClickable(driver.findElement(addCartSymbol));

		Thread.sleep(10000);

		driver.findElement(addCartSymbol).click();

		driver.findElement(proceedToChechout).click();

		driver.findElement(companyTxtbox).sendKeys("VR46");

		driver.findElement(addressTxtbox1).sendKeys("12 west street");

		driver.findElement(addressTxtbox2).sendKeys("Sirjii Street");

		driver.findElement(addressTxtbox3).sendKeys("near petrolbunk");

		driver.findElement(cityTxtbox).sendKeys("Madurai");

		Thread.sleep(5000);

		explicitClickable(driver.findElement(nextBtn));

		dropdown(driver.findElement(countryDropdown), "India");

		dropdown(driver.findElement(stateDropdown), "Tamil Nadu");

		driver.findElement(postalCodeTxtBox).sendKeys("654123");

		driver.findElement(phoneNumberTxtbox).sendKeys("9876543215");

		waitForElement(driver.findElement(shippingMethodsHeader));

		driver.findElement(radioBtnShippingmethods).click();

		Thread.sleep(10000);

		explicitVisibility(driver.findElement(nextBtn));

		explicitClickable(driver.findElement(nextBtn));

		scrollDown(driver.findElement(nextBtn));

		driver.findElement(nextBtn).click();

	}

	public void payment() throws Exception {

		waitForElement(driver.findElement(billingAddress));

		waitForElement(driver.findElement(shippingAddress));

		String billingAdd = driver.findElement(billingAddress).getText();

		System.out.println("Billing - " + billingAdd);

		String shippinAdd = driver.findElement(shippingAddress).getText();

		System.out.println("Shipping - " + shippinAdd);

		driver.findElement(placeOrderBtn).click();

		System.out.println("Address entered is correct");

		WebElement orderID = driver.findElement(orderId);

		System.out.println("Order I'd - " + orderID);

		screenshot(driver, "ID");

		driver.findElement(accMenuDropdown).click();

	}

	public void logout() {

		hover(driver.findElement(accMenuDropdown));

		driver.findElement(accMenuDropdown).click();

		driver.findElement(signOut).click();

	}
}
