package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Challengingdompagefactory {
	@FindBy(linkText="Challenging DOM")
	private WebElement challengingdompagelink;

	public WebElement getchallengingdompagelink(){
		return challengingdompagelink;
	}

	@FindBy(xpath="(//div[contains(@class,'10')])[1]/table/tbody/tr[5]/td[5]")
	private WebElement tabledatalink;

	public WebElement gettabledatalink(){
		return tabledatalink;
	}
	public Challengingdompagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

}
