package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 



@RunWith(Cucumber.class) 

@CucumberOptions( 
features = "C:\\Users\\DRetineni\\eclipse-workspace\\SampleBDDProject\\src\\main\\java\\Features\\TestSite.feature" // path of the feature file
,glue={"StepDefinition"}, // path of the step definition 
monochrome = true // to make the output readable 
//plugin = {"html:CucumberReports/cucumber-html-report", "json: CucumberReports/cucumber.json" , "junit: CucumberReports/cucumber.xml"},// if want to generate report in proper way or create any Html,JsondryRun = false
//dryRun = false, // to check the mapping is proper between feature file and  step definition file
//strict = true //check if any step definition is not defined in step definition file

) 

public class TestRunner {
	
	

}
