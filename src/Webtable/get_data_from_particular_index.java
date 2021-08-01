
package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class get_data_from_particular_index 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/admin/Desktop/vishal/software%20testing/java+mannual/book.html");
	
	
	String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
	System.out.println(text);
	

	 String hcolsize = driver.findElement(By.xpath("//table[@id='1234']//tr[5]/td[2]")).getText();
	System.out.println(hcolsize);
	
} 
}
