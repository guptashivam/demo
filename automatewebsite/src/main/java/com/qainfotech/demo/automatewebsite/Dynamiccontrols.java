package com.qainfotech.demo.automatewebsite;

import org.openqa.selenium.WebDriver;

import com.qainfotech.demo.UI.Dynamiccontrolspagefactory;

public class Dynamiccontrols {
	public void openingdynamiccontrolspage(WebDriver driver) throws InterruptedException{
		Dynamiccontrolspagefactory initlizewebelements=new Dynamiccontrolspagefactory(driver);
		
		initlizewebelements.getdynamiccontrolspagelink().click();
		
		Thread.sleep(2000);
		initlizewebelements.getcheckboxlink().click();
		Thread.sleep(1000);
		
		initlizewebelements.getclickonbutton().click();
		System.out.println("Clicked on Add button");
		Thread.sleep(5000);
		
		String s=initlizewebelements.getfetchmessage().getText();
		System.out.println(s);
		
		initlizewebelements.getclickonbutton().click();
		System.out.println("Clicked on Remove button");
		Thread.sleep(5000);
		
		String a=initlizewebelements.getfetchmessage().getText();
		System.out.println(a);
		
		driver.navigate().back();
	}
}
