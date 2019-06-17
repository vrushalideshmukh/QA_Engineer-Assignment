package com.application.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.sel.utlity.WebdriverInstance;

import org.openqa.selenium.support.ui.Select; 

public class Addcomputerpage  {
WebDriver driver;

public static String baseURL="http://computer-database.herokuapp.com/computers";
    By addnewcomputer=By.id("add");
	By computername=By.id("name");
	By introduceddate=By.id("introduced");
	By discontinueddate=By.id("discontinued");
	By companydropdown=By.name("company");
	By Cancel=By.xpath("//a[@href='/computers']");
	@FindBy(name = "Admin")
	private WebElement Companydropdown;
	By createcomputerbutton=By.cssSelector(".primary");
	By computerNameError=By.cssSelector(".clearfix.error");

//create constructor
	public Addcomputerpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//adding methods
	
	public void enternewcomputer()
	{
		wait2seconds();
		driver.findElement(addnewcomputer).click();
		wait2seconds();
	}
	
	public void typecomputername()
	{
		driver.findElement(computername).sendKeys("New_Computer");
		wait2seconds();
	}
	
	public void typeintroduceddate()
	{
		driver.findElement(introduceddate).sendKeys("2018-06-02");
		wait2seconds();
		
	}
	
	public void typediscontinueddate()
	{
		driver.findElement(discontinueddate).sendKeys("2019-06-05");
		wait2seconds();
	}
	
	public void typecompany()
	{
		Select drop = new Select(driver.findElement(companydropdown));
	    drop.selectByIndex(1);
	    wait2seconds();
	}
	
	public void typecreatecomputerbutton()
	{
		driver.findElement(createcomputerbutton).click();
		wait2seconds();
	}
	
	public void typecancelbutton()
	{
		 driver.findElement(Cancel).click();
		 wait2seconds();
	}
	
	public void updateaddcomputername()
	{
		driver.findElement(computername).sendKeys("xxx");
		wait2seconds();
	}
	
	public static void wait2seconds()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
