package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Updatecomputerdetails {

	WebDriver driver;
	By addnewcomputer=By.id("add");
	By computername=By.id("name");
	By introduceddate=By.id("introduced");
	By discontinueddate=By.id("discontinued");
	By companydropdown=By.name("company");
	By Cancel=By.xpath("//a[@href='/computers']");
	By createcomputerbutton=By.cssSelector(".primary");
	By filterbycomputername=By.id("searchbox");
	By filterbynamebutton=By.id("searchsubmit");
	By selectrecord=By.linkText("Amsterdam");
	By saveupdaterecord=By.cssSelector(".btn.primary");
	By deletecomputer=By.cssSelector(".btn.danger");
	
	//create constructor
		public Updatecomputerdetails(WebDriver driver)
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
			driver.findElement(computername).sendKeys("Amsterdam");
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
		
		public void filtercomputername()
		{
			driver.findElement(filterbycomputername).sendKeys("Amsterdam");
			wait2seconds();
		}

		public void clicksearchfilter()
		{
			driver.findElement(filterbynamebutton).click();
			wait2seconds();
		}
		
		public void selectsearch()
		{
			driver.findElement(selectrecord).click();
			wait2seconds();
		}
		
		public void updatecomputername()
		{
			driver.findElement(computername).clear();
			driver.findElement(computername).sendKeys("Eindhoven");
			wait2seconds();
		}
		
		public void savecomputerbutton()
		{
			driver.findElement(saveupdaterecord).click();
			wait2seconds();
		}
		
		public void updateintroduceddate()
		{
			driver.findElement(introduceddate).clear();
			driver.findElement(introduceddate).sendKeys("2018-04-04");
			wait2seconds();
		}
		
		public void updatediscontinueddate()
		{
			driver.findElement(discontinueddate).clear();
			driver.findElement(discontinueddate).sendKeys("2019-05-05");
			wait2seconds();
		}
		
		public void updatecompanyname()
		{
			Select drop = new Select(driver.findElement(companydropdown));
		    drop.selectByIndex(2);
		    wait2seconds();
		}
		
		public void deletebutton()
		{
			driver.findElement(deletecomputer).click();
			wait2seconds();
		}
		
		public static void wait2seconds()
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}