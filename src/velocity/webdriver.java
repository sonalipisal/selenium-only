package velocity;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver
{
public static void main(String[] args) {
	 
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.kotaksecurities.com//");
	
	//driver.manage().window().maximize();
	
	
	//driver.navigate().back();
	
	//String title = driver.getTitle();
    // System.out.println(title);
     
    String url = driver.getCurrentUrl();
    System.out.println(url);
    
    // Dimension size = driver.manage().window().getSize();
    // System.out.println(size);
     
   // Point pos = driver.manage().window().getPosition();
   // System.out.println(pos);
    
   // Dimension D = new Dimension(100, 200);
   // driver.manage().window().setSize(D);
    
    
    // Point P = new Point(200, 350);
    //driver.manage().window().setPosition(P);
	 
     
  
}
}
