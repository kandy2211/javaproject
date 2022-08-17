package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kandasamy\\eclipse-workspace\\SeleniumDay\\driver\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("cuddalore");
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("chennai");
	WebElement login = driver.findElement(By.id("search_btn"));
	login.click();
}
}
