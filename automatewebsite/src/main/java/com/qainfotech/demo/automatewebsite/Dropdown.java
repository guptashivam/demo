package com.qainfotech.demo.automatewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qainfotech.demo.UI.*;

public class Dropdown {
	public void openingandfetchdatafromdropdownpage(WebDriver driver) throws InterruptedException{
		Dropdownpagefactory initilizingwebelements=new Dropdownpagefactory(driver);
	
		initilizingwebelements.getdropdownpagelink().click();

		System.out.println("Default option is:");
		String s=initilizingwebelements.getdefaultoptionlink().getText();
		System.out.println(s);

		int a=driver.findElements(By.xpath("//select[@id='dropdown']/option")).size();
		System.out.println(a);

		System.out.println("Options are:");
		String o1=initilizingwebelements.getsecondoptionlink().getText();
		System.out.println(o1);
		
		String o3=initilizingwebelements.getthirdoptionlink().getText();
		System.out.println(o3);



		Select drpdwn = new Select(initilizingwebelements.getdropdownlink());
		drpdwn.selectByValue("2");
		System.out.println("option 2 selected");

		Thread.sleep(2000);

		Boolean b=initilizingwebelements.getdefaultoptionlink().isEnabled();
		if(b)
			System.out.println("Default option is Enabled");
		else
			System.out.println("Default option is Disabled");

		driver.navigate().back();
	}

}
