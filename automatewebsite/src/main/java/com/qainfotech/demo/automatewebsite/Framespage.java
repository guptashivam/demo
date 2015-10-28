package com.qainfotech.demo.automatewebsite;

import org.openqa.selenium.WebDriver;

import com.qainfotech.demo.UI.Framepagefactory;

public class Framespage {
	public void openingframepage(WebDriver driver) throws InterruptedException{
		Framepagefactory initlizewebelements=new Framepagefactory(driver);
		
		initlizewebelements.getframepagelink().click();
		Thread.sleep(2000);
		
		initlizewebelements.getnestedframelink().click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String a=initlizewebelements.getframetextlink().getText();
		System.out.println(a);
		driver.switchTo().parentFrame(); 
		
		
		driver.switchTo().frame("frame-middle");
		String b=initlizewebelements.getframetextlink().getText();
		System.out.println(b);
		driver.switchTo().parentFrame(); 
		
		
		driver.switchTo().frame("frame-right");
		String c=initlizewebelements.getframetextlink().getText();
		System.out.println(c);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
	    String s=initlizewebelements.getframetextlink().getText();
		System.out.println(s);
		
		driver.switchTo().defaultContent();
		
		driver.navigate().back();
		
		driver.navigate().back();
	}
}
