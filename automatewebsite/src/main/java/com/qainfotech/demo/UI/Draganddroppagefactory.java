package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Draganddroppagefactory {
	@FindBy(linkText="Drag and Drop")
	private WebElement draganddroppagelink; 
	
	public WebElement getdraganddroppagelink(){
		return draganddroppagelink;
	}
	
	@FindBy(xpath="//div[@id='column-a']/header")
	private WebElement firstimage;
	
	public WebElement getfirstimage(){
		return firstimage;
	}
	
	@FindBy(xpath="//div[@id='column-b']/header")
	private WebElement secondimage;
	
	public WebElement getsecondimage(){
		return secondimage;
	}
	
	public Draganddroppagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

}
