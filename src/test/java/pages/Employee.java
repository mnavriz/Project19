package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Employee extends Base {

    @FindBy(css = "[formcontrolname='firstName']>input")
    private WebElement FirstName;

    @FindBy(css = "[formcontrolname='lastName']>input")
    private WebElement LastName;

    @FindBy(css = "[data-placeholder='Employee ID']")
    private WebElement EmployeeID;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(id = "toast-container")
    private WebElement Message;

    public void fillFirstName(String firstName){sendKeysToElement(FirstName,firstName);}

    public void fillLastName(String lastName){sendKeysToElement(LastName, lastName);}

    public void fillEmployeeID(String employeeID){sendKeysToElement(EmployeeID, employeeID);}

    //public void clickOnSaveButton(){
       // clickOnElement(SaveButton);
  //  }

    public void verifyUpdatingEmployee(String status){
        Assert.assertEquals(status,Message.getText());
    }
}
