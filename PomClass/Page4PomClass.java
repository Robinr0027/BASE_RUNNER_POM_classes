package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;

public class Page4PomClass extends Baseclass{
	public Page4PomClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getlogout() {
		return logout;
	}
	
	
	

}
