package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class NewEmployee extends Base {
    public NewEmployee() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[formcontrolname='firstName']>input")
    private WebElement FirstName;

    @FindBy(css = "[formcontrolname='lastName']>input")
    private WebElement LastName;

    @FindBy(css = "[data-placeholder='Employee ID']")
    private WebElement EmployeeID;

    @FindBy(css = "//span[text()='Document Type']")
    private WebElement DocumentNumber;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private WebElement ListDocumentType;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(id = "toast-container")
    private WebElement Message;




    public void fillFirstName(String firstName){sendKeysToElement(FirstName,firstName);}

    public void fillLastName(String lastName){sendKeysToElement(LastName, lastName);}

    public void fillEmployeeID(String employeeID){sendKeysToElement(EmployeeID, employeeID);}

    public void fillDocumentNumber(String documentNumber){

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", DocumentNumber);


        sendKeysToElement(DocumentNumber,documentNumber);}

    public void chooseDocumentType(){
        clickOnElement(DocumentNumber);

        List<WebElement> document = driver.findElements(By.xpath("//span[@class='mat-option-text']"));

        for (WebElement element : document) {
            if (element.getText().equals("Personal ID")) {
                element.click();
            }

        }
    }

    public void clickOnSaveButton(){
        clickOnElement(SaveButton);
    }

    public void verifyCreatingEmployee(){
        Assert.assertEquals("Employee successfully created",Message.getText());
    }


}