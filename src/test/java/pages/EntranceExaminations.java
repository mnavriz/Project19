package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EntranceExaminations extends Base {

    @FindBy(css = "ms-add-button")
    private WebElement addExamButton;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement NameSearchField;

    @FindBy(css = "//span[text()=' Search ']")
    private WebElement SearchButton;

    @FindBy(name = "ms-edit-button")
    private WebElement EditButton;

    @FindBy(css = "ms-delete-button")
    private WebElement DeleteEmployeeButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement confirmYesButton;

    @FindBy(id = "toast-container")
    private WebElement Message;

    WebElement Webelement;

    public void clickFunction(String element) {
        switch (element) {
            case "addExamButton":
                Webelement = addExamButton;
                break;
            case "NameSearchField":
                Webelement = NameSearchField;
                break;
            case "SearchButton":
                Webelement = SearchButton;
                break;

            case "EditButton":
                Webelement = EditButton;
                break;

            case "DeleteEmployeeButton":
                Webelement = DeleteEmployeeButton;
                break;

            case "confirmYesButton":
                Webelement = confirmYesButton;
                break;


        }
        clickOnElement(Webelement);

    }
}

