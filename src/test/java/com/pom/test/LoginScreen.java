package com.pom.test;

import org.openqa.selenium.WebElement;

public class LoginScreen extends PomClassRepositary {
	public void typeData(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	public void functionClick(WebElement element) {
		element.click();
	}
}

