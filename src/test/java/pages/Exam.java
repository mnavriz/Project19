package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Exam extends Base{
    public Exam() { PageFactory.initElements(driver, this);}

    @FindBy(css = "[placeholder=\"GENERAL.FIELD.NAME\"]")
    private WebElement Name;

    @FindBy(xpath = "//label/span[text()='Academic Period']")
    private WebElement AcademicPeriod;

    @FindBy(xpath = "//span[text()=' 2018-2019 ']")
    private WebElement AcademicPeriod201820219;

    @FindBy(xpath = "//label/span[text()='Grade Level']")
    private WebElement GradeLevel;


    @FindBy(xpath = "//span[text()=' Techno1 ']")
    private WebElement GradeLevelTechno1;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(id = "toast-container")
    private WebElement Message;




    public void fillName(String name){sendKeysToElement(Name,name);}

    public void clickOnAcademicPeriod(){clickOnElement(AcademicPeriod);}

    public void chooseAcademicPeriod201820219(){clickOnElement(AcademicPeriod201820219);}

    public void clickOnGradeLevel(){clickOnElement(GradeLevel);}

    public void chooseGradeLevelTechno1(){clickOnElement(GradeLevelTechno1);}

    public void clickOnSaveButton(){
        clickOnElement(SaveButton);
    }

    public void verifyCreatingExam(){
        Assert.assertEquals("Exam successfully updated",Message.getText());
    }

}
