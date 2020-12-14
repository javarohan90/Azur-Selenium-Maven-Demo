package com.selmav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		System.out.println("Google open successfully");
		driver.findElement(By.partialLinkText("Sign in")).click();
		System.out.println("Successfully clicked on Sign in link");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Driver closed");

	}

}
