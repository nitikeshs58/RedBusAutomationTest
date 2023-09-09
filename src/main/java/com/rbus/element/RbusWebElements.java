package com.rbus.element;

import org.openqa.selenium.By;

public class RbusWebElements {

	public static By FROM_LOCATION = By.xpath("//input[@id='src']");
	public static By TO_LOCATION = By.xpath("//input[@id='dest']");
	public static By DATE = By.xpath("//*[@id='onwardCal']");
	public static By ACTIVE_DATE = By.xpath("//*[contains(@class,'DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw')]");
	public static By SEARCH_BUTTON = By.xpath("//*[@id='search_button']");
}
