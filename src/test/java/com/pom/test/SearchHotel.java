package com.pom.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel extends LoginScreen {
public void funSelect(WebElement element,String data) {
	Select s = new Select(element);
	int a = Integer.parseInt(data);
	s.selectByIndex(a);
	}



}
