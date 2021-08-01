package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributes
{
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.myntra.com/");
	//input[@id='add-to-cart-button']
	//xpath by attribute
     
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
	//driver.findElement(By.xpath("//a[@class='hmenu-item']")).click();
	//driver.findElement(By.xpath("//a[@class='hmenu-item']")).click();
	//driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
//	driver.findElement(By.xpath("//body[contains(@class,'a-m-us a-aui_72554-c')]")).click();
	
	driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[1]")).click();
	driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
	driver.findElement(By.xpath("//img[@title='CARLINGTON Unisex Set of 2 Brown & Black Analogue Watch']")).click();
	driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a")).click();
}
}

//*[@id="desktopSearchResults"]/div[2]/section/ul/li[1]/a


