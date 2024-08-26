package step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefination {
	WebDriver driver;
	@Given("i open browser with url {string}")
	public void i_open_browser_with_url(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	   
	}

	@When("i enter username as {string}")
	public void i_enter_username_as(String username) {
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	}

	@When("i enter password as {string}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	   
	}

	@When("i click login button")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	   Thread.sleep(5000);
	}

	@When("i click logout")
	public void i_click_logout() throws Throwable {
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	
	@When("i close Browser")
	public void i_close_Browser() {
	    
		driver.close();
	}

}
