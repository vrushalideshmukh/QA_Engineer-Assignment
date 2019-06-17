package com.sel.utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.application.pages.Addcomputerpage;

public class WebdriverInstance {
	
	public static WebDriver driver;
	public static String baseURL="http://computer-database.herokuapp.com/computers";
	
	public static void SetUp() {
		
		//calling driver to open browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();  
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
	}

}
