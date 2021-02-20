package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {},//paste here the feature file ptah
        glue = {"steps"},
        dryRun = false,
        plugin = {"pretty", "html:target/report/index.html"}

)

public class EmployeeTestRunner extends AbstractTestNGCucumberTests {
}
