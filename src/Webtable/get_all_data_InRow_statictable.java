package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class get_all_data_InRow_statictable
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/admin/Desktop/vishal/software%20testing/java+mannual/book.html");
	
	for(int i=1;i<5;i++)
	{
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]")).getText();
	    System.out.print(text+" ");
	}

	//for(int i=1; i<=3;i++) 
	//{
		//String text = driver.findElement(By.xpath("//table[@id='1234']//tr[5]/td["+i+"]")).getText();
		//System.out.print(text+" ");
	//}
	System.out.println();

} 
}

