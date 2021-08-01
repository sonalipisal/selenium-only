package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrawser_switch_childwin_to_mainpage 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().window().maximize();
	
	//WAIT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//click on new tab btn
	driver.findElement(By.xpath("//input[@name='NewTab']")).click(); 
	

	//get address-id for child browser
	Set<String> mulids= driver.getWindowHandles();
	ArrayList<String> al=new ArrayList(mulids);
	
	
	
	//String ChildWinId = al.get(1);
	
	//switch main page to child browser
	//driver.switchTo().window(ChildWinId);
	
	  //or
	driver.switchTo().window(al.get(1));
	
	//click on training option
	
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	
	//Switch to main page
	driver.switchTo().window(al.get(0));
	
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	driver.manage().window().maximize();
	








	
	//click on training option
	driver.findElement(By.xpath("//span[text()='Training']")).click();
}
}
