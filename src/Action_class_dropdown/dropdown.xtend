package Action_class_dropdown

import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import selenium.webdriver

class dropdown {
	def static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\")
		var WebDriver driver = new ChromeDriver()
		driver.get("https://www.flipkart.com/")
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		driver.manage().window().maximize()
		// close login page
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click()
		// identify dropdown elemwnt
		var WebElement btn = driver.findElement(By.xpath("//a[text()='Login']"))
		// create a object of action class
		var Actions act = new Actions(driver)
		// use action class method
		act.moveToElement(btn).perform()
		// click on orders oprtion
		driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[3]")).click()
	}
}
