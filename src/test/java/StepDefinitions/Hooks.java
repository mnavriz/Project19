package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Base;

public class Hooks extends Base {

    public Hooks(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/MN/Desktop/chromedriver");
        driver = new ChromeDriver(); // TODO: parameterize browser
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);
    }

    @After
    public void quit(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
