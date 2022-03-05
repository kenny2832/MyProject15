package tests;

import pages.LoginPage;
import utilities.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.ReadFromConfigFile;

public class Hook {

    LoginPage loginPage = new LoginPage();

    @BeforeTest(groups = "project15")
    public void navigateToLoginPage(){
        loginPage.navigateTo(ReadFromConfigFile.getValueFor("homepage"));
        loginPage.clickAcceptCookiesButton();
        loginPage.maximizeWindow();
    }

    @BeforeTest(dependsOnMethods = "navigateToLoginPage", groups = "project15")
    public void login(){
        loginPage.inputUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.inputPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickLoginButton();
    }

    @AfterTest(groups = "project15")
    public void tearDown(){
        Driver.quitDriver();
    }

}
