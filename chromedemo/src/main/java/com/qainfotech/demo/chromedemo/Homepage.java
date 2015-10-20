package com.qainfotech.demo.chromedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Browserintilization{
	public void newmailopen(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//div[contains(@class,'asf')]")).click();
        System.out.println("Refresh button is clicked");
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("((//div[@role='tabpanel'])[1]//table)[1]/tbody/tr[1]/td[@tabindex='-1']")).click();
        System.out.println("New mail is open");
       }
	public void logout(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(@class,'gbii')])")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign out")).click();
        System.out.println("Succesfully logout");
	}

}
