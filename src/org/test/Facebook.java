package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kandasamy\\eclipse-workspace\\SeleniumDay\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("kandasamy");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("kand@9999");
    WebElement login = driver.findElement(By.id("loginbutton"));
			login.click();
			String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.get(url);
			System.out.println(url);
	
}
}
