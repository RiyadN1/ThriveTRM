package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Page.BasePage;
import Page.HomePage;
import Util.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ResourcesSteps extends BasePage{
	
	WebDriver driver;
	HomePage homepage;
	
	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Given("^a user$")
	public void a_user() {
	    
	}

	@When("^user navigates to insights$")
	public void user_navigates_to_insights() {
		WebElement insights = driver.findElement(By.linkText("Insights"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(insights).build().perform();
	}

	@When("^selects Resources$")
	public void selects_Resources() throws InterruptedException {
		Thread.sleep(3000);
		WebElement resources = driver.findElement(By.xpath("//li[@id='menu-item-1928']/child::a[text()='Resources']"));
		waitForElement(resources, driver);
		homepage.clickOnInsightsResources();
	}

	@Then("^user should be taken to resources page$")
	public void user_should_be_taken_to_resources_page() throws InterruptedException {
		Thread.sleep(3000);
		String expectedTitle = "Resources - Thrive TRM";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Page Not Found", expectedTitle, actualTitle);
	    
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
