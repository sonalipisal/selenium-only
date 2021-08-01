package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class get_row_size 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/admin/Desktop/vishal/software%20testing/java+mannual/book.html");
	
     List<WebElement> Allrows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
    		 
	int rowsize = Allrows.size();
	System.out.println(rowsize);
	
	
	int colsize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[4]/td")).size();
	System.out.println(colsize);
	
} 
}
