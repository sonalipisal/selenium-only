package Action_class_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium.webdriver;

public class double_click 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

	
Actions act = new Actions(driver);

act.doubleClick(ele).perform();
}
}