package prgram;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Listbox
{
  public static void main(String[] args)
  {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	  TreeSet<String> tr=new TreeSet<String>();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select S=new Select(month);
    S.selectByVisibleText("Dec");
    
  
  
   
	
	
  }
}
