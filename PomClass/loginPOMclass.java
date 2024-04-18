package com.PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;
//step 2 pom class for web elements
public class loginPOMclass extends Baseclass {
	//creating constructor here
	public loginPOMclass() {
		
		//page factory - syntax is used coz it gets all the web elements
		//we passing arguments driver and this keyword.// driver is for @findelemts 
		//this keyword is to access all the methods in class
		 PageFactory.initElements(driver,this);
	}
	/*WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	 * converting this code to @findby
	 */
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	public WebElement getusername() {                      //rightclick->source->generate getter and setter
		return username;
		
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass ;
	
	public WebElement getpass() {                      
		return pass;
		
	}
	
	@FindBy(xpath="//input[@class='login_button']")
	private WebElement button ;
	
	public WebElement getbutton() {                      
		return button;
		
	}
	
	
	
	

}
