package velocity;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	TreeSet<String> tr = new TreeSet<String>();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select obj = new Select(month);
	obj.selectByVisibleText("Dec");
	
	
	//alloptions print
	String list = month.getText();
	System.out.println(list);
	
	
	//alphabetical
	List<WebElement> allopt = obj.getOptions();
	for(WebElement opt:allopt)
	{
		String str = opt.getText();
		tr.add(str);
	}
	for(String s1:tr)
	{
		System.out.println(s1);
	}
	
	
	}
}
