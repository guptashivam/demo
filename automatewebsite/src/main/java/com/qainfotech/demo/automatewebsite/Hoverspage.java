package com.qainfotech.demo.automatewebsite;

import org.openqa.selenium.WebDriver;

import com.qainfotech.demo.UI.Hoverspagefactory;

public class Hoverspage {
	public void openinghoverspage(WebDriver driver) throws InterruptedException{
		Hoverspagefactory initilizewebelements=new Hoverspagefactory(driver);
		
		initilizewebelements.gethoverpagelink().click();
		
		Thread.sleep(2000);
		initilizewebelements.getfirstimage().click();
		
		String s=initilizewebelements.getusername().getText();
		System.out.println(s);
		Thread.sleep(2000);
		
		initilizewebelements.getviewprofiellink().click();
		
		Thread.sleep(2000);
		String a=initilizewebelements.getpagetext().getText();
		System.out.println(a);
		
		driver.navigate().back();
		
		driver.navigate().back();
	}
}
