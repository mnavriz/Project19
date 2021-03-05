package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import javax.lang.model.element.Name;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class CommonSteps extends Base {

    LoginPage loginPage = new LoginPage();
    LeftMenu leftMenu = new LeftMenu();
    Employees employees = new Employees();
    Employee employee = new Employee();
    Exam exam = new Exam();

    @And("User sends key in {string}")
    public void userSendsKeyIn(String page, DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists(String.class);


        for (int i = 0; i < lists.size(); i++) {

            switch (page) {
                case "loginPage":
                    loginPage.sendKeyFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
                case "employees":
                    employees.sendKeyFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
                case "employee":
                    employee.sendKeyFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
                case "exam":
                    exam.sendKeyFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
            }


        }

    }

    @And("User clicks in {string}")
    public void userClicksIn(String page, DataTable dataTable) {
        List<String> list = dataTable.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            switch (page) {
                case "loginPage":
                    loginPage.clickFunction(list.get(i));
                    break;
                case "leftMenu":
                    leftMenu.clickFunction(list.get(i));
                    break;
                case "employees":
                    employees.clickFunction(list.get(i));
                    break;
                case "employee":
                    employee.clickFunction(list.get(i));
                    break;
                case "exam":
                    exam.clickFunction(list.get(i));
                    break;
            }

        }

    }

    @And("User waits {string} seconds")
    public void userWaitsSeconds(String seconds) {
        int time = Integer.parseInt(seconds);
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @And("User selects randomly from list of WebElements in {string}")
    public void userSelectsRandomlyFromListOfWebElementsIn(String page, DataTable dataTable) {
        List<String> list = dataTable.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            switch (page) {
                case "employee":
                    employee.selectRandomFromList(list.get(i));
                    break;
                case "exam":
                    exam.selectRandomFromList(list.get(i));
                    break;
            }
        }

    }

    @And("Verify in {string}")
    public void verifyIn(String page, DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists(String.class);


        for (int i = 0; i < lists.size(); i++) {

            switch (page) {
                case "employee":
                    employee.verifyTextFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
                case "exam":
                    exam.verifyTextFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
            }


        }
    }

    @And("User click on ENTER key")
    public void userClickOnENTERKey() throws AWTException {
        Robot robot = new Robot();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ENTER);

    }


    @And("User hoverover and send keys in {string}")
    public void userHoveroverAndSendKeysIn(String page, DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists(String.class);

        for (int i = 0; i < lists.size(); i++) {

            switch (page) {
                case "exam":
                    exam.MoveToElementAndSendKeyFunction(lists.get(i).get(0), lists.get(i).get(1));
                    break;
            }
        }
    }

    @And("User handles table in {string}")
    public void userHandlesTableIn(String page, DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists(String.class);

        for (int i = 0; i < lists.size(); i++) {

            switch (page) {
                case "exam":
                    exam.EditOrDeleteFunction(lists.get(i).get(0), lists.get(i).get(1),
                            lists.get(i).get(2), lists.get(i).get(3));
                    break;
                case "employee":
                    employee.EditOrDeleteFunction(lists.get(i).get(0), lists.get(i).get(1),
                            lists.get(i).get(2));
                    break;
            }
        }

    }

    @And("User selects Max Value from dropdown in {string}")
    public void userSelectsMaxValueFromDropdownIn(String page, DataTable dataTable) {

        List<String> list = dataTable.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            switch (page) {

                case "employee":
                    employee.selectMaxValueFromDropDownFunction(list.get(i));
                    break;

            }
        }
    }
}
