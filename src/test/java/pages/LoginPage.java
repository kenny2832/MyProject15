package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement usernameTextBox;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordTextBox;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookiesButton;

    public void inputUsername(String string){
        sendKeysToElement(usernameTextBox, string);
    }
    public void inputPassword(String string){
        sendKeysToElement(passwordTextBox, string);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickAcceptCookiesButton(){
        clickOnElement(acceptCookiesButton);
//        try{
//            clickOnElement(acceptCookiesButton);
//        }catch (TimeoutException ex){
//
//        }

    }


}
