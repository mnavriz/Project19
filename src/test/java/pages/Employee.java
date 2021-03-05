package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Employee extends Base {

    List<WebElement> webElementList;
    public WebElement Webelement;
    List<WebElement> TargetWebelementList;


    public Employee() {
        PageFactory.initElements(driver, this); }

    @FindBy(css = "[formcontrolname='firstName']>input")
    private WebElement FirstName;

    @FindBy(css = "[formcontrolname='lastName']>input")
    private WebElement LastName;

    @FindBy(css = "[data-placeholder='Employee ID']")
    private WebElement EmployeeID;

    @FindBy(css = "input[formcontrolname=\"documentNumber\"]")
    private WebElement DocumentNumber;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> ListDocumentType;

    @FindBy(css = "[formgroupname=\"documentInfo\"] .mat-select-arrow-wrapper")
    private WebElement DocumentType;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(id = "toast-container")
    private WebElement Message;

    @FindBy(xpath = "//table/tbody/tr/td[3]")
    private List<WebElement> namelist;

    @FindBy(xpath = "//table/tbody/tr/td[7]//ms-edit-button/button")
    private List<WebElement> editButtonList;

    @FindBy(xpath = "//table/tbody/tr/td[7]//ms-delete-button/button")
    private List<WebElement> deleteButtonList;

    @FindBy(css = "[aria-label=\"Items per Page\"]")
    private WebElement ItemPerPage;

    @FindBy(css = "[aria-label=\"Items per Page\"]>mat-option")
    private List<WebElement> ItemsPerPageOption;









    public void sendKeyFunction(String element, String text) {
        switch (element) {
            case "FirstName":
                Webelement = FirstName;
                break;
            case "LastName":
                Webelement = LastName;
                break;
            case "EmployeeID":
                Webelement = EmployeeID;
                break;
            case "DocumentNumber":
                Webelement = DocumentNumber;
                break;
        }
        sendKeysToElement(Webelement, text);

    }
        public void clickFunction(String element) {
            switch (element) {
                case "DocumentType":
                    Webelement = DocumentType;
                    break;
                case "SaveButton":
                    Webelement = SaveButton;
                    break;
                case "ItemPerPage":
                    Webelement = ItemPerPage;
                    break;
            }
            clickOnElement(Webelement);
        }

    public void verifyTextFunction(String element, String text){
        switch (element) {
            case "Message":
                Webelement = Message;
                break;
        }
        verifyText(Webelement,text);
    }





    public void selectRandomFromList(String listOFWebElement){
        switch (listOFWebElement) {
            case "ListDocumentType":
                webElementList = ListDocumentType;
                break;

        }
        selectRandomFromListOfWebElement(webElementList);
    }

    public void verifyCreatingEmployee(){
        Assert.assertEquals("Employee successfully created",Message.getText());
    }

    public void EditOrDeleteFunction(String KeyList, String SearchInput, String EditOrDelete){

        switch (EditOrDelete) {
            case "Edit":
                TargetWebelementList = editButtonList;
                break;
            case "Delete":
                TargetWebelementList = deleteButtonList;
                break;
        }
        switch (KeyList) {
            case "namelist":
                webElementList = namelist;
                break;
        }

        handleTable(webElementList,TargetWebelementList,SearchInput);

    }

    public void selectMaxValueFromDropDownFunction(String elementList){

        switch (elementList) {
            case "ItemsPerPageOption":
                webElementList = ItemsPerPageOption;
                break;
        }

        selectMaxValueFromListOfWebElement(webElementList);

    }

}
