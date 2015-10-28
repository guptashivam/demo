package com.qainfotech.demo.automatewebsite;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Initilizebrowser {
	public WebDriver openbrowser(){
		WebDriver driver = new FirefoxDriver(setFirefoxProfile());
		driver.manage().window().maximize();
		return driver;
	}
	public void closebrowser(WebDriver driver){
		driver.quit();
	}

	public FirefoxProfile setFirefoxProfile() {
		FirefoxProfile firefoxprofile = new FirefoxProfile();
		try {

			firefoxprofile.setPreference("browser.download.dir",
					System.getProperty("user.dir") + File.separator
					+ "downloads");

			firefoxprofile.setPreference("browser.download.folderList", 2);

			firefoxprofile
			.setPreference(
					"browser.helperApps.neverAsk.saveToDisk",
					"image/jpg,application/octet-stream,text/accdb, text/csv,text/xml,application/xml,application/vnd.ms-excel,application/x-excel,application/x-msexcel,application/excel,application/pdf");
			firefoxprofile.setPreference("browser.download.useDownloadDir",
					true);
			firefoxprofile.setPreference(
					"browser.download.manager.showAlertOnComplete", false);
			firefoxprofile.setPreference(
					"browser.download.manager.showWhenStarting", false);


			firefoxprofile.setPreference("extensions.firebug.currentVersion",
					"1.10.3");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return firefoxprofile;
	}

}
