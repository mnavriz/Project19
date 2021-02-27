package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class EmployeeSteps extends Base {
    LeftMenu leftMenu = new LeftMenu();
    Employees employees = new Employees();
    Employee employee = new Employee();
    NewEmployee newEmployee = new NewEmployee();


    @Given("Click on Human Resources")
    public void clickOnHumanResources() {
        leftMenu.clickOnHumanResourcesMenu();
    }

    @And("Click on Employees")
    public void clickOnEmployees() {leftMenu.clickOnEmployees();}

    @And("Click ond Add Employee Button")
    public void clickOndAddEmployeeButton() { employees.clickOnAddEmployeeButton();}

    @When("Enter First Name {string}Last Name {string} and Employee ID {string}")
    public void enterFirstNameLastNameAndEmployeeID(String firstName, String lastName, String employeeId) {
        newEmployee.fillFirstName(firstName);
        newEmployee.fillLastName(lastName);
        newEmployee.fillEmployeeID(employeeId);
    }

    @And("Choose Document Type")
    public void chooseDocumentType() {newEmployee.chooseDocumentType();}

    @And("Enter Document Number {string}")
    public void enterDocumentNumber(String documentNumber) {
        newEmployee.fillDocumentNumber(documentNumber);
    }

    @Then("Click on save button")
    public void clickOnSaveButton() {
        newEmployee.clickOnSaveButton();
    }

    @And("Verify <status>")
    public void verifyStatus() {newEmployee.verifyCreatingEmployee();}

    @And("Enter name {string}")
    public void enterName(String firstName) {
        employees.searchFirstName(firstName);
    }

    @And("Click on Status")
    public void clickOnStatus() { employees.statusClicks();}

    @And("Click on edit button")
    public void clickOnUpdateButton() {employees.clickOnEmployeeEditButton();}

    @Then("Update First Name {string} Last Name {string} Employee ID {string}")
    public void updateFirstNameLastNameEmployeeID(String firstName, String lastName, String employeeId) {
        employee.fillFirstName(firstName);
        employee.fillLastName(lastName);
        employee.fillEmployeeID(employeeId);
    }

    @And("Verify {string}")
    public void verify(String status) {
        employee.verifyUpdatingEmployee(status);
    }

    @Then("Click on delete button and Confirm")
    public void clickOnDeleteButton() {
        employees.clickOnDeleteEmployee();
        employees.clickOnYesToConfirm();
    }
}
