package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_data_InRow_dynamictable 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/vishal/software%20testing/java+mannual/book.html");
		
		int colsize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[2]/td")).size();
		System.out.println(colsize);
		
		for(int i=1;i<colsize;i++)
		{
			String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]")).getText();
		    System.out.print(text+" ");
		}

		System.out.println();

	} 
	}


