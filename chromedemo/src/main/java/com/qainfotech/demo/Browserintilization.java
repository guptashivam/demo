package com.qainfotech.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserintilization {
	public WebDriver openbrowser(){
    	System.setProperty("webdriver.chrome.driver", "D:/eclipseproject/chromedemo/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		return driver;
		}
	public void closebrowser(WebDriver driver){
    driver.quit();
    }
}