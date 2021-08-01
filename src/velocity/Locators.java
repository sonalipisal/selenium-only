package velocity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.primevideo.com//");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='dv-copy-button']")).click();
	
	
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9960382493");

	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Pawar@123");
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	driver.findElement(By.xpath("//input[@id='auth-send-code']")).click();
	
	driver.findElement(By.xpath("//input[@id='auth-mfa-otpcode']")).sendKeys("123333");
	driver.findElement(By.xpath("//input[@id='auth-signin-button']")).click();
	
}
}
