package com.RegressionTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.application.pages.Addcomputerpage;
import com.sel.utlity.WebdriverInstance;

public class AddComputerTestCase extends WebdriverInstance  {
	public static void main(String[] args) {
		System.out.println("Testing started");
		AddComputerTestCase.AddNewComputerbutton();
	}
				
	public static void AddNewComputerbutton() 
	{
		createthiscomputerbutton();
		cancelbutton();
		addonlycomputername();
		withoutcomputername();	
	}
	
	//testcase1 - add new computer by providing all the valid details for all the fields
	
	public static void createthiscomputerbutton()
	{	
		WebdriverInstance.SetUp();
	    Addcomputerpage add=new Addcomputerpage(driver);
		add.enternewcomputer();
		add.typecomputername();
		add.typeintroduceddate();
		add.typediscontinueddate();
		add.typecompany();
		add.typecreatecomputerbutton();
		String actual_error = driver.findElement(By.cssSelector(".alert-message.warning")).getText();
		String expected_error = "Done! Computer New_Computer has been created";
		if (actual_error.equals(expected_error))
		{
			System.out.println("Computer name is added");
		}
		System.out.println("Testcase1 for computer creation with all field completed successfully...!!!");
		driver.quit();
	}
	
	//testcase2- click on cancel button lands to home page
	
	public static void cancelbutton()
	{
		WebdriverInstance.SetUp();
		System.out.println(driver.getTitle());
		Addcomputerpage add=new Addcomputerpage(driver);
		add.enternewcomputer();
		add.typecancelbutton();
		System.out.println("Testcase2 : Cancel button has been tested successfuly...!!!");
		driver.quit();
	}
	
	//testcase3 add new computer by providing only computer name
	
	public static void addonlycomputername()
	{
		WebdriverInstance.SetUp();
		System.out.println(driver.getTitle());
		Addcomputerpage add=new Addcomputerpage(driver);
		add.enternewcomputer();
		add.typecomputername();
		add.typecreatecomputerbutton();
		String actual_error = driver.findElement(By.cssSelector(".alert-message.warning")).getText();
		String expected_error = "Done! Computer New_Computer has been created";
		if (actual_error.equals(expected_error))
		{
			System.out.println("Computer name is added");
		}
		System.out.println("Testcase3 add with only computer name is completed successfully...!!!");
		driver.quit();
	}
	
	//testcase 4 error message clicking Create this computer button and not providing a computer name
	
		public static void withoutcomputername()
		{
			WebdriverInstance.SetUp();
			System.out.println(driver.getTitle());
			Addcomputerpage add=new Addcomputerpage(driver);
			add.enternewcomputer();
			add.typecreatecomputerbutton();
		String actual_error = driver.findElement(By.cssSelector(".clearfix.error")).getText();
		String expected_error = "Computer name\nRequired";
		if (actual_error.equals(expected_error))
		{
			System.out.println("Computer name is required");
		}
		System.out.println("Testcase4 for checking error message checked successfully...!!!");
		driver.quit();
	}	 
	}
			
