package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class myntra 
{
  public static void main(String[] args) throws InterruptedException, IOException 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[text()='Profile']")).click();
	Thread.sleep(2000);
	
driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	File dest = new File("C:\\selenium\\myntra1.jpg");
	
	Thread.sleep(2000);
	
	
	FileHandler.copy(src, dest);
	
	
}
}
