package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utility.SelectUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalesStepdef {
	
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
	
	
	/*@Given("^user should be on selese page$")
	public void user_should_be_on_selese_page() throws Throwable {
		driver.get("https://ingecnotechnologies.com/EProcurment/index.php");
		//driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass");
		 driver.findElement(By.xpath("//input[@type='submit']")).submit();
		//Thread.sleep(3000);
		 WebElement module=driver.findElement(By.xpath("//div[@class='tabs']//child::a[@accesskey='S']"));
		Actions action=new Actions(driver);
		action.click(module).perform();
		//action.click(module).perform();
		
		//driver.get("https://ingecnotechnologies.com/EProcurment/index.php?application=orders");

		driver.manage().window().maximize();
	}*/

	@When("^user should fill details of new costomers$")
	public void user_should_fill_details_of_new_costomers() throws Throwable {

		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//tr[3]/td/table/tbody/tr[2]/td[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@name='CustName']")).sendKeys("Nilam Dhiraj Patil");
		driver.findElement(By.xpath("//input[@name='cust_ref']")).sendKeys("nillRaj");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Nanded city Pune");
		driver.findElement(By.xpath("//input[@name='tax_id']")).sendKeys("1010");
		WebElement nm= driver.findElement(By.xpath("//select[@_last='3']"));
		SelectUtils.selectByText(nm, "Rupees");   
		
		 //  driver.findElement(By.xpath("//span[@id='_sales_type_sel']")).sendKeys("phone");
		   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("778421314");
		   driver.findElement(By.xpath("//input[@name='phone2']")).sendKeys("7711155311");
		   driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("20205");
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("draj@gmail.com");
		   driver.findElement(By.xpath("//input[@name='bank_account']")).sendKeys("958586243");
		   WebElement gg= driver.findElement(By.xpath("//select[@id='salesman']"));
		   SelectUtils.selectByText(gg, "Robert");
		   
		   driver.findElement(By.xpath("//input[@name='discount']")).sendKeys("99");
		   driver.findElement(By.xpath("//input[@name='pymt_discount']")).sendKeys("15");
		   driver.findElement(By.xpath("//input[@name='credit_limit']")).sendKeys("80000");
		   WebElement pp= driver.findElement(By.xpath("//select[@id='payment_terms']"));
		   SelectUtils.selectByText(pp, "POSTPAID");

		   WebElement pg= driver.findElement(By.xpath("//select[@id='credit_status']"));
		   SelectUtils.selectByValue(pg, "5");
		   
		   WebElement dd= driver.findElement(By.xpath("//select[@id='dimension_id']"));
		   SelectUtils.selectByIndex(dd, 2);
		   driver.findElement(By.xpath("//textarea[@name='notes']")).sendKeys("neel");
		   WebElement rr= driver.findElement(By.xpath("//select[@id='location']"));
		   SelectUtils.selectByIndex(rr, 0);
		   WebElement aa= driver.findElement(By.xpath("//select[@id='ship_via']"));
		   SelectUtils.selectByIndex(aa, 1);
		   WebElement ee= driver.findElement(By.xpath("//select[@id='area']"));
		   SelectUtils.selectByIndex(ee, 5);
		   WebElement tt= driver.findElement(By.xpath("//select[@id='tax_group_id']"));
		   SelectUtils.selectByIndex(tt, 0);
		   driver.findElement(By.xpath("//button[@class='inputsubmit']")).click();
		   }
	
	@Then("^user can see new costomer name$")
	public void user_can_see_new_costomer_name() throws Throwable {
		String actMsg=driver.findElement(By.xpath("//td[@align='right']")).getText();
	    String exMsg="Press Space tab to filter by name fragment; F2 - entry new customer";
	    Assert.assertEquals(actMsg, exMsg);	
	}
	

}
