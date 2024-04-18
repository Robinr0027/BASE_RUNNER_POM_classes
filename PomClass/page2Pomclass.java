package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;

public class page2Pomclass extends Baseclass {
	
	public page2Pomclass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebElement getcontinuebtn() {
		return continuebtn;
	}
	
	
	
	

}
