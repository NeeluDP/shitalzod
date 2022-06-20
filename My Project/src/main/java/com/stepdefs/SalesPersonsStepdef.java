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

public class SalesPersonsStepdef {
	
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
	
	@Given("^user should be on sale persons page$")
	public void user_should_be_on_sale_persons_page() throws Throwable {
	   
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		 WebElement module=driver.findElement(By.xpath("//div[@class='tabs']//child::a[@accesskey='S']"));
		Actions action=new Actions(driver);
		action.click(module).perform();
		driver.findElement(By.xpath("//a[@href='./sales/manage/sales_people.php?']")).click();
	    
	}

	@When("^user should add new persons dada$")
	public void user_should_add_new_persons_dada() throws Throwable {
		driver.findElement(By.xpath("//input[@name='salesman_name']")).sendKeys("ashu");
		driver.findElement(By.xpath("//input[@name='salesman_phone']")).sendKeys("88574521");
		driver.findElement(By.xpath("//input[@name='salesman_fax']")).sendKeys("44857");
		driver.findElement(By.xpath("//input[@name='salesman_email']")).sendKeys("ashu@gmail.com");
		driver.findElement(By.xpath("//input[@name='provision']")).sendKeys("15");
		driver.findElement(By.xpath("//input[@name='break_pt']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@name='provision2']")).sendKeys("18");
		driver.findElement(By.xpath("//button[@value='Add new']")).click();
	    
	}

	@Then("^user can see new sale person Dada$")
	public void user_can_see_new_sale_person_Dada() throws Throwable {
	   
		String actMsg=driver.findElement(By.xpath("//body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[1]")).getText();
	    String exMsg="";
	    Assert.assertEquals(actMsg, exMsg);	
	}



}
