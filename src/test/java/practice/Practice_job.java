package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Practice_job {
	
	WebDriver driver;
	
	@Given("i open browser with url {string}")
	public void i_open_browser_with_url(String url) {
		
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.navigate().to(url);
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
	public void i_click_login_button() {
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click(); 
	}

	@Then("i click Admin button")
	public void i_click_Admin_button() {
	  
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	}

	@Then("i click job link")
	public void i_click_job_link() {
		
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();  
	}

	@Then("i click jobtitle button")
	public void i_click_jobtitle_button() {
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
	}

	@When("i click Add button")
	public void i_click_Add_button() {
		
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	}

	@Then("i enter job title as {string} and i enter job Description as {string} and i enter job note as {string}")
	public void i_enter_job_title_as_and_i_enter_job_Description_as_and_i_enter_job_note_as(String jobtitle, String jobdesc, String jobnote) {
	   
		driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']")).sendKeys(jobtitle);
		driver.findElement(By.xpath("//textarea[@id='jobTitle_jobDescription']")).sendKeys(jobdesc);
		driver.findElement(By.xpath("//textarea[@id='jobTitle_note']")).sendKeys(jobnote);
	}

	@When("i click save button")
	public void i_click_save_button() {
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@When("i click logout")
	public void i_click_logout() throws Throwable {
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	@When("i close Browser")
	public void i_close_Browser() {
	 
		driver.quit();
	}

}
