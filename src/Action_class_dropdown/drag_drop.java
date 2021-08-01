package Action_class_dropdown;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		import selenium.webdriver;

		public class drag_drop 
		{
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement src= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
			
			WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

			
		Actions act = new Actions(driver);

		act.dragAndDrop(src, dest).release().build().perform();
		
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		String text = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]")).getText();
		System.out.println(text);
		}
		
		}
