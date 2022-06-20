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

public class SaleAreaName {
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
	
	@Given("^user should be on sales areas page$")
	public void user_should_be_on_sales_areas_page() throws Throwable {
		
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		 WebElement module=driver.findElement(By.xpath("//div[@class='tabs']//child::a[@accesskey='S']"));
		Actions action=new Actions(driver);
		action.click(module).perform();
		driver.findElement(By.xpath("//a[@href='./sales/manage/sales_areas.php?']")).click();
	    
	}

	@When("^user should be udate the sales area name$")
	public void user_should_be_udate_the_sales_area_name() throws Throwable {
		WebElement area=driver.findElement(By.xpath("//button[@name='Edit3']"));
		Actions act =new Actions(driver);
		act.click(area).perform();
		
		driver.findElement(By.xpath("//input[@name='description']")).clear();
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Hydrabad");
		driver.findElement(By.xpath("//button[@name='UPDATE_ITEM']")).click();

	   
	}

	@Then("^user can see updated sales area name$")
	public void user_can_see_updated_sales_area_name() throws Throwable {
	    
		String actMsg=driver.findElement(By.xpath("//body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[1]")).getText();
	    String exMsg="";
	    Assert.assertEquals(actMsg, exMsg);	
	}



}
