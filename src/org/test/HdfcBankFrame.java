package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBankFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kandasamy\\eclipse-workspace\\SeleniumDay\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		findElement.sendKeys("kanda@2211");
//		
//		WebElement findElement2 = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
//		findElement2.click();
		
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.tagName("img"));
		int size = elements.size();
		System.out.println(size);
		
		
	
}
}