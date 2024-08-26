package testRunner;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = {"./Feature/practice.feature"},glue = {"practice"},plugin= {"html:target/cucumber-reports"},monochrome = true )
public class Runner extends AbstractTestNGCucumberTests {

}

