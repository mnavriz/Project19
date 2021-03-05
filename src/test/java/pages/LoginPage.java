package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Base{

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[data-placeholder=\"Username\"]")
    private WebElement usernameElement;

    @FindBy(css = "input[data-placeholder=\"Password\"]")
    private WebElement passwordElement;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;

    @FindBy(id = "toast-container")
    private WebElement alertDialogBox;

    @FindBy(xpath =("//a[text() = 'Got it!']"))
     public WebElement GotItButton;

WebElement Webelement;

    public void sendKeyFunction(String element, String text){
        switch (element){
            case "usernameElement":
                Webelement = usernameElement;
                break;
            case "passwordElement":
                Webelement = passwordElement;
                break;
        }
        sendKeysToElement(Webelement, text);

    }

    public void clickFunction(String element){
        switch (element){
            case "loginButton":
                Webelement = loginButton;
                break;
            case "GotItButton":
                Webelement = GotItButton;
                break;
                   }
        clickOnElement(Webelement);

    }
    public String getTextOfAlertDialogBox(){
        return getTextOfElement(alertDialogBox);


    }

}
