package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ex_getallyear 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	driver.get("https://en-gb.facebook.com/");
	
	Thread.sleep(2000);

	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Sonali");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Deshmukh");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sona@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sona@gmail.com");
	
	driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("didi@@12345");
	Thread.sleep(2000);
	
      WebElement day = driver.findElement(By.xpath("//select[@id='day']"));  //step1
      Select s = new Select(day); //step 2
      s.selectByVisibleText("1");
      
      Thread.sleep(2000);

  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
  Select s1 = new Select(month);
  s1.selectByVisibleText("Jul");
  
  Thread.sleep(2000);
 
 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
 Select s2 = new Select(year);
 s2.selectByVisibleText("1993");
 
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//label[@class='_58mt']")).click();
 
 Thread.sleep(2000);
 
driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
  
  
}

}
