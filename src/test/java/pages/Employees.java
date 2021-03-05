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

    @FindBy(xpath = "//button/span[text()=' Search ']")
    private WebElement SearchButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement confirmYesButton;

    @FindBy(id = "toast-container")
    private WebElement Message;

    WebElement Webelement;

    public void clickFunction(String element) {
        switch (element) {
            case "addEmployeeButton":
                Webelement = addEmployeeButton;
                break;
            case "StatusActiveToClick":
                Webelement = StatusActiveToClick;
                break;
            case "StatusAllToClick":
                Webelement = StatusAllToClick;
                break;

            case "EditEmployeeButton":
                Webelement = EditEmployeeButton;
                break;

            case "DeleteEmployeeButton":
                Webelement = DeleteEmployeeButton;
                break;

            case "confirmYesButton":
                Webelement = confirmYesButton;
                break;

            case "SearchButton":
                Webelement = SearchButton;
                break;


        }
        clickOnElement(Webelement);

    }
    public void sendKeyFunction(String element, String text){
            switch (element){
                case "FirstNameSearch":
                    Webelement = FirstNameSearch;
                    break;
            }
            sendKeysToElement(Webelement, text);

        }
}
