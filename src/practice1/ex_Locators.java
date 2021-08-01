package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_Locators 
{
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']")).click();
	//driver.findElement(By.xpath("//span[text()='Samsung Galaxy M42 5G (Prism Dot Gray, 8GB RAM, 128GB Storage)']")).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.linkText("//img[@srcset='https://m.media-amazon.com/images/I/71bmFRQaYCL._AC_UY218_.jpg 1x, https://m.media-amazon.com/images/I/71bmFRQaYCL._AC_UY327_FMwebp_QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/71bmFRQaYCL._AC_UY436_FMwebp_QL65_.jpg 2x, https://m.media-amazon.com/images/I/71bmFRQaYCL._AC_UY545_FMwebp_QL65_.jpg 2.5x, https://m.media-amazon.com/images/I/71bmFRQaYCL._AC_UY654_FMwebp_QL65_.jpg 3x']")).click();
	
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7709654336");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@id='continue']")).click();
	
	
	
	//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
}
}
	