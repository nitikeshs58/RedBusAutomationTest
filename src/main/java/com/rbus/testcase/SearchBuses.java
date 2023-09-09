package com.rbus.testcase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.rbus.base.BaseSetup;
import com.rbus.base.EnvProps;
import com.rbus.element.RbusWebElements;

public class SearchBuses extends BaseSetup {
	SoftAssert soft;
	Actions action;

	@BeforeTest
	public void SetUp() {
		driver = getDriver();
		action = new Actions(driver);
	}

	@BeforeMethod
	public void beforeMethod() {
		soft = new SoftAssert();
	}

	@Test(priority = 0)
	public void openUrl() {
		driver.get(EnvProps.baseUrl);
	}

	@Test(priority = 1)
	public void searchTravelLocations() throws InterruptedException {
//		driver.findElement(RbusWebElements.FROM_LOCATION).clear();
		Thread.sleep(4000);
		driver.findElement(RbusWebElements.FROM_LOCATION).sendKeys("Pune");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//		driver.findElement(RbusWebElements.TO_LOCATION).clear();
		Thread.sleep(4000);
		driver.findElement(RbusWebElements.TO_LOCATION).sendKeys("Nanded");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER);
	}

	@Test(priority = 2)
	public void selectDate() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(RbusWebElements.DATE).click();
		Thread.sleep(2000);
		driver.findElement(RbusWebElements.ACTIVE_DATE).click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void searchButtonFunctionalityTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(RbusWebElements.SEARCH_BUTTON).click();
	}

	@AfterMethod
	public void afterMethod() {
		// ScreenShot
	}

//	@AfterTest(alwaysRun = true)
//	public void quitBrowser() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

}
