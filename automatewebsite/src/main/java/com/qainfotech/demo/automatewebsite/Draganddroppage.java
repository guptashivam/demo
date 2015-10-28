package com.qainfotech.demo.automatewebsite;

import org.openqa.selenium.WebDriver;
import com.qainfotech.demo.UI.Draganddroppagefactory;

public class Draganddroppage {
	public void openingdraganddroppage(WebDriver driver){
		Draganddroppagefactory initlizewebelements=new Draganddroppagefactory(driver);
		
		initlizewebelements.getdraganddroppagelink().click();
		String a=initlizewebelements.getfirstimage().getText();
		org.openqa.selenium.Point point=initlizewebelements.getfirstimage().getLocation();
		System.out.println(a);
		System.out.println(+point.x+" "+point.y);
		
		String b=initlizewebelements.getsecondimage().getText();
		org.openqa.selenium.Point poin=initlizewebelements.getsecondimage().getLocation();
		System.out.println(b);
		System.out.println(+poin.x+" "+poin.y);
		
//		WebElement element = driver.findElement(By.xpath("//div[@id='column-a']"));
//		WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
//
//  	new Actions(driver).dragAndDrop(element,target).perform(); 
//		
//		System.out.println(a);
//		System.out.println(+point.x+" "+point.y);
//		
//		System.out.println(b);
//		System.out.println(+poin.x+" "+poin.y);
		
		driver.navigate().back();
	}

}
