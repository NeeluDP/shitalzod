package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepdef {

	WebDriver driver;
	//hooks in cucumber--which will execute before andafter every scenario
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@After
	public void tearDown(){
		driver.close();
	}
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
	    
		
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		driver.manage().window().maximize();
		
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
//	   Actions act=new Actions(driver);
//	   act.doubleClick(driver.findElement(By.id("LoginForm_password"))).perform();
//	   act.sendKeys(Keys.TAB).perform();
	   WebElement ff= driver.findElement(By.xpath("//select"));
	   Select ss=new Select(ff);
	   ss.selectByVisibleText("EProcurment");
	   driver.findElement(By.xpath("//input[@type='submit']")).submit();
	  
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_profile_page() throws Throwable {
	    
		Assert.assertEquals("Main Menu",driver.getTitle());
	}
}
