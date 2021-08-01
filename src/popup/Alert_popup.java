package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		Thread.sleep(2000);
		//click on click me button
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		Thread.sleep(2000);
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//get text from alart popup
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		
	
		//use to click om ok button
		alt.accept();
		
		driver.getWindowHandles();
		
		

		
		
	}

}
