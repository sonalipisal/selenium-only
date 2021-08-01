package auto_suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	String expresult="redmi 9 power";
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi ");
	
 List<WebElement> Allopt =driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	
	for(WebElement opt:Allopt)
	{
		String actresult = opt.getText();
		System.out.println(actresult);
		
		if(actresult.equals(expresult))
		{
			opt.click();
			break;
		}
	}
	
	
	
	
}
}
