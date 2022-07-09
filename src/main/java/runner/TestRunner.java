package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =  "src/main/java/features", 
				 glue = {"pageSteps"}, plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}
