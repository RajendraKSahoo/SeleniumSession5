package com.ibm.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5B {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		driver.get("https://www.facebook.com/");
				
		WebElement fnameEle= driver.findElement(By.xpath("//input[@id='u_0_j']"));
		fnameEle.sendKeys("Firstname");
		
		WebElement snameEle= driver.findElement(By.xpath("//input[@id='u_0_l']"));
		snameEle.sendKeys("Surname");
		
		WebElement mobEle= driver.findElement(By.xpath("//input[@id='u_0_o']"));
		mobEle.sendKeys("9810098100");
		
		WebElement pwdEle= driver.findElement(By.xpath("//input[@id='u_0_v']"));
		pwdEle.sendKeys("Password123");
		
		WebElement signupEle= driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		signupEle.click();
		
		System.out.println("Entered all desired inputs and clicked on button Sign Up...");
		
		System.out.println("The end of program!!!");
	}
}