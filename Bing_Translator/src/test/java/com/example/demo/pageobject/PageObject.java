package com.example.demo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject 
{
	WebDriver driver;
	public PageObject(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[contains(@class,'destinationText')]//div[@class='dropdownArrow']")
	private WebElement btnDropdownForTranslatedWord;
	
	public WebElement getBtnDropdownForTranslatedWord(){
		return btnDropdownForTranslatedWord;
	}
	
	public WebElement getLanguageLnk(String language){
		return driver.findElement(By.xpath("(//td[text()='"+language+"'])[2]"));
	}
	
	@FindBy(id = "destText")
	private WebElement txtboxOfTranslatedWord;
	
	public WebElement getTxtboxOfTranslatedWord(){
		return txtboxOfTranslatedWord;
	}
	
	@FindBy(id = "srcText")
	private WebElement txtboxTranslateWord;
	
	public WebElement getTxtboxTranslateWord(){
		return txtboxTranslateWord;
	}
}
