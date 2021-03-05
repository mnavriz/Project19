package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Base;
import pages.LoginPage;
import pages.TopMenu;
import utilities.Driver;

public class LoginPageSteps  {

    WebDriver driver = Driver.getDriver();
    TopMenu topMenu = new TopMenu();
    LoginPage loginPage = new LoginPage();

    @Given("Open Campus homepage")
    public void openCampusHomepage() {
            driver.get("https://test.campus.techno.study");
    }

    @Then("Verify login")
    public void verifyLoginStatus() {
        Assert.assertTrue(topMenu.getTextOfTopMenuProfileMenu().contains("Saurbekov"));
    }


}
