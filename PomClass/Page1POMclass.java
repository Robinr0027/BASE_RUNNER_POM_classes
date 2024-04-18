package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;

public class Page1POMclass extends Baseclass {
public Page1POMclass() {
	
	 PageFactory.initElements(driver,this);

}

@FindBy(xpath="//select[@name='location']")
private WebElement location;

public WebElement getlocation() {
	return location;
}

@FindBy(xpath="//select[@id='hotels']")
private WebElement selecthotels;

public WebElement getSelecthotels() {
	return selecthotels;
}
@FindBy(xpath="//select[@name='room_type']")
private WebElement roomType;

public WebElement getRoomType() {
	return roomType;
}

@FindBy(id="room_nos")
private WebElement roomNO;

public WebElement getRoomNO() {
	return roomNO;
}

@FindBy(xpath="//input[@id='datepick_in']")
private WebElement checkin;

public WebElement getCheckin() {
	return checkin;
}
@FindBy(xpath="//input[@id='datepick_in']")
private WebElement checkout;

public WebElement getCheckout() {
	return checkout;
}

@FindBy(xpath="(//input[contains(@class,'reg_button')])[1]")
private WebElement searchbtn;

public WebElement getsearchbtn() {
	return searchbtn;
}



}
