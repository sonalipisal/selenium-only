package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.io.EndPoint;

public class webdriver
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	//WebDriver driver=new ChromeDriver();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	Thread.sleep(3000);
	
	//driver.close();
	
//	driver.quit();
	
	//driver.navigate().back();
	
	driver.manage().window().maximize();
	
	String d=driver.getCurrentUrl();
	System.out.println(d);
	
	Dimension D=new Dimension(300,900);
   driver.manage().window().setSize(D);
   System.out.println(driver.manage().window().getSize());
   
  //Dimension dim=driver.manage().window().getSize();
  //System.out.println(dim);
   
  //Point p=new Point(300,400);
  //driver.manage().window().setPosition(p);
  
  System.out.println(driver.manage().window().getPosition());
   
	
}
}
