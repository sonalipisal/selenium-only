package prgram;

import java.io.File;
import java.io.IOException;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import screenshot.takescreen;

public class screenshot
{
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	 
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);     
	//System.out.println(src);
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 File dest = new File("C:\\selenium\\sel.jpg");
	FileHandler.copy(src, dest);
	
}
}
