package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Talent Stack")
	WebElement TALENT_STACK;
	
	@FindBy(how = How.XPATH, using = "//li[@id='menu-item-1923']/child::a[text()='Thrive TRM ']")
	WebElement TALENT_STACK_THRIVE_TRM;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1922']/child::a[text()='Thrive IQ ']")
	WebElement TALENT_STACK_THRIVE_IQ;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1921']/child::a[text()='Thrive Circles ']")
	WebElement TALENT_STACK_THRIVE_CIRCLES;
	
	@FindBy(how = How.LINK_TEXT, using = "Solutions for")
	WebElement SOLUTIONS_FOR;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1908']/child::a[text()='Search Firms']")
	WebElement SOLUTIONS_FOR_SEARCH_FIRMS;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1862']/child::a[text()='Enterprise']")
	WebElement SOLUTIONS_FOR_ENTERPRISE;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1861']/child::a[text()='VC/PE Firms']")
	WebElement SOLUTIONS_FOR_VC_PE_FIRMS;
	
	@FindBy(how = How.LINK_TEXT, using = "Featured Clients")
	WebElement FEATURED_CLIENTS;
	
	@FindBy(how = How.LINK_TEXT, using = "Insights")
	WebElement INSIGHTS;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1947']/child::a[text()='Blog']")
	WebElement INSIGHTS_BLOG;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-1928']/child::a[text()='Resources']")
	WebElement INSIGHTS_RESOURCES;
	
	@FindBy(how = How.XPATH, using = "//li[@id = 'menu-item-2046']/child::a[text()='Newsroom']")
	WebElement INSIGHTS_NEWSROOM;
	
	@FindBy(how = How.LINK_TEXT, using = "Schedule Demo")
	WebElement SCHEDULE_DEMO;
	
	public void clickOnInsightsBlog() {
		INSIGHTS_BLOG.click();
	}
	
	public void clickOnInsightsResources() {
		INSIGHTS_RESOURCES.click();
	}
	
	public void clickOnInsightsNewsroom() {
		INSIGHTS_NEWSROOM.click();
	}
	
	public void clickOnScheduleDemo() {
		SCHEDULE_DEMO.click();
	}

}
