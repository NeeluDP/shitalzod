package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalesGroup {
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
	
	@Given("^user should be on sales page$")
	public void user_should_be_on_sales_page() throws Throwable {
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		 WebElement module=driver.findElement(By.xpath("//div[@class='tabs']//child::a[@accesskey='S']"));
		Actions action=new Actions(driver);
		action.click(module).perform();
	    driver.findElement(By.xpath("//tr[3]/td/table/tbody/tr[2]/td[1]/a[3]")).click();
	}

	@When("^user should be create new sale groups$")
	public void user_should_be_create_new_sale_groups() throws Throwable {
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MyProject");
	   driver.findElement(By.xpath("//button[@value='Add new']")).click();
		
	}

	@Then("^use can see new sales group Name and Id$")
	public void use_can_see_new_sales_group_Name_and_Id() throws Throwable {
		String actText=  driver.findElement(By.xpath("//div[@id='msgbox']")).getText();
		  String expText= "";
		 
		 Assert.assertEquals(actText,expText);
	}

}
