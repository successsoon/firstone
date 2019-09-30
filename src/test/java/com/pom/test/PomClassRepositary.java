package com.pom.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassRepositary extends BaseClassClassCreation {
PomClassRepositary(){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='text']")
private WebElement name;

@FindBy(xpath="//input[@type=\"password\"]")
private WebElement password;
@FindBy(xpath="//input[@type='Submit']")
private WebElement login;

@FindBy(xpath="//select[@name=\"location\"]")
private WebElement SearchLocation;

@FindBy(xpath="//select[@name='hotels']")
private WebElement SearchHotel;

@FindBy(xpath="//select[@name='room_type']")
private WebElement roomType;

@FindBy(xpath="//select[@name='room_nos']")
private WebElement noOfRooms;

@FindBy(xpath="//input[@name=\"datepick_in\"]")
private WebElement datePickIn;

@FindBy(xpath="//input[@name=\"datepick_out\"]")
private WebElement datePickOut;

@FindBy(xpath="//select[@name=\"adult_room\"]")
private WebElement noOfAdults;

@FindBy(xpath="//select[@name=\"child_room\"]")
private WebElement noOfChild;

@FindBy(xpath="//input[@id='Submit']")
private WebElement Search;
@FindBy(xpath="//input[@name=\"radiobutton_0\"]")
private WebElement radButton;

@FindBy(xpath="//input[@type='submit']")
private WebElement continuebut;

@FindBy(xpath="//input[@type='button']")
private WebElement cancel;

@FindBy(xpath="//input[@name='first_name']")
private WebElement firstName;

@FindBy(xpath="//input[@name='last_name']")
private WebElement lastName;

@FindBy(xpath="//textarea[@name=\"address\"]")
private WebElement addressField;

@FindBy(xpath="//input[@name=\"cc_num\"]")
private WebElement creditCard;
@FindBy(xpath="//select[@id='cc_type']")
private WebElement CCType;

@FindBy(xpath="//select[@name=\"cc_exp_month\"]")
private WebElement expDate;

@FindBy(xpath="//select[@name=\"cc_exp_year\"]")
private WebElement expYear;

@FindBy(xpath="(//input[@class='reg_input'])[4]")
private WebElement cvvNumber;

@FindBy(xpath="(//input[@type='button'])[1]")
private WebElement bookNow;

@FindBy(xpath="(//input[@name='cancel'])")
private WebElement bookcancel;

@FindBy(xpath="(//input[@name='order_no'])")
private WebElement ordernumber;

@FindBy(xpath="//input[@name='logout']")
private WebElement logout;

public WebElement getSearchLocation() {
	return SearchLocation;
}

public WebElement getSearchHotel() {
	return SearchHotel;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoOfRooms() {
	return noOfRooms;
}

public WebElement getDatePickIn() {
	return datePickIn;
}

public WebElement getDatePickOut() {
	return datePickOut;
}

public WebElement getNoOfAdults() {
	return noOfAdults;
}

public WebElement getNoOfChild() {
	return noOfChild;
}
public WebElement getSearch() {
	return Search;
}

public WebElement getRadButton() {
	return radButton;
}

public WebElement getContinuebut() {
	return continuebut;
}

public WebElement getCancel() {
	return cancel;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getAddressField() {
	return addressField;
}

public WebElement getCreditCard() {
	return creditCard;
}

public WebElement getCCType() {
	return CCType;
}
public WebElement getExpDate() {
	return expDate;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvvNumber() {
	return cvvNumber;
}

public WebElement getBookNow() {
	return bookNow;
}

public WebElement getBookcancel() {
	return bookcancel;
}

public WebElement getOrdernumber() {
	return ordernumber;
}

public WebElement getLogout() {
	return logout;
}

public WebElement getName() {
	return name;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

}