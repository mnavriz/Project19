package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewExam extends Base {

    public NewExam() { PageFactory.initElements(driver, this); }

    @FindBy(css = "[placeholder=\"GENERAL.FIELD.NAME\"]")
    private WebElement Name;

    @FindBy(xpath = "//label/span[text()='Academic Period']")
    private WebElement AcademicPeriod;

    @FindBy(xpath = "//span[text()=' 2019-2020 ']")
    private WebElement AcademicPeriod20192020;


    @FindBy(xpath = "//label/span[text()='Grade Level']")
    private WebElement GradeLevel;

    @FindBy(xpath = "//span[text()=' BasqarTeam ']")
    private WebElement GradeLevelBasqarTeam;


    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(id = "toast-container")
    private WebElement Message;




    public void fillName(String name){sendKeysToElement(Name,name);}

    public void clickOnAcademicPeriod(){clickOnElement(AcademicPeriod);}

    public void chooseAcademicPeriod20192020(){clickOnElement(AcademicPeriod20192020);}

    public void clickOnGradeLevel(){clickOnElement(GradeLevel);}

    public void chooseGradeLevelBasqarTeam(){clickOnElement(GradeLevelBasqarTeam);}

    public void clickOnSaveButton(){
        clickOnElement(SaveButton);
    }

    public void verifyCreatingExam(){
        Assert.assertEquals("Exam successfully created",Message.getText());
    }


}
