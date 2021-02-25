package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewEmployee;

public class EmployeeCreateUpdateDeleteSteps {
    @Given("Click on Human Resources")
    public void clickOnHumanResources() {
        clickOnHumanResources();
    }

    @And("Click on Employees")
    public void clickOnEmployees() {
        clickOnEmployees();
    }

    @And("Click ond Add Employee Button")
    public void clickOndAddEmployeeButton() {
        clickOndAddEmployeeButton();
    }

    @When("Enter {string}")
    public void enter(String firstName) {
    }

    @And("Choose Document Type")
    public void chooseDocumentType() {
        chooseDocumentType();
    }

    @Then("Click on save button")
    public void clickOnSaveButton() {
        clickOnSaveButton();
    }

    @And("Verify <status>")
    public void verifyStatus() {
        verifyStatus();
    }

    @And("Click on Status")
    public void clickOnStatus() {
        clickOnStatus();
    }

    @Then("Update {string}")
    public void update(String firstName, String lastName, String EmployeeID) {


    }

    @And("Confirm")
    public void confirm() {
        confirm();
    }

    @And("Verify {string}")
    public void verify(String status) {
        verifyStatus();
    }

    @Then("Click on delete button")
    public void clickOnDeleteButton() {
        clickOnDeleteButton();
    }

    @And("Click on update button")
    public void clickOnUpdateButton() {
        clickOnUpdateButton();
    }
}
