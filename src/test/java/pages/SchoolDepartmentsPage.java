package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchoolDepartmentsPage extends BasePage {

    public SchoolDepartmentsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "((//div[@fxlayoutalign='end center'])[3]//button)[1]")
    private WebElement plusSignButton;

    @FindBy(css = "div[class='mat-tab-labels']>div:nth-child(1)")
    private WebElement selectTabOfSchoolDepartmentInNewSchoolDepartment;

    @FindBy(css = "div[class='mat-tab-labels']>div:nth-child(2)")
    private WebElement selectTabOfSectionInNewSchoolDepartment;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'COST')]")
    private WebElement plusIconInSection;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement textBoxForNameOfSchoolDepartment;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement textBoxForCodeOfSchoolDepartment;

    @FindBy(xpath = "(//school-department-section//div//div//mat-form-field//div//div//div//ms-text-field//input)[1]")
    private WebElement textBoxForNameOfSection;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    private WebElement testBoxForShorNameOfSection;

    @FindBy(css = "div[fxflexalign='center']>ms-button")
    private WebElement addButtonInSectionTab;

    @FindBy(tagName = "ms-save-button")
    private WebElement saveButtonOfNewSchoolDepartment;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement existedMessage;

    @FindBy(xpath = "//td[text()='High School Class-007']//following-sibling::td[3]//descendant::ms-delete-button")
    private WebElement trashCanItemForHighSchoolClasses;

    @FindBy(xpath = "//td[text()='High School-007']")
    private WebElement penToSquareItemForHighSchool;

    @FindBy(xpath = "//td[text()='High School Class-007']")
    private WebElement penToSquareItemForHighSchoolClasses;

    @FindBy(xpath = "//td[text()='High School-007']")
    private WebElement textFieldOfNameForHighSchool;

    @FindBy(xpath = "//td[text()='High School Class-007']")
    private WebElement textFieldOfNameForHighSchoolClassAfterEdit;

    @FindBy(xpath = "//td[text()=' HS-007 ']")
    private WebElement textFieldOfCodeForHighSchool;

    @FindBy(xpath = "//td[text()=' HSC-007 ']")
    private WebElement textFieldOfCodeForHighSchoolAfterEdit;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[2])[1]")
    private WebElement textFieldOfNameForJuniorClasses;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[2])[2]")
    private WebElement textFieldOfNameForSeniorClasses;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[3])[1]")
    private WebElement textFieldOfShortNameForJunior;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[3])[2]")
    private WebElement textFieldOfShortNameForSenior;

    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base'])[3]")
    private WebElement dismissButtonForPopupWindow;

    @FindBy(css = "button[type='submit']")
    private WebElement submitDeleteButton;

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement exitMessage;

    @FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    private WebElement searchButton;

    public void clickPlusSignButton(){
        clickOnElement(plusSignButton);
    }
    public void clickSelectTabOfSchoolDepartment(){
        clickOnElement(selectTabOfSchoolDepartmentInNewSchoolDepartment);
    }
    public void clickSelectTabOfSection(){
        clickOnElement(selectTabOfSectionInNewSchoolDepartment);
    }
    public void clickPlusIconInSection(){
        clickOnElement(plusIconInSection);
    }
    public void inputNameOfSchoolDepartment(String string){
        sendKeysToElement(textBoxForNameOfSchoolDepartment,string);
    }
    public String getTextOfNameOfSchoolDepartment(){
        return getTextOfElement(textFieldOfNameForHighSchool);
    }
    public String getTextOfNameOfSchoolDepartmentAfterEdit(){
        return getTextOfElement(textFieldOfNameForHighSchoolClassAfterEdit);
    }
    public String getTextOfCodeOfSchoolDepartmentAfterEdit(){
        return getTextOfElement(textFieldOfCodeForHighSchoolAfterEdit);
    }
    public void inputCodeOfSchoolDepartment(String string){
        sendKeysToElement(textBoxForCodeOfSchoolDepartment,string);
    }
    public String getTextOfCodeOfSchoolDepartment(){
        return getTextOfElement(textFieldOfCodeForHighSchool);
    }
    public void inputNameOfSection(String string){
        sendKeysToElement(textBoxForNameOfSection,string);
    }
    public void inputShortNameOfSection(String string){
        sendKeysToElement(testBoxForShorNameOfSection,string);
    }
    public void clickAddButtonInSectionTab(){
        clickOnElement(addButtonInSectionTab);
    }
    public void clickSaveButton(){
        clickOnElement(saveButtonOfNewSchoolDepartment);
    }
    public String getTextOfSuccessMessage(){
        return getTextOfElement(successMessage);
    }
    public String getTextOfExistedDepartmentMessage(){
        return getTextOfElement(existedMessage);
    }
    public void clickTrashCanItemForHighSchoolClasses(){
        clickOnElement(trashCanItemForHighSchoolClasses);
    }
    public void clickPenToSquareItemForHighSchool(){
        clickOnElement(penToSquareItemForHighSchool);
    }
    public void clickPenToSquareItemForHighSchoolClass(){
        clickOnElement(penToSquareItemForHighSchoolClasses);
    }
    public String getTextOfNameForJuniorClasses(){
        return getTextOfElement(textFieldOfNameForJuniorClasses);
    }
    public String getTextOfNameForSeniorClasses(){
        return getTextOfElement(textFieldOfNameForSeniorClasses);
    }
    public String getTextOfShortNameForJunior(){
        return getTextOfElement(textFieldOfShortNameForJunior);
    }
    public String getTextOfShortNameForSenior(){
        return getTextOfElement(textFieldOfShortNameForSenior);
    }
    public void clickDismissButtonForPopupWindow(){
        clickOnElement(dismissButtonForPopupWindow);
    }
    public void clickSubmitDeleteButton(){
        clickOnElement(submitDeleteButton);
    }
    public void clickExitMessage(){
        clickOnElement(exitMessage);
    }
    public void clickSearchButton(){
        clickOnElement(searchButton);
    }

}
