package runner1;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "" ,features = "src/test/resources/feature", glue = "stepDefinition1", plugin = {"pretty", "json:./reports/cucumber-reports/index.json", "html:/reports/cucumber-reports/index.html","rerun:target/failed.txt", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Testrunner  extends AbstractTestNGCucumberTests {
	 
	   @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	 
	}
