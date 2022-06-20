package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOutStepdef {
	
WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		
	
	}
	@After
	public void tearDown(){
		driver.close();
	}
	
	@Given("^user should be login$")
	public void user_should_be_login() throws Throwable {
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
	   
	}

	@When("^user should click on logout button$")
	public void user_should_click_on_logout_button() throws Throwable {
		driver.findElement(By.xpath("//a[@href='./access/logout.php?']")).click();
	   
	}

	@Then("^user can see the massage of logout$")
	public void user_can_see_the_massage_of_logout() throws Throwable {
		String actMsg=driver.findElement(By.xpath("//a[@href='../index.php']")).getText();
	    String exMsg="Click here to Login Again.";
	    Assert.assertEquals(actMsg, exMsg);	
	}



}
