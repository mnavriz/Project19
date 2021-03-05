package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Exam extends Base{
    List<WebElement> webElementList;
    public WebElement Webelement;
    List<WebElement> TargetWebelementList;
    public Exam() { PageFactory.initElements(driver, this);}

    @FindBy(css = "[placeholder=\"GENERAL.FIELD.NAME\"] input")
    private WebElement Name;

    @FindBy(css = "[formgroupname=\"academicPeriod\"]")
    private WebElement AcademicPeriod;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    private List<WebElement> DropDownOptions;


    @FindBy(css = "[formgroupname=\"gradeLevel\"]")
    private WebElement GradeLevel;

    @FindBy(css = "ms-browse-search>div>mat-form-field>div>div>div>input")
    private WebElement FirstNameSearch;

    @FindBy(css = "//div/table/tbody/tr[1]/td[8]/div[1]/ms-edit-button")
    private WebElement EditEmployeeButton;

        @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(id = "toast-container")
    private WebElement Message;

    @FindBy(xpath = "//ms-add-button")
    private WebElement addExamButton;

    @FindBy(xpath = "//button/span[text()=' Search ']")
    private WebElement SearchButton;

    @FindBy(xpath = "//table/tbody/tr/td[8]/div/ms-edit-button")
    private List<WebElement> editButtonList;

    @FindBy(xpath = "//table/tbody/tr/td[8]/div/ms-delete-button\n")
    private List<WebElement> deleteButtonList;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> ExamNameList;






    public void clickFunction(String element) {
        switch (element) {
            case "AcademicPeriod":
                Webelement = AcademicPeriod;
                break;
            case "GradeLevel":
                Webelement = GradeLevel;
                break;
            case "SaveButton":
                Webelement = SaveButton;
                break;
            case "addExamButton":
                Webelement = addExamButton;
                break;
            case "SearchButton":
                Webelement = SearchButton;
                break;
            case "EditEmployeeButton":
                Webelement = EditEmployeeButton;
                break;
        }
        clickOnElement(Webelement);
    }
    public void sendKeyFunction(String element, String text) {
        switch (element) {
            case "Name":
                Webelement = Name;
                break;
            case "FirstNameSearch":
                Webelement = FirstNameSearch;
                break;


        }

    }



    public void selectRandomFromList(String listOFWebElement){
        switch (listOFWebElement) {
            case "DropDownOptions":
                webElementList = DropDownOptions;
                break;

        }
        selectRandomFromListOfWebElement(webElementList);
    }

    public void verifyTextFunction(String element, String text){
        switch (element) {
            case "Message":
                Webelement = Message;
                break;
        }
        verifyText(Webelement,text);
    }

    public void MoveToElementAndSendKeyFunction(String element, String text){

        switch (element) {
            case "Name":
                Webelement = Name;
                break;
        }
                HoveroveTheElementAndSendKeys(Webelement, text);
    }

    public void EditOrDeleteFunction(String KeyList, String TargetList, String SearchInput, String EditOrDelete){

        switch (EditOrDelete) {
            case "Edit":
                TargetWebelementList = editButtonList;
                break;
            case "Delete":
                TargetWebelementList = deleteButtonList;
                break;
        }
        switch (KeyList) {
            case "ExamNameList":
                webElementList = ExamNameList;
                break;
        }

        handleTable(webElementList,TargetWebelementList,SearchInput);

    }

}

