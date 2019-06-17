package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IdeapadTest {
	
WebDriver driver;
	
	@Test
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("disable-infobars");
		driver = new ChromeDriver(opt);
		driver.get("https://montra.com");
		driver.close();
	}

}
