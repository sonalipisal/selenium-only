package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple
{
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	 
	driver.get("file:///C:/selenium/count.html");
	
	//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='1234']"));
	Thread.sleep(2000);
	
    Select s=new Select(month);
    
    boolean result = s.isMultiple();
    System.out.println(result);
    
    if(result==true)
    {
    	System.out.println("listbox is multiselected");
    }
    else
    {
    	System.out.println("listbox is single selected");
    }
    s.deselectByVisibleText("Sonali");
}
}
