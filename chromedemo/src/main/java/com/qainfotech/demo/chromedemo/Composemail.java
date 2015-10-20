package com.qainfotech.demo.chromedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Composemail extends Browserintilization{
	public void sendingamail(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		System.out.println("Compose button is clicked");

		WebElement element2 = driver.findElement(By.name("to"));
		element2.sendKeys("shivamgupta.710@gmail.com");
		System.out.println("Sender E-mail id is entered");

		WebElement element3 = driver.findElement(By.name("subjectbox"));
		element3.sendKeys("Hello");

		WebElement element4= driver.findElement(By.xpath("//div[contains(@class,'editable')]"));
		element4.sendKeys("Hello,how are you?");

		driver.findElement(By.xpath("//div[text()='Send']")).click();
		System.out.println("Send button is clicked");
		Thread.sleep(3000);
	}
	public void maildelete(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[contains(@class,'ar9')])[2]")).click();
        System.out.println("Mail is deleted");
	}

}
