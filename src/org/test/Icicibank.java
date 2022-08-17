package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicibank {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kandasamy\\eclipse-workspace\\SeleniumDay\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("354534");
		
		WebElement go = driver.findElement(By.id("user-id-goahead"));
		go.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@ class='login-input-password' ] "));
		password.sendKeys("513553");
		
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println(elements.size());
		
		
		
		
	}

}
