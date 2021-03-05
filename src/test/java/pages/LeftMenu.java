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
    private WebElement Employees;

    @FindBy(xpath = "//span[text()='Entrance Exams']")
    private WebElement EntranceExams;

    @FindBy(css = "a[href='/exam/list']")

    private WebElement EntranceExamsSub;

    @FindBy(css = "fuse-nav-vertical-collapsable.ng-tns-c103-16.nav-collapsable.nav-item.ng-star-inserted.open > div > fuse-nav-vertical-collapsable > a")
    private WebElement SetupSubMenu;

    WebElement Webelement;
    public void clickFunction(String element){
        switch (element){
            case "HumanResourcesMenu":
                Webelement = HumanResourcesMenu;
                break;
            case "Employees":
                Webelement = Employees;
                break;
            case "EntranceExams":
                Webelement = EntranceExams;
                break;

            case "EntranceExamsSub":
                Webelement = EntranceExamsSub;
                break;

            case "SetupSubMenu":
                Webelement = SetupSubMenu;
                break;


        }
        clickOnElement(Webelement);

    }
}
