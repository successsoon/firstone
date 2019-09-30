package com.pom.test;

import org.openqa.selenium.WebElement;

public class BookAHotel extends SelectHotel {
	/*public void typeData(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	
	public void funSelect(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
		}*/
	public void functionClick(WebElement element) {
		element.click();
	
}
}
