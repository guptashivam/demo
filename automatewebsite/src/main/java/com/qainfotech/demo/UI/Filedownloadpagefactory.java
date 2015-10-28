package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filedownloadpagefactory {
	@FindBy(linkText="File Download")
	private WebElement filedownloadpagelink;
	
	public WebElement getfiledownloadpagelink(){
		return filedownloadpagelink;
	}
	
	@FindBy(linkText="some-file.txt")
	private WebElement downloadfileelement;
	
	public WebElement getdownloadfileelement(){
		return downloadfileelement;
	}
	
	public Filedownloadpagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
}
