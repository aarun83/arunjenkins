package stepDefinition1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinition1 {
	
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options);
	
	@Given("User in the google web page")
	public void user_in_the_google_web_page() {
	    driver.get("https://www.google.co.in");
	}

	@Then("User validate the google page title")
	public void user_validate_the_google_page_title() {
		String expectedTitle ="Google";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		System.out.println("Verify Title");
		
	    Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@Given("User in the flipkart web page")
	public void user_in_the_flipkart_web_page() {
		 driver.get("https://www.flipkart.com");
	}

	@Then("User validate the flipkart page title")
	public void user_validate_the_flipkart_page_title() {
		String expectedTitle1 ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitle1 = driver.getTitle();
		System.out.println(actualTitle1);
		System.out.println("Verify Title");
	    Assert.assertEquals(actualTitle1,expectedTitle1);
	}

}
