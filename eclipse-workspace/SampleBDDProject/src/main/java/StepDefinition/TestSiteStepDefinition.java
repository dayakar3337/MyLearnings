package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class TestSiteStepDefinition 
{

	WebDriver driver;
	
	@Given("^I'm on TestSite home page$")
	public void TestSiteHomePage()
	{
		try 
		{
		    System.setProperty("webdriver.chrome.driver","C:\\workspace\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/");
			System.out.println("Navigate to test site successflly");
		}
		catch(Exception e)
		{
			System.out.println("unable to navigate to test site" + e.getStackTrace());
		}

	}

	@When("^I click on Elements icon$")
	public void ClickOnElementsIcon()
	{
		try
		{	
			WebElement ElementsIcon = driver.findElement(By.xpath("(//div[contains(@class,'avatar mx-auto white')])[1]"));
			if(ElementsIcon.isEnabled())
			{
				Thread.sleep(2000);
				ElementsIcon.click();
				System.out.println("Able to click on Elemets Icon");
			}
			else 
			{
				System.out.println("Element is Disabled");
			}
		}
		catch(Exception e) 
		{
			System.out.println("Elements Icon is not clickable" + e.getStackTrace());
		}
	    
	}

	@When("^I Click on Text Box icon$")
	public void ClickOnTextBoxIcon() 
	{
	    try 
	    {
	    	WebElement TextBoxIcon = driver.findElement(By.xpath("//span[contains(.,'Text Box')]"));
	    	if(TextBoxIcon.isEnabled())
	    	{
	    		Thread.sleep(1000);
	    		TextBoxIcon.click();
	    		System.out.println("Testbox icon enabled");
	    	}
	    	else
	    	{
	    		System.out.println("TextBox is Disabled");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("TextBox Icon is not clickable" + e.getStackTrace());
	    }

	}

	@Then("^I enter the required details$")
	public void EnterDetails() 
	{
		 try 
		    {
		    	WebElement FullName = driver.findElement(By.id("userName"));
		    	FullName.sendKeys("Test User");
		    	WebElement Email = driver.findElement(By.id("userEmail"));
		    	Email.sendKeys("tuser1@test.com");
		    	WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
		    	CurrentAddress.sendKeys("123 Meadoe Creek Dr" + "\n" +"Apt # 001" + "\n" + "Irving" +"\n" + "TX 75038.");
		    	WebElement PermanentAddress = driver.findElement(By.id("permanentAddress"));
		    	PermanentAddress.sendKeys("123 Meadoe Creek Dr" + "\n" +"Apt # 001" + "\n" + "Irving" +"\n" + "TX 75038.");
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Not able to enter required details" + e.getStackTrace());
		    }
	}

	@Then("^I click on Submit button$")
	public void ClickOnSubmitBtn()
	{
	    try 
	    {
	    	WebElement SubmitBtn = driver.findElement(By.id("submit"));
	    	if(SubmitBtn.isEnabled()) 
	    	{
	    		SubmitBtn.click();
		    	System.out.println("submit button is enabled and clicked");
	    	}
	    	else
	    	{
	    		System.out.println("submit button is disabled");
	    	}
	    }
	    	catch(Exception e)
	    	{
	    		System.out.println("submit Button is not clickable" + e.getStackTrace());
	    	}
	    driver.close();
	  }

	
}

	


	
	
	
	
	
	
	
	
	
	

