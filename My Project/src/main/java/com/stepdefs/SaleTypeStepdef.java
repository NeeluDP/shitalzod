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

public class SaleTypeStepdef {
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
	
	
	@Given("^user should be on sales types page$")
	public void user_should_be_on_sales_types_page() throws Throwable {
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		 WebElement module=driver.findElement(By.xpath("//div[@class='tabs']//child::a[@accesskey='S']"));
		Actions action=new Actions(driver);
		action.click(module).perform();
		driver.findElement(By.xpath("//a[@accesskey='Y']")).click();
	    
	}

	@When("^user should add new sales types$")
	public void user_should_add_new_sales_types() throws Throwable {
		driver.findElement(By.xpath("//input[@name='sales_type']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@name='factor']")).clear();
		driver.findElement(By.xpath("//input[@name='factor']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@name='tax_included']")).click();
		driver.findElement(By.xpath("//button[@name='ADD_ITEM']")).click();
		
	    
	}

	@Then("^user can see msg of new sale type added$")
	public void user_can_see_msg_of_new_sale_type_added() throws Throwable {
	 
		String actMsg=driver.findElement(By.xpath("//body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[1]")).getText();
	    String exMsg="";
	    Assert.assertEquals(actMsg, exMsg);	
	}



}
