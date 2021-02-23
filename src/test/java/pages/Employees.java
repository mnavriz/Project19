package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employees extends Base {
    public Employees() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ms-add-button")
    private WebElement addEmployeeButton;

    public void clickOnAddEmployeeButton(){
        clickOnElement(addEmployeeButton);
    }
}
