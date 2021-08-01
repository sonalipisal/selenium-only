package Handling_multi_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webdriver;

public class print_all_links_presentin_google 
{
public static void main(String[] args)
{
	

	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  //driver.get("https://www.google.com/");
	  driver.get("https://en-gb.facebook.com/");

      
	  List<WebElement> links = driver.findElements(By.xpath("//a"));
	  
	  System.out.println(links.size());
	  
	  for(WebElement link:links)
	  {
		  System.out.println(link.getText());
	  }
	  
	  
}
}
