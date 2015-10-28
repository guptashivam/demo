package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Framepagefactory {
	@FindBy(linkText="Frames")
	private WebElement framepagelink;
	
	public WebElement getframepagelink(){
		return framepagelink;
	}
	
	@FindBy(linkText="Nested Frames")
	private WebElement nestedframelink;
	
	public WebElement getnestedframelink(){
		return nestedframelink;
	}
	
	@FindBy(xpath="//html/body")
	private WebElement frametextlink;
	
	public WebElement getframetextlink(){
		return frametextlink;
	}
	
	public Framepagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

}
