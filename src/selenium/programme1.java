package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class programme1
{
public static void main(String[] args)
{
	//1st selenium program:  open browser
	//Step1: set ChromeDriver.exe file path using system.setProperty(parameter1, marameter2) method
	//parameter1- name of browser (small letter)
	//parameter2- path of browser (convert \ to \\)
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	//Step2: create an object of chromedriver class with ref of wibdriver interface
	
	WebDriver d=new ChromeDriver();
}
}
