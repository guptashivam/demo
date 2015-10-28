package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hoverspagefactory {
	@FindBy(linkText="Hovers")
	private WebElement hoverpagelink;
	
	public WebElement gethoverpagelink(){
		return hoverpagelink;
	}
	
	@FindBy(xpath="(//div[contains(@class,'figure')])[1]/img")
	private WebElement firstimage;
	
	public WebElement getfirstimage(){
		return firstimage;
	}
	
	@FindBy(xpath="(//div[contains(@class,'figcaption')])[1]/h5")
	private WebElement username;
	
	public WebElement getusername(){
		return username;
	}
	
	@FindBy(linkText="View profile")
	private WebElement viewprofiellink;
	
	public WebElement getviewprofiellink(){
		return viewprofiellink;
	}
	
	@FindBy(xpath="//html/body/h1")
	private WebElement pagetext;
	
	public WebElement getpagetext(){
		return pagetext;
	}
	
	public Hoverspagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
}
