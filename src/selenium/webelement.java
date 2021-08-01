package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webelement 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://kite.zerodha.com/");
	 
	 Thread.sleep(3000);
	String st=driver.getTitle();
	System.out.println(st);
	
	
	 Thread.sleep(3000);
	String str=driver.getCurrentUrl();
	System.out.println(str);
	
	 Thread.sleep(3000);
	Dimension d=new Dimension(500,600);
	driver.manage().window().setSize(d);
	 
	Thread.sleep(3000);
	System.out.println(driver.manage().window().getSize());
	
	Dimension dim=driver.manage().window().getSize();
	System.out.println(dim);
	}
}
