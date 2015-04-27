package com.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserCommand {

	/**
	 * @param args
	 */
	private static WebDriver driver = null;		
	 
	private static String URL = "http://www.toolsqa.com";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	String sTitle = driver.getTitle();
	int iTitleLenght = driver.getTitle().length();
	System.out.println(sTitle);
	System.out.println(iTitleLenght);
	sTitle = driver.getCurrentUrl();
	iTitleLenght = driver.getCurrentUrl().length();
	System.out.println(sTitle);
	System.out.println(iTitleLenght);
	
	String sPageSource = driver.getPageSource();
	
	int iPageSourceLenght = driver.getPageSource().length();
	
	System.out.println(sPageSource);
	System.out.println(iPageSourceLenght);
	
	driver.navigate().refresh();
	driver.close();
	}

}
