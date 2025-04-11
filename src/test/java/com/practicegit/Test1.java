package com.practicegit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.close();
	driver.quit();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
}
}
