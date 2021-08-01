package practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDmethod 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	
	driver.get("https://www.myntra.com/");
	
	driver.manage().window().maximize();
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	String str = driver.getTitle();
	System.out.println(str);
	Thread.sleep(2000);
	
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(2000);

	
	Dimension d = new Dimension(300, 790);
    driver.manage().window().setSize(d);
    System.out.println( driver.manage().window().getSize());
    Thread.sleep(2000);
	
    Point P = new Point(10, 30);
    driver.manage().window().setPosition(P);
    System.out.println(driver.manage().window().getPosition());
   
}
}
