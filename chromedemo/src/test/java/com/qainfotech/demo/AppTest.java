package com.qainfotech.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest 
{
	WebDriver driver;
	Testinitiator test;
	Properties prop;
	InputStream input;
	
	
	@BeforeClass
	public void intilization() throws IOException{
		test =new Testinitiator();
		driver=test.openingandclosingofbrowser.openbrowser();
		}
	
	@Test(priority=1,groups={"chrome"})
	public void openwebsite() throws IOException{
		prop = new Properties();
		input=new FileInputStream("chromedata.properties");
		prop.load(input);
		test =new Testinitiator();
		test.uploadwebsiteandlogintothewebsite.openwebsite(driver,prop.getProperty("URL"));
		}
	
	@Test(priority=2,groups={"chrome"})
	public void loginintothewebsite() throws InterruptedException, IOException{
		prop = new Properties();
		input=new FileInputStream("chromedata.properties");
		prop.load(input);
		test =new Testinitiator();
		test.uploadwebsiteandlogintothewebsite.enteridandpasswordandlogin(driver,prop.getProperty("Userid"),prop.getProperty("Password"));
		}
	
	@Test(priority=3,groups={"chrome"})
	public void composeamail() throws InterruptedException{
		test =new Testinitiator();
		test.changeinmail.sendingamail(driver);
	}
	
	@Test(priority=4,groups={"chrome"})
	public  void openmail() throws InterruptedException{
		test =new Testinitiator();
		test.openinghomepage.newmailopen(driver);
	}
	
	@Test(priority=5,groups={"chrome"})
	public void deletemail() throws InterruptedException{
		test =new Testinitiator();
		test.changeinmail.maildelete(driver);
	}
	
	@Test(priority=6,groups={"chrome"})
	public void logoutfromthewebsite() throws InterruptedException{
		test =new Testinitiator();
		test.openinghomepage.logout(driver);
	}
	@Test(priority=7,groups={"chrome"})
	public void closebrowser(){
		test =new Testinitiator();
		test.openingandclosingofbrowser.closebrowser(driver);
	}
}