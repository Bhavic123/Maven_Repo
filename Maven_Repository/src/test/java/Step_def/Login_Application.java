package Step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Application {

	public WebDriver driver;
	@Given("Login to the browser")
	public void login_to_the_browser() {
		System.out.println("======Login to the browser========");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("I navigate to url {string}")
	public void i_navigate_to_url(String string) {
		System.out.println("========User enter the url in browser========");
		driver.get("https://www.saucedemo.com/");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		System.out.println("========User enters username and password into the Application============");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("click on signin button")
	public void click_on_signin_button() {
		System.out.println("=======Click on signin button=========");
		driver.findElement(By.id("login-button")).click();
	}

	@Then("I naviagate to the home page")
	public void i_naviagate_to_the_home_page() {
		System.out.println("=======Then user should navigate to home page========");
	    driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed();
	    driver.quit();
	    
	}



}
