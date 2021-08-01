package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected 
{
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	Thread.sleep(3000);
	
	WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
	
	boolean result = female.isSelected();
	
	if(result==true)
	{
		System.out.println("radio button alredy selected");
	}
	else
	{
		System.out.println("selecting  radio button");

	    female.click();
   
	    Thread.sleep(2000);
	
	    boolean result1 = female.isSelected();
	    if(result1)
		{
			System.out.println("radio button selected");
		}
	    else 
	    {
	    	System.out.println("radio button not selected");
	    }
	    
		
	
	
	}
}
}

