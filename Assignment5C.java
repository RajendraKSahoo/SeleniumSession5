package com.ibm.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5C {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("The title of the page: " +title);
				
		WebElement emailEle= driver.findElement(By.xpath("//input[@id='email']"));
		emailEle.sendKeys("rajsahoo@gmail.com");
		
		WebElement pwdEle= driver.findElement(By.xpath("//input[@id='pass']"));
		pwdEle.sendKeys("*********");
		//since password is confidential so after execution of the program, masking the value. The screen shot of the output shows it is logged in.
		
		WebElement loginEle= driver.findElement(By.xpath("//input[@id='u_0_2']"));
		loginEle.click();
		
		System.out.println("Successfully logged in to Facebook account...");
		String title1 = driver.getTitle();
		System.out.println("The title of the page: " +title1);
		
		System.out.println("The end of program!!!");
	}
}