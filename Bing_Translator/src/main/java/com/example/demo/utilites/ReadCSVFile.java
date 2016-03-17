package com.example.demo.utilites;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadCSVFile {
	private BufferedReader br;

	public ArrayList<String> readCSVFile(String fileName) throws Exception{
		ArrayList<String> csvData  = new ArrayList<String>();
		String filePath = System.getProperty("user.dir")+File.separator+"TestData"+File.separator+fileName;
		br = new BufferedReader(new FileReader(filePath));
		String line;
		while((line=br.readLine())!=null){
			csvData.add(line);
		}
		return csvData;
	}
}