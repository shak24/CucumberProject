package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseUtil{
	//public WebDriver driver;
	@Given("^Member has an account$")
	public void member_has_an_account() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
	//	driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
	    driver.get("https://demoblaze.com/");
	}

	@When("^Member logs in with his valid credentials$")
	public void member_logs_in_with_his_valid_credentials() throws Throwable {
		Thread.sleep(5000);
	    driver.findElement(By.id("login2")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("loginusername")).sendKeys("kacido8322@bepureme.com");
	    Thread.sleep(5000);
	    driver.findElement(By.id("loginpassword")).sendKeys("Test@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    Thread.sleep(20000); 
	}

	@When("^Member adds a product to the shopping cart$")
	public void member_adds_a_product_to_the_shopping_cart() throws Throwable {
		driver.findElement(By.xpath("//div[@id='tbodyid']/div[1]//a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

	@Then("^the product is visible in the shopping cart$")
	public void the_product_is_visible_in_the_shopping_cart() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(2000);
	    assert driver.findElement(By.xpath("//tr[@class='success']")).isDisplayed();
	}

	@Given("^Guest does not have an account$")
	public void guest_does_not_have_an_account() throws Throwable {
		driver.get("https://demoblaze.com/");
	}

	@When("^Guest adds a product to the shopping cart$")
	public void guest_adds_a_product_to_the_shopping_cart() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='tbodyid']/div[1]//a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

}
