package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//step 1 base class for creating methods which are reusable
public class Baseclass {
	public static WebDriver driver;
	public static JavascriptExecutor js ;
	public static Select s;
	public static Robot r;
	public static Actions ac ;
//browserlaunch
	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			
			driver =new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
			
		}
		
	}
	
	//maximize
	public static void maximize() {
		
		driver.manage().window().maximize();
	}
	
	//url
	public static void url(String url) {
		driver.get(url);
		
	}
	
	//sendkeys
	public static void sendkeys(WebElement element , String keys) {
		element.sendKeys(keys);
		
		
	}
	
	//selenium click
	public static void click(WebElement element) {
		element.click();
	}
	
	//jsclick
	public static void jsClick(WebElement element) {
		js.executeScript("arguments[0].click();",element);
		
		
	}
	
	//dropdown
	public static void dropdown(WebElement element,String ref, String text) {
		
		s=new Select(element);
		if (ref.equalsIgnoreCase("value")) {
			
			s.selectByValue(text);
			
			
		}else if (ref.equalsIgnoreCase("text")) {
			s.selectByVisibleText(text);
			
		}else if (ref.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(text));
			
		}
	}
	
	//mouse click
	public static void MouseClick(WebElement elements) {
		ac=new Actions(driver);
		ac.click(elements).build().perform();
		
	}
	
	//robot keyboard 
	
	public static void keyboard(String keys) throws AWTException {
		r=new Robot();
		keys.equalsIgnoreCase(keys);
		switch(keys) {
		case "down":r.keyPress(KeyEvent.VK_DOWN);
		break;
		case "enter":r.keyPress(KeyEvent.VK_ENTER);
		break;
		default:System.out.println("illegal key");
			
		}
		
	}
	
	public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
	
	
}

