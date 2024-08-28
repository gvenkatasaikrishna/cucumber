package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class Practice1_Skills {
	 WebDriver driver;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user opens url {string}")
	public void user_opens_url(String URL) {
		
	   driver.get(URL);
	}

	@When("login into application with below credentials")
	public void login_into_application_with_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		
		String UserName = dataTable.cell(0, 0);
		String Password = dataTable.cell(0, 1);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    
	}

	@Then("created skills record")
	public void created_skills_record(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> Skilldata = dataTable.cells();
		for(int i=0;i<Skilldata.size();i++) {
			
			String SkillName = Skilldata.get(i).get(0);
			String SkillDesc = Skilldata.get(i).get(0);
			
			driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
			driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();
			driver.findElement(By.xpath("//a[@id='menu_admin_viewSkills']")).click();
			driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
			driver.findElement(By.xpath("//input[@id='skill_name']")).sendKeys(SkillName);
			driver.findElement(By.xpath("//textarea[@id='skill_description']")).sendKeys(SkillDesc);
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			
		}
			
	    
	}

	@When("i logout the application")
	public void i_logout_the_application() throws Throwable {
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	   
	}

	@Then("i close the browser")
	public void i_close_the_browser() {
	    
		driver.quit();
	}

}
