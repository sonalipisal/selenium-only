package Listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class alphabetical 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(2000);
	
    Select s=new Select(month);
    
    List<WebElement> moption = s.getOptions();
    
    System.out.println(s.getOptions().size());
   
    TreeSet<String> tr = new TreeSet<String>();
    for(WebElement single:moption)
    {
    	String str = single.getText();
    	tr.add(str);
    }
    for(String s1:tr)
    {
    	System.out.println(s1);
    }
    Thread.sleep(2000);
    
   
	
	
	
}
}
