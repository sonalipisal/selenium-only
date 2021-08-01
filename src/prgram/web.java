package prgram;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	
  //  driver.get("https://www.w3schools.com/sql/sql_between.asp");
    driver.get("https://en-gb.facebook.com/");
    //driver.get("https://www.primevideo.com/");
    
    String t = driver.getTitle();
    System.out.println(t);
    
   String get = driver.getCurrentUrl();
   System.out.println(get);
   
   
   Point D = new Point(300,400); 
   driver.manage().window().setPosition(D);
   
   Point pos = driver.manage().window().getPosition();
   System.out.println(pos);
   
 // Dimension dim = new Dimension(500,345);
//   driver.manage().window().setSize(dim);
  
   //Object d =new Dimension(200, 300);
  // driver.manage().window().setSize(d);
   
   driver.close();
    
    
}
}
