package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(

            features = {"src/test/java/features/ExamCreateUpdateDelete.feature"},//paste here the feature file ptah
            glue = {"steps"},
            dryRun = false,
            plugin = {"pretty", "html:target/report/index.html"}

    )

    public class EntranceExamTestsRunner extends AbstractTestNGCucumberTests {
}
