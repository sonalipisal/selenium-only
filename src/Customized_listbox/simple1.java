package Customized_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class simple1 
{
  public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	 WebDriver driver=new ChromeDriver();
	 
	 
	 driver.get("https://en-gb.facebook.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 
	 
	 //step1 identify listbox
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 
	 //step 2 create object of action class
	 
	 Actions act = new Actions(driver);
	 
	 //step 3 click on identified element
	 
	 act.click(month).perform();
	 
	 //step 4 select options;
	 //1)move 1 option to topup
	 
	 //act.sendKeys(Keys.ARROW_UP).perform();
	 
	 //2)move 1 option to down
	// act.sendKeys(Keys.ARROW_DOWN).perform();
	 
	 //act.sendKeys(Keys.ENTER).perform();	 
	 
	 //navigate to bottom of listbox
	 
	 Thread.sleep(2000);
	 
	 for(int i=1;i<=12;i++) 
	 {
		 act.sendKeys(Keys.ARROW_DOWN).perform();
	 }
	 Thread.sleep(2000);
	 act.click().perform();
}
}

	 
