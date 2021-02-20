package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Base(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //    Click on element method
    protected void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    //    Send keys function
    protected void sendKeysFunction(WebElement element , String value){

        try{
            waitUntilVisible(element);
            scrollToElement(element);
            element.clear();
            element.sendKeys(value);
        }catch (IllegalArgumentException e){
            System.out.println("Element can not be empty");
        }


    }

    //    Waiting until element become visible
    protected void waitUntilVisible(WebElement elementToWait){

        wait.until(ExpectedConditions.visibilityOf(elementToWait));

    }

    // Scroll to Web Element method
    protected void scrollToElement(WebElement elementToScroll){
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("arguments[0].scrollIntoView();", elementToScroll);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);

    }


    //    WaitForClickable
    protected void waitUntilClickable(WebElement elmentToWait){

//        wait until clickable is working as if the element is not visible
        wait.until(ExpectedConditions.elementToBeClickable(elmentToWait));
    }

    // Assertion by using Web Element
    public void AssertionByWebElement(WebElement element, String expectedMessage) {

        String ActualMessage = "";

        try {
            waitUntilVisible(element);
            ActualMessage= element.getText();
        }catch (Exception e){
            ActualMessage = "Keys to send should be a not null";
        }

        System.out.println(ActualMessage + "-Actual Message");
        System.out.println(expectedMessage + "-Expected Message");
        Assert.assertTrue(ActualMessage.contains(expectedMessage));
    }

}
