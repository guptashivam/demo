package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamiccontrolspagefactory {
	@FindBy(linkText="Dynamic Controls")
	private WebElement dynamiccontrolspagelink;
	
	public WebElement getdynamiccontrolspagelink(){
		return dynamiccontrolspagelink;
	}
	
	@FindBy(xpath="//div[@id='checkbox']/input")
	private WebElement checkboxlink;
	
	public WebElement getcheckboxlink(){
		return checkboxlink;
	}
	
	@FindBy(id="btn")
	private WebElement clickonbutton;
	
	public WebElement getclickonbutton(){
		return clickonbutton;
	}
	
	@FindBy(id="message")
	private WebElement fetchmessage;
	
	public WebElement getfetchmessage(){
		return fetchmessage;
	}
	
	public Dynamiccontrolspagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
}
