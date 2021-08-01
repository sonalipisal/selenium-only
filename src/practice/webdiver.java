package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdiver 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.hdfcbank.com/");
	
	//Thread.sleep(3000);
	driver.manage().window().maximize();
	
	//Thread.sleep(3000);
	driver.get("https://www.myntra.com/");
	
	
	
	
}
}