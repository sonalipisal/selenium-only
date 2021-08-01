package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class get_col_size 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/admin/Desktop/vishal/software%20testing/java+mannual/book.html");
	
	
	int colsize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[4]/td")).size();
	System.out.println(colsize);
	
	//for header
	int hcolsize=driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th")).size();
	System.out.println(hcolsize);
	
} 
}
