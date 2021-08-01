package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.flipkart.com/");
	
	driver.manage().window().maximize();	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
	Thread.sleep(2000);
	
	
     driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Sonali");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("So796966");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	
}
}
