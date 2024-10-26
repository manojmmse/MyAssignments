package pageInteractions;

import java.util.HashMap;

import pageObjects.LoginPage;

public class LoginInteraction extends LoginPage {

	public void createacc() throws Exception {

		driver.findElement(createAccount).click();

		waitForElement(driver.findElement(personalInfo));

		driver.findElement(firstname).sendKeys("Forza");

		driver.findElement(lastName).sendKeys(getTimeStamp());

		waitForElement(driver.findElement(signInInfo));

		String userName = "Forza" + getTimeStamp() + "@gmail.com";

		String newPassword = "ABC@abc123.";

		storeCreatedAccountDetails(userName, newPassword);

		driver.findElement(email).sendKeys(userName);

		driver.findElement(pass).sendKeys(newPassword);

		driver.findElement(confirmPass).sendKeys(newPassword);

		Thread.sleep(3000);

		driver.findElement(submitCreateanAccountBtn).click();

	}

	public void loginAccount() throws Exception {
		
		driver.findElement(accMenuDropdown).click();
		
		driver.findElement(signOut).click();
		
		Thread.sleep(5000);
	
		waitForElement(driver.findElement(signIn));

		driver.findElement(signIn).click();

		HashMap<String, String> data = getStoredAccountDetails();

		driver.findElement(signInEmail).sendKeys(data.get("userMail"));

		driver.findElement(signInPass).sendKeys(data.get("userPassword"));

		driver.findElement(signSubmitBtn).click();

		String greeting = driver.findElement(verifyLoggedIn).getText();

		System.out.println(greeting);

	}
}
