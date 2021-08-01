package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail
{
  public static void main(String[] args) throws InterruptedException {
	
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	 
	WebDriver driver = new ChromeDriver();
	 
	driver.get(" https://accounts.google.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d FliLIb uRo0Xe TrZEUc t29vte']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class=' VfPpkd-StrnGf-rymPhb-b9t22c']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sonali");
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Deshmukh");
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("  //input[@name='Username']")).sendKeys("appuso796966");
    driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("so796966@");
    
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("so796966@");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='jGAaxb']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9855037566");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
  }
  
  
}
