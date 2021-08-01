package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	 
	driver.get("file:///C:/selenium/count.html");
	
//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	WebElement name = driver.findElement(By.xpath("//select[@id='1234']"));
	Thread.sleep(2000);
	
	Select s=new Select(name);
	
	s.selectByIndex(1);
	s.selectByIndex(2);
	
	Thread.sleep(2000);
	
	s.deselectByIndex(1);
	s.deselectAll();
	//List<WebElement> all = s.getAllSelectedOptions();
}
}