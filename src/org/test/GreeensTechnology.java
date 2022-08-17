package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreeensTechnology {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kandasamy\\eclipse-workspace\\SeleniumDay\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("greens technology chennai");
	
	String attribute = search.getAttribute("value");
	System.out.println(attribute);
	
	driver.quit();

	}
}