package runner1;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "" ,features = "src/test/resources/feature", glue = "stepDefinition1", plugin = {"json:target/cucumber-report.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Testrunner  extends AbstractTestNGCucumberTests {
	 
	   @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	 
	}
