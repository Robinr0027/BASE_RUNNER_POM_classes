package com.RunnerClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;

import com.BaseClass.Baseclass;
import com.PomClass.Page1POMclass;
import com.PomClass.Page3pomclass;
import com.PomClass.Page4PomClass;
import com.PomClass.loginPOMclass;
import com.PomClass.page2Pomclass;
//base class has main method

public class RunnerClass extends Baseclass{
	
	public static void main(String[] args) throws AWTException {
		launchBrowser("chrome");
		maximize();
		url("https://adactinhotelapp.com/");
		
		//creating object for loginpom class to access loginpom class methods
		loginPOMclass lg =new loginPOMclass();
		
		//username
		sendkeys(lg.getusername(), "robin0027");
		//password
		sendkeys(lg.getpass(), "LOKSK3");
		//loginbtn
		click(lg.getbutton());
		
		//creating object for page1 class
		Page1POMclass pg1 =new Page1POMclass();          //page1
		
		//location dropdown
		dropdown(pg1.getlocation(),"value","London");
		//select hotels
		MouseClick(pg1.getSelecthotels());
		keyboard("down");
		keyboard("down");
		keyboard("down");
		keyboard("enter");
		
		//room type
		dropdown(pg1.getRoomType(), "text", "Double");
		
		//room no
		click(pg1.getRoomNO());
		keyboard("down");
		keyboard("down");
		keyboard("down");
		keyboard("enter");
		
		//checkin
		sendkeys(pg1.getCheckin(), "27/03/2023");
		
		//checkout
		sendkeys(pg1.getCheckout(), "29/03/2023");
		
		//searchbtn
	click(pg1.getsearchbtn());
	
	page2Pomclass pg2 =new page2Pomclass();            //page2
	  //radio buton
	click(pg2.getRadiobutton());
	
	//continue button
	click(pg2.getcontinuebtn());
	
	
	Page3pomclass pg3 =new Page3pomclass();          //page3
	
	//wait 
	
	implicitwait(15);
	//firstname
	sendkeys(pg3.getFirstname(), "robin");
	
    //lastname
	sendkeys(pg3.getlastname(), "R");
	
	//address
	sendkeys(pg3.getaddress(), "perambur");
	
	//ccnum
	sendkeys(pg3.getccnum(),"0123456789123456");
	
	//visa
	dropdown(pg3.getvisa(),"value", "VISA");
	
	//expmonth
	dropdown(pg3.getexpmonth(), "index", "1");
	
	//expyear
	dropdown(pg3.getexpyear(), "index", "15");
	
	//cvv
	sendkeys(pg3.getcvv(), "123");
	
	//booknow
	click(pg3.getbookNow());
	 
	Page4PomClass pg4 =new Page4PomClass();        //page4
	
	//wait 
	implicitwait(15);
	
	//logout
	click(pg4.getlogout());
		
	
	
	
	}
	

}
