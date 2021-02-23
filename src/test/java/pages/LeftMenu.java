package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenu extends Base {

    public LeftMenu() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResourcesMenu;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement Employee;

    public void clickOnHumanResourcesMenu(){
        clickOnElement(HumanResourcesMenu);
    }
    public void clickOnEmployee(){
        clickOnElement(Employee);
    }

}
