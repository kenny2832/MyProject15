package Page;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    protected WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    protected void clickOnElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void sendKeysToElement(WebElement element, String key){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
        element.clear();
        element.sendKeys(key);
    }

    protected String getTextOfElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void navigateTo(String url){
        driver.get(url);
    }

}
