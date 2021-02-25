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

    @FindBy(xpath = "//span[text()='Entrance Exams']")
    private WebElement EntranceExams;

    @FindBy(css = "a[href='/exam/list']")
    private WebElement EntranceExamsSub;

    @FindBy(css = "fuse-nav-vertical-collapsable.ng-tns-c103-16.nav-collapsable.nav-item.ng-star-inserted.open > div > fuse-nav-vertical-collapsable > a")
    private WebElement SetupSubMenu;

    public void clickOnHumanResourcesMenu(){
        clickOnElement(HumanResourcesMenu);
    }

    public void clickOnEmployee(){
        clickOnElement(Employee);
    }

    public void clickOnEntranceExams(){clickOnElement(EntranceExams);}

    public void clickOnEntranceExamsSub(){clickOnElement(EntranceExamsSub);}

}
