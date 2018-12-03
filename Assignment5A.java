package com.ibm.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5A {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		driver.get("https://www.jcpenney.com/");
		
		System.out.println("The title of the page: " +driver.getTitle());
		
		WebElement alertEle = driver.findElement(By.xpath("//a[@id='closeButton']"));
		alertEle.click();
		System.out.println("The alert message is closed...");
				
		WebElement searchtextEle= driver.findElement(By.xpath("//input[@id='searchTerm']"));
		searchtextEle.sendKeys("shirts");
		Thread.sleep(1000);
		
		WebElement searchEle= driver.findElement(By.xpath("//button[@class='btn_searchForm']"));
		searchEle.click();
		
		System.out.println("The title of the page: " +driver.getTitle());
		System.out.println("The search result for shirts is displayed...");
		
		WebElement searchresultEle= driver.findElement(By.xpath("//img[@class='productDisplay_image--default']"));
		searchresultEle.click();
		
		WebElement sizeddEle= driver.findElement(By.xpath("//select[@id='SIZE']"));
		sizeddEle.click();
				
		Select select = new Select(sizeddEle);
		select.selectByVisibleText("18 / 36-37");
		
		WebElement colorEle= driver.findElement(By.xpath("//img[@title='Blooming Blue']"));
		colorEle.click();
		
		WebElement addtobagEle= driver.findElement(By.xpath("//button[@name='add to bag']"));
		addtobagEle.click();
		Thread.sleep(5000);
		System.out.println("The title of the page: " +driver.getTitle());
		
		WebElement checkoutEle= driver.findElement(By.xpath("//input[@id='btncheckout']"));
		checkoutEle.click();
		
		WebElement fcheckoutEle= driver.findElement(By.xpath("//input[@id='Checkout']"));
		fcheckoutEle.click();
		
		System.out.println("The title of the page: " +driver.getTitle());
		System.out.println("The sign in page is displayed...");
		System.out.println("End of program!!!");
	}
}
