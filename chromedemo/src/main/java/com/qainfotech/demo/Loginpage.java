package com.qainfotech.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends Browserintilization{
	public void openwebsite(WebDriver driver,String url){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void enteridandpasswordandlogin(WebDriver driver,String userid,String password) throws InterruptedException{
		WebElement element = driver.findElement(By.id("Email"));
		System.out.println("fetched the userid from properties file");
        element.sendKeys(userid);
        element.submit();
        WebElement element1 = driver.findElement(By.id("Passwd"));
        System.out.println("fetched the password from properties file");
        element1.sendKeys(password);
        element1.submit();
	}

}
