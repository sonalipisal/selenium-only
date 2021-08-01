package Dynamic_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class get_rating
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com/");
	
	//close login page
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		//search box enter redmi
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 8");
		
		//click search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//print rating number
		String rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println(rating);
	
	
}
}
