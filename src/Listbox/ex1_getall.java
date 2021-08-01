package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_getall
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
		 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Thread.sleep(2000);
	    
	   Select s = new Select(month);
	   Thread.sleep(2000);
	   
	   List<WebElement> alloptions = s.getOptions();
	   Thread.sleep(2000);
	   
	   for(WebElement option:alloptions)
	   {
		  // String str = option.getText();
		 // System.out.println(str);
		   System.out.println(option.getText());
	   }
	   
}
}
