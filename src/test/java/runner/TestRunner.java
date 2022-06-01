package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report.html","json:test-output-reports/JsonReport/report.json","junit:test-output-reports/JunitReport/report.xml"
				  ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
				  glue="stepdefinition",
				  features = "features",
				  monochrome = true,
		          tags = "@SmokeTest3")
public class TestRunner {  

}			
