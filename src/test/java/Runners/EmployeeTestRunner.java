package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/features/EmployeeCreateUpdateDelete.feature"},//paste here the feature file ptah
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {"pretty", "html:target/report/index.html"}

)

public class EmployeeTestRunner extends AbstractTestNGCucumberTests {
}
