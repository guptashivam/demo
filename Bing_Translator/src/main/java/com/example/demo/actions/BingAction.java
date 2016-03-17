package com.example.demo.actions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.example.demo.pageobject.PageObject;
import com.example.demo.utilites.ReadCSVFile;

public class BingAction {
	PageObject pb;
	ReadCSVFile readFile;

	public BingAction(WebDriver driver){
		pb = new PageObject(driver);
		readFile = new ReadCSVFile();
	}

	public void clickOnLangauageLnkUnderDropdown(String Language){
		pb.getBtnDropdownForTranslatedWord().click();
		pb.getLanguageLnk(Language).click();
	}

	public String translateWord(){
		String translatedWord = pb.getTxtboxOfTranslatedWord().getText();
		return translatedWord;
	}

	public void translateWordAndVerifyTheTranslatedWord() {
		String frstTranslatedWord,secondTranslatedWord,rowData[];
		try{
			ArrayList<String> csvData = readFile.readCSVFile("wordsForTranslation.csv");
			for(int i=0;i<csvData.size();i++){
				System.out.println(csvData.get(i));
				rowData = csvData.get(i).split(",");
				clickOnLangauageLnkUnderDropdown(rowData[2]);
				pb.getTxtboxTranslateWord().clear();
				pb.getTxtboxTranslateWord().sendKeys(rowData[1]);
				Thread.sleep(2000);
				frstTranslatedWord = translateWord();
				Thread.sleep(2000);
				clickOnLangauageLnkUnderDropdown(rowData[0]);
				pb.getTxtboxTranslateWord().clear();
				pb.getTxtboxTranslateWord().sendKeys(frstTranslatedWord);
				Thread.sleep(2000);
				secondTranslatedWord = translateWord();
				System.out.println(secondTranslatedWord);
				Assert.assertTrue(rowData[1].equals(secondTranslatedWord));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
