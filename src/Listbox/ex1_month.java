package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ex1_month 
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	 
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    
    Thread.sleep(2000);
    
  //  WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
    
   WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
   Thread.sleep(2000);
     Select s=new Select(year);
     Thread.sleep(2000);
     
    //s.selectByVisibleText("1993");
     
    // s.selectByValue("1993");
     
   //  s.selectByIndex(4);
}
}
