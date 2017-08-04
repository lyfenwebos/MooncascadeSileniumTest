package com.org.MavenTest;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Case_1 {
	@Test
	public void FeedbackTest(){
		System.out.println("Starting the testcase shortly...");
		File file = new File("C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		System.out.println("Starting first stage");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kask6iktundubkorras.sayat.me/?lang.en");
		driver.findElement(By.xpath("//*[@class='nav navbar-nav pull-right']/li[2]/a")) .click();
		WebElement login = driver.findElement(By.id("fburl_d"));
		login.sendKeys("testPavel123");
		WebElement passwd = driver.findElement(By.id("login_passwd_d"));
		passwd.sendKeys("123456");
		driver.findElement(By.xpath("//*[@class='front-splash hidden-xs']/div/div[2]/form/div/button[1]")).click();
		System.out.println("Starting second stage");
		WebElement search = driver.findElement(By.xpath("//*[@class='nav navbar-nav visible-sm']/li/a"));
		search.click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pavel Gon");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//a[contains(text(),'testPavel')]"));
		elements.get(1).click();
		String textToSend = "This is a test!";
		driver.findElement(By.id("give-feedback-textarea")).sendKeys(textToSend);
		driver.findElement(By.id("give-feedback-button")).click();
		//In case of slow Internet speed;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//p[contains(text(), 'This is a test!')]"));
		driver.findElement(By.id("a-label")).click();
		System.out.println("Starting third stage");
		driver.findElement(By.className("remove_item")).click();
		Alert alert = driver.switchTo().alert();
		alert .accept();
		System.out.println("TEST COMPLETED!");

	}
}
	
	
