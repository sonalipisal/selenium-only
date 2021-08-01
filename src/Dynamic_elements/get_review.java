package Dynamic_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class get_review 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	//mention wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//open url
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	//close login page
  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	//search box enter redmi
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 8");
	
	//click search button
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	//print review text
	String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
	
	System.out.println(review);
	
	//click 1st option
    //driver.findElement(By.xpath("((//div[@class='_1AtVbE col-12-12'])[3]//div)[15]")).click();
    
    driver.findElement(By.xpath("((//div[@class='_1YokD2 _2GoDe3'])[1]//span)[6]")).click();
    //click add to cart
    driver.findElement(By.xpath("//div[@class='_2c7YLP UtUXW0 _6t1WkM _3HqJxg']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
}

}
