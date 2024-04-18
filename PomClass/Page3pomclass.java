package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;

public class Page3pomclass extends Baseclass{
	
	public Page3pomclass() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lasttname;

	public WebElement getlastname() {
		return lasttname;
    }
	
	@FindBy(className="txtarea")
	private WebElement address;

	public WebElement getaddress() {
		return address;
	}

	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccnum;

	public WebElement getccnum() {
		return ccnum;
    }
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement visa;

	public WebElement getvisa() {
      return visa;
    }
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;

	public WebElement getexpmonth() {
		return expmonth;
    }
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;

	public WebElement getexpyear() {
		return expyear;
    }
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;

	public WebElement getcvv() {
		return cvv;
	}
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	public WebElement getbookNow() {
		return bookNow;
	}
	
}
