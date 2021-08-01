package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	Thread.sleep(3000);
	////input[@name='email']
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("deshmukh");
	driver.manage().window().maximize();

	Thread.sleep(3000);
	
	//Dimension d=new Dimension(300,400);
	//System.out.println(d);
	
	
	
	Thread.sleep(3000);
	System.out.println(driver.manage().window().getSize()); 
}
}
