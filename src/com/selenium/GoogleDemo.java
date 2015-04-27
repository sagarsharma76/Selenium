/**
 * 
 */
package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * @author sagarsharma
 * 
 */
public class GoogleDemo {

	/**
	 * @param args
	 */
	private static String GMAIL_URL = "http://www.gmail.com";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(GMAIL_URL);
		driver.findElement(By.id("signIn")).click();
		System.out.println("Enter Your Email ID and Password");
		// driver.findElement(By.id("signIn")).clear();
		driver.findElement(By.id("Email")).sendKeys("dkparulkaushik");
		driver.findElement(By.id("Passwd")).sendKeys("nokiasmart");
		driver.findElement(By.id("signIn")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("login Successfully");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
/*		driver.findElement(By.className("gb_ac gb_hc gb_5"));
		driver.findElement(By.id("gb_71"));*/
		//driver.findElement(By.xpath("//id('gb')/x:div[1]/x:div[1]/x:div[2]/x:div[5]/x:div[1]/x:a/x:span"));
		driver.findElement(By.xpath("//span[@class='gb_da gbii']")).click();
		driver.findElement(By.id("gb_71")).click();
		System.out.println("Logout Successfully Again");

	}

}

/*
 * private static void linkClick(String ref,WebDriver driver){ List<WebElement>
 * anchorList = driver.findElements(By.tagName("a")); for(WebElement
 * element:anchorList){ if(element.getAttribute("href").contains(ref)){
 * element.click(); } }
 */

