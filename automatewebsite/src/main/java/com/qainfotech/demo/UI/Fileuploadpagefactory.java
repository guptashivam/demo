package com.qainfotech.demo.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fileuploadpagefactory {
	@FindBy(linkText="File Upload")
	private WebElement fileuploadpagelink;
	
	public WebElement getFileuploadpagelink() {
		return fileuploadpagelink;
	}

	@FindBy(name="file")
	private WebElement browsebutton;
	
	public WebElement getbrowsebutton(){
		return browsebutton;
	}
	
	@FindBy(id="file-submit")
	private WebElement uploadbutton;
	
	public WebElement getuploadbutton(){
		return uploadbutton;
	}
	
	@FindBy(linkText="sample.txt")
	private WebElement fileverifiedlink;
	
	public WebElement getfileverifiedlink(){
		return fileverifiedlink;
	}
	
	public Fileuploadpagefactory(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
 }
