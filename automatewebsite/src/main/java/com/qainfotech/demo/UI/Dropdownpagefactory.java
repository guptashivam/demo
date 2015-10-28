package com.qainfotech.demo.UI;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dropdownpagefactory { 
	@FindBy(linkText="Dropdown")
	private WebElement dropdownpagelink;
	
	public WebElement getdropdownpagelink(){
		return dropdownpagelink;
	}
	
	@FindBy(xpath="//select[@id='dropdown']/option[1]")
	private WebElement defaultoptionlink;
	
	public WebElement getdefaultoptionlink(){
		return defaultoptionlink;
	}
	
	@FindBy(xpath="//select[@id='dropdown']/option")
	private WebElement alloptionslink;
	
	public WebElement getalloptionslink(){
		return alloptionslink;
	}
	
	@FindBy(xpath="//select[@id='dropdown']/option[2]")
    private WebElement secondoptionlink;
	
	public WebElement getsecondoptionlink(){
		return secondoptionlink;
	}
	@FindBy(xpath="//select[@id='dropdown']/option[3]")
	private WebElement thirdoptionlink;
	
	public WebElement getthirdoptionlink(){
		return thirdoptionlink;
	}
	
	@FindBy(xpath="//select[@id='dropdown']")
	private WebElement dropdownlink;
	
	public WebElement getdropdownlink(){
		return dropdownlink;
	}
	
	public Dropdownpagefactory (WebDriver driver){
		PageFactory.initElements(driver,this);
	}
}
