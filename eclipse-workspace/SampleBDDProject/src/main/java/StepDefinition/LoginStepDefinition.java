package StepDefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

	
	 WebDriver driver; 
	 
	 @Given("^User launched Chrome browser$")
	 public void user_is_on_Home_Page() {
		    System.setProperty("webdriver.chrome.driver","C:\\workspace\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.println("Browser launched successfully");
	 }


		@When("^User open Google Home page$")
		public void user_Navigate_to_Home_Page() {
			 driver.navigate().to("https://www.google.com");
		     driver.manage().window().maximize();
		     System.out.println("User is on Google home page");
		}

		@Then("^I verify the the page displays search text box$")
		public void user_enters_UserName_and_Password()  {
			try { 
			driver.findElement(By.xpath("//input[@name='q']")); 
			 System.out.println("Search text box appear");
			}
			 catch (Exception e) {
					System.out.println("unable to click on element");
			 }
			driver.close();
		}
		 
		
		
}
