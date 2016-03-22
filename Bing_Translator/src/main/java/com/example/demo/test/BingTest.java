package com.example.demo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.demo.actions.BingAction;

public class BingTest {
	BingAction bingAction;
	WebDriver driver;
	
	@BeforeMethod
	public void openUrl(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.bing.com/translator/");
		bingAction = new BingAction(driver);
	}
	
	@Test
	public void translateWord() throws Exception{
		bingAction.translateWordAndVerifyTheTranslatedWord();
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}