package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import com.qainfotech.demo.automatewebsite.Testobject;



public class Testclass {
	WebDriver driver;
	Testobject tb;
	Properties prop;
	InputStream input;

	@BeforeClass
	public void firefoxbrowser(){
		tb=new Testobject();
		driver=tb.openandclosebrowser.openbrowser();
	}

	@Test(groups={"automate"})
	public void openpageandchallengingdompage() throws InterruptedException, IOException{
		prop = new Properties();
		input=new FileInputStream("automatewebsite.properties");
		prop.load(input);
		tb=new Testobject();
		tb.openwebpage.webpage(driver,prop.getProperty("URL"));
		tb.openwebpage.openingdompage(driver);
	}

	@Test(dependsOnMethods = {"openpageandchallengingdompage"},groups={"automate"})
	public void draganddroppage(){
		tb=new Testobject();
		tb.opendraganddroppage.openingdraganddroppage(driver);
	}

	@Test(dependsOnMethods = {"draganddroppage"},groups={"automate"})
	void dropdownpage() throws InterruptedException{
		tb=new Testobject();
		tb.opendropdownpage.openingandfetchdatafromdropdownpage(driver);
	}

	@Test(dependsOnMethods = {"dropdownpage"},groups={"automate"})
	void dynamiccontrolspage() throws InterruptedException{
		tb=new Testobject();
		tb.opendynamiccontrolpage.openingdynamiccontrolspage(driver);
	}

	@Test(dependsOnMethods = {"dynamiccontrolspage"},groups={"automate"})
	void filedownloadpage() throws InterruptedException{
		tb=new Testobject();
		tb.openfiledownloadpage.openingfiledownloadpageanddownloadafile(driver);
	}

	@Test(dependsOnMethods = {"filedownloadpage"},groups={"automate"})
	void fileuploadpage() throws InterruptedException{
		tb=new Testobject();
		tb.openfileuploadpage.uploadingafile(driver);
	}

	@Test(dependsOnMethods = {"fileuploadpage"},groups={"automate"})
	void framepage() throws InterruptedException{
		tb=new Testobject();
		tb.openframespage.openingframepage(driver);
	}

	@Test(dependsOnMethods = {"framepage"},groups={"automate"})
	void hoverspage() throws InterruptedException{
		tb=new Testobject();
		tb.openhoverspage.openinghoverspage(driver);
	}

}
