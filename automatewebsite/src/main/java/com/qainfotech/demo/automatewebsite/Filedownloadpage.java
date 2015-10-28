package com.qainfotech.demo.automatewebsite;

import org.openqa.selenium.WebDriver;

import com.qainfotech.demo.UI.Filedownloadpagefactory;

public class Filedownloadpage {
	public void openingfiledownloadpageanddownloadafile(WebDriver driver) throws InterruptedException{
		Filedownloadpagefactory intilizewebelements=new Filedownloadpagefactory(driver);
		
		intilizewebelements.getfiledownloadpagelink().click();
		Thread.sleep(2000);

		intilizewebelements.getdownloadfileelement().click();
		Thread.sleep(3000);
		System.out.println("File downloaded succesfully");

		driver.navigate().back();
	}
}
