package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopManuBar extends BasePage {

    public TopManuBar(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//span[@class='ng-star-inserted']//button)[1]")
    private WebElement hamburgerButton;

    @FindBy(xpath = "(//span[text()='Setup'])[1]/..")
    private WebElement setupButtonInMenu;

    @FindBy(xpath = "(//span[text()='School Setup'])[1]/..")
    private WebElement schoolSetupButtonInMenu;

    @FindBy(xpath = "(//span[text()='Departments'])[1]/..")
    private WebElement departmentsButtonInMenu;

    public void clickHamburgerButton(){
        clickOnElement(hamburgerButton);
    }
    public void clickSetupButtonInMenu(){
        clickOnElement(setupButtonInMenu);
    }
    public void clickSchoolSetupButtonInMenu(){
        clickOnElement(schoolSetupButtonInMenu);
    }
    public void clickDepartmentButtonInMenu(){
        clickOnElement(departmentsButtonInMenu);
    }
}
