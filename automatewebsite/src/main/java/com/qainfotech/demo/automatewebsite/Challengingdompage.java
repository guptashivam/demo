package com.qainfotech.demo.automatewebsite;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qainfotech.demo.UI.Challengingdompagefactory;

public class Challengingdompage {
	public void webpage(WebDriver driver,String url){
		driver.get(url);
	}
	
	public void openingdompage(WebDriver driver) throws InterruptedException {
		Challengingdompagefactory initlizewebelements=new Challengingdompagefactory(driver);
	
		int b = 1;
		initlizewebelements.getchallengingdompagelink().click();
		Thread.sleep(2000);
		
		int a = driver.findElements(By.xpath("//div[contains(@class,'large-2')]/a")).size();
		System.out.println(a);
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 1; i <= a; i++) {
			al.add(driver.findElement(By.xpath("//div[contains(@class,'large-2')]/a[" + i + "]")).getText());
		}
		for (String obj : al) {
			b++;
			if (obj.equals("foo")) {
				driver.findElement(By.xpath("//a[text()='foo']")).click();
				break;
			}
			if (b == 3) {
				driver.navigate().refresh();
				break;
			}
		}
		
		String s = initlizewebelements.gettabledatalink().getText();
		System.out.println(s);
		String abc = (String) ((JavascriptExecutor) driver).executeScript(
				"return document.getElementById('content').getElementsByTagName('script')[0].textContent");
		System.out.println("Text: " + abc);
		driver.navigate().back();
	}
}
