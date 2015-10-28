package com.qainfotech.demo.automatewebsite;

import java.io.File;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qainfotech.demo.UI.Filedownloadpagefactory;
import com.qainfotech.demo.UI.Fileuploadpagefactory;

public class Fileuploadpage {
	public void uploadingafile(WebDriver driver) throws InterruptedException{
		Fileuploadpagefactory initilzewebelements=new Fileuploadpagefactory(driver);
		Filedownloadpagefactory inilizewebelementsoffiledownloadpage=new Filedownloadpagefactory(driver);
		
		initilzewebelements.getFileuploadpagelink().click();

		Thread.sleep(2000);
		WebElement element= initilzewebelements.getbrowsebutton();
		element.sendKeys(System.getProperty("user.dir") +File.separator +"sample.txt");
		Thread.sleep(3000);

		initilzewebelements.getuploadbutton().click();
		Thread.sleep(2000);
		System.out.println("File uploaded succesfully");
		
		driver.navigate().back();
		driver.navigate().back();
		
		inilizewebelementsoffiledownloadpage.getfiledownloadpagelink().click();
		
		Thread.sleep(2000);
		try{
			if(initilzewebelements.getfileverifiedlink().isDisplayed())
				System.out.println("File verified");
		}catch(NoSuchElementException e){
			System.out.println("File not verified");
		}

		driver.navigate().back();
	}

}
