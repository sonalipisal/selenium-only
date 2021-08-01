package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	
	
	
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sonali");
	
	
	//Thread.sleep(3000);
	
	//xpath by text
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(3000);
	
	//xpath contains by text
	//driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
	
	//xpath contains by attribute
	driver.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("sonali");
}
}
