package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class takescreen
{
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://meet.google.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);     
	System.out.println(src);
	Thread.sleep(2000);
	
	File dest = new File("C:\\selenium\\sonali.jpg");
	Thread.sleep(2000);
	
	
	FileHandler.copy(src, dest);
}
}
