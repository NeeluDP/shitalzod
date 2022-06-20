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

public class UpdateSalegroup {
	
WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		
	
	}
	@After
	public void tearDown(){
		//driver.close();
	}
	
	/*@Given("^user should be on sales group page$")
	public void user_should_be_on_sales_group_page() throws Throwable {
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		 WebElement module=driver.findElement(By.xpath("//div[@class='tabs']//child::a[@accesskey='S']"));
		Actions action=new Actions(driver);
		action.click(module).perform();
	    driver.findElement(By.xpath("//tr[3]/td/table/tbody/tr[2]/td[1]/a[3]")).click();
	}*/

	@When("^user should be update  the sales group$")
	public void user_should_be_update_the_sales_group() throws Throwable {
		
		driver.findElement(By.xpath("//td[text()='project']//following-sibling::td/button[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Accounting12");
		driver.findElement(By.xpath("//button[@title='Submit changes']")).click();
	   
	}

	@Then("^user can see upadeted massage$")
	public void user_can_see_upadeted_massage() throws Throwable {
		String actMsg=driver.findElement(By.xpath("//div[@class='note_msg']")).getText();
	    String exMsg="Selected sales group has been updated";
	    Assert.assertEquals(actMsg, exMsg);	
	    
	}

}
