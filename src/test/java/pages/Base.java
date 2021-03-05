package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class Base {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,10);


    protected void clickOnElement(WebElement element) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void sendKeysToElement(WebElement element, String key) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(key);
    }

    protected String getTextOfElement(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    protected void selectRandomFromListOfWebElement(List<WebElement> list){
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        Random random = new Random();

        int randomIndex = random.nextInt(list.size());

       list.get(randomIndex).click();
    }
    protected void selectMaxValueFromListOfWebElement(List<WebElement> list){
        wait.until(ExpectedConditions.visibilityOfAllElements(list));

        list.get(list.size()-1).click();
    }



    protected void verifyText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        String actualText = element.getText();
        Assert.assertEquals(actualText,text);
    }
    protected void HoveroveTheElementAndSendKeys(WebElement element, String text) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click()
                .sendKeys(text).build().perform();

    }
     protected void handleTable(List<WebElement> KeyList, List<WebElement> TargetList, String SearchInput){

         for (int i = 0; i < KeyList.size(); i++) {

             if (KeyList.get(i).getText().contains(SearchInput) ){
                 System.out.println(KeyList.get(i).getText());
                 System.out.println(TargetList.get(i).getText());
                 clickOnElement(TargetList.get(i));

             }
         }


     }
}
