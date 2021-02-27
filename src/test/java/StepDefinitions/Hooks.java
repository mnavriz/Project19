package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Base;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReadFromConfigFile;

public class Hooks extends Base {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Before
    public void setUp() {
        driver.get(ReadFromConfigFile.getValueFor("homepage"));
        driver.manage().window().maximize();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }

    @After
    public void quit(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
