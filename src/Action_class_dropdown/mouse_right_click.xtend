package Action_class_dropdown

import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import selenium.webdriver

class mouse_right_click {
	def static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\")
		var WebDriver driver = new ChromeDriver()
		driver.get("https://www.flipkart.com")
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click()
		var WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"))
		var Actions act = new Actions(driver)
		act.moveToElement(loginbtn).contextClick().build().perform()
		act.moveToElement(loginbtn).click().perform()
	}
}
