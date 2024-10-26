package pageInteractions;

import java.util.concurrent.TimeUnit;
import pageObjects.SearchProductObjects;

public class SearchProduct extends SearchProductObjects {

	@SuppressWarnings("deprecation")
	public void productSearch() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		waitForElement(driver.findElement(womenMenu));

		waitForElement(driver.findElement(gearMenu));

		waitForElement(driver.findElement(trainingMenu));

		waitForElement(driver.findElement(saleMenu));

		waitForElement(driver.findElement(menMenu));

		hover(driver.findElement(menMenu));

		hover(driver.findElement(menTopsMenu));

		hover(driver.findElement(menTopsHoodiesMenu));

		driver.findElement(menTopsHoodiesMenu).click();

	}

	public void selectSizeColor() {

		waitForElement(driver.findElement(productHoodies));

		scrollDown(driver.findElement(productHoodies));

		driver.findElement(productHoodies).click();
		
		scrollDown(driver.findElement(addToCart));

		driver.findElement(hoodieSizeXL).click();

		driver.findElement(hoodieColorBlack).click();

		driver.findElement(hoodieQuantity).clear();

		driver.findElement(hoodieQuantity).sendKeys("2");

		driver.findElement(addToCart).click();

		waitForElement(driver.findElement(bottomLine));

	}

}
