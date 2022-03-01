package Test;

import Page.Base;
import Page.LoginPage;
import Utilities.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hook {

    LoginPage loginPage = new LoginPage();

    @BeforeTest(groups = "project15")
    public void navigateToLoginPage(){
        loginPage.navigateTo(ProjectConstants.SIGN_IN_URL.getText());
        loginPage.clickAcceptCookiesButton();
        loginPage.maximizeWindow();
    }

    @BeforeTest(dependsOnMethods = "navigateToLoginPage", groups = "project15")
    public void login(){
        loginPage.clickAcceptCookiesButton();
        loginPage.inputUsername(ProjectConstants.SIGN_IN_USERNAME.getText());
        loginPage.inputPassword(ProjectConstants.SIGN_IN_PASSWORD.getText());
        loginPage.clickLoginButton();
    }

    @AfterTest(groups = "project15")
    public void tearDown(){
        Driver.quitDriver();
    }

}
