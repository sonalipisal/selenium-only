package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1
{
public static void main(String[] args) 
{
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://en-gb.facebook.com/");
	driver.get("https://accounts.google.com");
	
	
	//((driver) driver.findElements(By.xpath("//a[text()='Forgotten password?']"))).click();
	
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
	//driver.findElement(By.xpath("//div[text()='Email or phone']")).sendKeys("soanli@gmail.com");
	
	driver.findElement(By.xpath("//input[contains(@class,'zHQkBf')]")).sendKeys("sonali");
	
	//driver.findElement(By.xpath("//button[contains(text(),'email?')]")).click();
	
	

}
}
