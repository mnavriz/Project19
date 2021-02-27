package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Employees extends Base {
    public Employees() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ms-add-button")
    private WebElement addEmployeeButton;

    @FindBy(css = "[placeholder='GENERAL.FIELD.FIRST_NAME']>input")
    private WebElement FirstNameSearch;

    @FindBy(xpath = "//span[text()='Active']")
    private WebElement StatusActiveToClick;

    @FindBy(xpath = "//span[text()='All']")
    private WebElement StatusAllToClick;

    @FindBy(css = "tbody>tr>td:nth-child(7)>div:nth-child(1)>ms-edit-button>button")
    private WebElement EditEmployeeButton;

    @FindBy(css = "ms-delete-button")
    private WebElement DeleteEmployeeButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement confirmYesButton;

    @FindBy(id = "toast-container")
    private WebElement Message;

    public void clickOnAddEmployeeButton(){
        clickOnElement(addEmployeeButton);
    }

    public void searchFirstName(String firstName){
        sendKeysToElement(FirstNameSearch,firstName);
    }

    public void statusClicks(){
        clickOnElement(StatusActiveToClick);
        clickOnElement(StatusAllToClick);
    }

    public void clickOnEmployeeEditButton(){
        clickOnElement(EditEmployeeButton);
    }

    public void clickOnDeleteEmployee(){clickOnElement(DeleteEmployeeButton);}

    public void clickOnYesToConfirm(){clickOnElement(confirmYesButton);}

   // public void verifyDeletingEmployee(){
    //    Assert.assertEquals("Employee successfully deleted",Message.getText());
    //}
}
