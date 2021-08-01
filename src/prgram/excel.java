package prgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
   WebDriver driver=new ChromeDriver();
   driver.get("https://kite.zerodha.com/");
   
	FileInputStream file = new FileInputStream("C:\\selenium\\kite.xlsx\\");
	Sheet sh = WorkbookFactory.create(file).getSheet("kite");

	String text = sh.getRow(0).getCell(0).getStringCellValue();
	String text1 = sh.getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(text);
	System.out.println(text1);
	
//	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(text);
//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(text1);
//	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	
}
}
