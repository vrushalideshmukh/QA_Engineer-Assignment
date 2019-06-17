package com.RegressionTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.application.pages.Addcomputerpage;
import com.application.pages.Updatecomputerdetails;
import com.sel.utlity.WebdriverInstance;

public class UpdatecomputerTestcase extends WebdriverInstance {
	public static void main(String[] args) {
		System.out.println("Testing started");
		UpdatecomputerTestcase.updaterecords();
}
	
	public static void updaterecords()
	{
		updatecomputername();
		updateallfields();
		deletecomputer();
	}
	
	//testcase1 update computername 
	public static void updatecomputername()
	{
		WebdriverInstance.SetUp();
		System.out.println(driver.getTitle());
		Addcomputerpage add=new Addcomputerpage(driver);
		Updatecomputerdetails update=new Updatecomputerdetails(driver);
		add.enternewcomputer();
		update.typecomputername();
		add.typecreatecomputerbutton();	
		update.filtercomputername();
		update.clicksearchfilter();
		update.selectsearch();
		update.updatecomputername();
		update.savecomputerbutton();
		String actual_error = driver.findElement(By.cssSelector(".alert-message.warning")).getText();
		String expected_error = "  Computer Eindhoven has been updated\r\n" + 
				"        ";
		if (actual_error.equals(expected_error))
		{
			System.out.println("Computer name is updated");
		}
		System.out.println("Testcase1 updating only withcomputername is completed successfully...!!!");
		driver.quit();
		
	}
	//Testcase2 updating all the fields with valid data
	public static void updateallfields()
	{
	WebdriverInstance.SetUp();
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Addcomputerpage add=new Addcomputerpage(driver);
	Updatecomputerdetails update=new Updatecomputerdetails(driver);
	add.enternewcomputer();
	update.typecomputername();
	update.typeintroduceddate();
	update.typediscontinueddate();
	update.typecompany();
	add.typecreatecomputerbutton();	
	update.filtercomputername();
	update.clicksearchfilter();
	update.selectsearch();
	update.updatecomputername();
	update.updateintroduceddate();
	update.updatediscontinueddate();
	update.updatecompanyname();
	update.savecomputerbutton();
	String actual_error = driver.findElement(By.cssSelector(".alert-message.warning")).getText();
	String expected_error = "  Computer Eindhoven has been updated\r\n" + 
			"        ";
	if (actual_error.equals(expected_error))
	{
		System.out.println("Computer name is updated");
	}
	System.out.println("Testcase2 updating with all fields completed successfully...!!!");
	driver.quit();
}
	//Testcase3 delete should land to home page
	public static void deletecomputer()
	{
		WebdriverInstance.SetUp();
		System.out.println(driver.getTitle());
		Addcomputerpage add=new Addcomputerpage(driver);
		Updatecomputerdetails update=new Updatecomputerdetails(driver);
		add.enternewcomputer();
		update.typecomputername();
		add.typecreatecomputerbutton();	
		update.filtercomputername();
		update.clicksearchfilter();
		update.selectsearch();
		update.deletebutton();
		String actual_error = driver.findElement(By.cssSelector(".alert-message.warning")).getText();
		String expected_error = " Computer has been deleted\r\n" + 
				"        ";
		if (actual_error.equals(expected_error))
		{
			System.out.println("Computer name is deleted");
		}
		System.out.println("Testcase3 : Record has been deleted completed successfully..!!!");
		driver.quit();
		
	}
	
}