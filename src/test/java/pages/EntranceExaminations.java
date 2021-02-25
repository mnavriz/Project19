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

    public void clickOnaddExamButton(){clickOnElement(addExamButton);}

    public void searchExamName(String Name){sendKeysToElement(NameSearchField,Name);}

    public void clickOnSearchButton(){clickOnElement(SearchButton);}

    public void clickOnEditButton(){clickOnElement(EditButton);}

    public void clickOnDeleteEmployee(){clickOnElement(DeleteEmployeeButton);}

    public void clickOnYesToConfirm(){clickOnElement(confirmYesButton);}

    public void verifyDeletingExam(){
        Assert.assertEquals("Employee successfully deleted",Message.getText());
    }
}

