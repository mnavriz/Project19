package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import java.util.List;

public class EmployeeSteps extends Base {

    Employee employee = new Employee();


    @And("Verify <status>")
    public void verifyStatus() {employee.verifyCreatingEmployee();}


}
