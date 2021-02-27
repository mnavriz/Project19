package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee;
import pages.Employees;
import pages.LeftMenu;
import pages.NewEmployee;

import java.util.Map;

public class EmployeeCreateUpdateDeleteSteps {

LeftMenu leftMenu = new LeftMenu();
Employees employees = new Employees();

    /*@Given("Click on Human Resources")
    public void clickOnHumanResources() {
        leftMenu.clickOnHumanResourcesMenu();
    }

    @And("Click on Employees")
    public void clickOnEmployees() {
        clickOnEmployees();
    }

    @And("Click ond Add Employee Button")
    public void clickOndAddEmployeeButton() {employees.clickOnAddEmployeeButton();}

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

    @Then("Update First Name {string}")
    public void updateFirstName(String firstName) {
        updateFirstName(firstName);
    }

    @And("Update Last Name {string}")
    public void updateLastName(String lastName) {
        updateLastName(lastName);
    }

    @And("Update Employee ID {string}")
    public void updateEmployeeID(String employeeID) {
        updateEmployeeID(employeeID);
    }

    @And("Enter Document Number {string}")
    public void enterDocumentNumber(String documentNumber) {
        enterDocumentNumber(documentNumber);
    }

    @When("Enter First Name {string}")
    public void enterFirstName(String firstName) {
        enterFirstName(firstName);
    }

    @And("Enter Last Name {string}")
    public void enterLastName(String lastName) {
        enterLastName(lastName);
    }

    @And("Enter Employee ID {string}")
    public void enterEmployeeID(String employeeID) {
        enterEmployeeID(employeeID);
    }

    @And("Enter name {string}")
    public void enterName(String name) {
        enterName(name);
    }*/
}
