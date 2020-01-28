package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import util.Xls_Reader;

public class WebTableToExcel {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]//td[1]";
		
		String beforeXpath_contact = "//*[@id='customers']/tbody/tr[";
		String afterXpath_contact = "]//td[2]";
		
		 
	Xls_Reader reader = new Xls_Reader("D:\\Test.xlsx");
	reader.addSheet("companyData");
	
		                      
		
		for(int i=2;i<=7;i++)
		{
			String actualXpath =  beforeXpath + i + afterXpath;
			String companyNames = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(companyNames);
			reader.setCellData("companyData", "companyName", i, companyNames);
			
			String actualXpath_contact =  beforeXpath_contact + i + afterXpath_contact;
			String companyNames_contact = driver.findElement(By.xpath(actualXpath_contact)).getText();
			System.out.println(companyNames_contact);
			reader.setCellData("companyData", "contactName", i, companyNames_contact);
		}
	}

}
