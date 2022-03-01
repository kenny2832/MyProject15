package tests;
import pages.TopManuBar;
import pages.SchoolDepartmentsPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class Project15Tests {

    TopManuBar topManuBar = new TopManuBar();
    SchoolDepartmentsPage schoolDepartmentsPage = new SchoolDepartmentsPage();

    @Test(groups = "project15")
    public void navigateToDepartment(){
        topManuBar.clickHamburgerButton();
        topManuBar.clickSetupButtonInMenu();
        topManuBar.clickSchoolSetupButtonInMenu();
        topManuBar.clickDepartmentButtonInMenu();
    }

    @Test(dependsOnMethods = "navigateToDepartment", groups = "project15")
    public void createSchoolDepartment(){
        schoolDepartmentsPage.clickPlusSignButton();
        schoolDepartmentsPage.inputNameOfSchoolDepartment("High School-007");
        schoolDepartmentsPage.inputCodeOfSchoolDepartment("HS-007");
        schoolDepartmentsPage.clickSelectTabOfSection();
        schoolDepartmentsPage.clickPlusIconInSection();
        schoolDepartmentsPage.inputNameOfSection("Junior classes");
        schoolDepartmentsPage.inputShortNameOfSection("Junior");
        schoolDepartmentsPage.clickAddButtonInSectionTab();
        schoolDepartmentsPage.inputNameOfSection("Senior Classes");
        schoolDepartmentsPage.inputShortNameOfSection("Senior");
        schoolDepartmentsPage.clickAddButtonInSectionTab();
        schoolDepartmentsPage.clickSaveButton();
    }

    @Test(dependsOnMethods = "createSchoolDepartment", groups = "project15")
    public void VerifyCreatedSchool(){
        String actualCreateSchool = schoolDepartmentsPage.getTextOfNameOfSchoolDepartment();
        String expectedCreateSchool = "High School-007";
        Assert.assertEquals(actualCreateSchool, expectedCreateSchool, "Verifying School Success!");
        schoolDepartmentsPage.clickPenToSquareItemForHighSchool();
        schoolDepartmentsPage.clickSelectTabOfSection();
        String actualCreateJuniorClasses = schoolDepartmentsPage.getTextOfNameForJuniorClasses();
        String expectedCreateJuniorClasses = "Junior classes";
        Assert.assertEquals(actualCreateJuniorClasses,expectedCreateJuniorClasses,"Verifying Junior Class success!");
        String actualCreateSeniorClasses = schoolDepartmentsPage.getTextOfNameForSeniorClasses();
        String expectedCreateSeniorClasses = "Senior Classes";
        Assert.assertEquals(actualCreateSeniorClasses,expectedCreateSeniorClasses,"Verifying Senior Class success!");
        schoolDepartmentsPage.clickDismissButtonForPopupWindow();
    }

    @Test(dependsOnMethods = "VerifyCreatedSchool", groups = "project15")
    public void createSchoolDepartmentAgain(){
        schoolDepartmentsPage.clickPlusSignButton();
        schoolDepartmentsPage.inputNameOfSchoolDepartment("High School-007");
        schoolDepartmentsPage.inputCodeOfSchoolDepartment("HS-007");
        schoolDepartmentsPage.clickSaveButton();
        String actualExistSchoolMessage = schoolDepartmentsPage.getTextOfExistedDepartmentMessage();
        String expectedExistSchoolMessage = "There is already Department with \"High School-007\" name!";
        Assert.assertEquals(actualExistSchoolMessage,expectedExistSchoolMessage,"Verifying ExistSchool Message.");
        schoolDepartmentsPage.clickDismissButtonForPopupWindow();
    }

    @Test(dependsOnMethods = "createSchoolDepartmentAgain", groups = "project15")
    public void createSameSchoolDifferentCode(){
        schoolDepartmentsPage.clickPlusSignButton();
        schoolDepartmentsPage.inputNameOfSchoolDepartment("High School-007");
        schoolDepartmentsPage.inputCodeOfSchoolDepartment("HSC-007");
        schoolDepartmentsPage.clickExitMessage();
        schoolDepartmentsPage.clickSaveButton();
        String actualExistSchoolMessage2 = schoolDepartmentsPage.getTextOfExistedDepartmentMessage();
        String expectedExistSchoolMessage2 = "There is already Department with \"High School-007\" name!";
        Assert.assertEquals(actualExistSchoolMessage2,expectedExistSchoolMessage2,"Verifying ExistSchool Message.");
        schoolDepartmentsPage.clickDismissButtonForPopupWindow();
    }

    @Test(dependsOnMethods = "createSameSchoolDifferentCode", groups = "project15")
    public void createDifferentSchoolSameCode(){
        schoolDepartmentsPage.clickPlusSignButton();
        schoolDepartmentsPage.inputNameOfSchoolDepartment("High School Class-007");
        schoolDepartmentsPage.inputCodeOfSchoolDepartment("HS-007");
        schoolDepartmentsPage.clickExitMessage();
        schoolDepartmentsPage.clickSaveButton();
        String actualExistSchoolMessage3 = schoolDepartmentsPage.getTextOfExistedDepartmentMessage();
        String expectedExistSchoolMessage3 = "There is already Department with \"HS-007\" code!";
        Assert.assertEquals(actualExistSchoolMessage3,expectedExistSchoolMessage3,"Verifying ExistSchool Message.");
        schoolDepartmentsPage.clickDismissButtonForPopupWindow();
    }

    @Test(dependsOnMethods = "createDifferentSchoolSameCode", groups = "project15")
    public void editSchoolAndCode(){
        schoolDepartmentsPage.clickPenToSquareItemForHighSchool();
        schoolDepartmentsPage.inputNameOfSchoolDepartment("High School Class-007");
        schoolDepartmentsPage.inputCodeOfSchoolDepartment("HSC-007");
        schoolDepartmentsPage.clickExitMessage();
        schoolDepartmentsPage.clickSaveButton();
        String actualAfterEditSchool = schoolDepartmentsPage.getTextOfNameOfSchoolDepartmentAfterEdit();
        String expectedAfterEditSchool = "High School Class-007";
        Assert.assertEquals(actualAfterEditSchool,expectedAfterEditSchool,"Verifying After Edit School!");
        String actualAfterEditCode = schoolDepartmentsPage.getTextOfCodeOfSchoolDepartmentAfterEdit();
        String expectedAfterEditCode = "HSC-007";
        Assert.assertEquals(actualAfterEditCode,expectedAfterEditCode,"Verifying After Edit Code!");
    }

    @Test(dependsOnMethods = "editSchoolAndCode", groups = "project15")
    public void addThreeMoreSectionInHighSchoolClass(){
        schoolDepartmentsPage.clickPenToSquareItemForHighSchoolClass();
        schoolDepartmentsPage.clickSelectTabOfSection();
        schoolDepartmentsPage.clickPlusIconInSection();
        schoolDepartmentsPage.inputNameOfSection("High level");
        schoolDepartmentsPage.inputShortNameOfSection("High");
        schoolDepartmentsPage.clickAddButtonInSectionTab();
        schoolDepartmentsPage.inputNameOfSection("Medium level");
        schoolDepartmentsPage.inputShortNameOfSection("Medium");
        schoolDepartmentsPage.clickAddButtonInSectionTab();
        schoolDepartmentsPage.inputNameOfSection("Low level");
        schoolDepartmentsPage.inputShortNameOfSection("Low");
        schoolDepartmentsPage.clickAddButtonInSectionTab();
        schoolDepartmentsPage.clickSaveButton();
    }

    @Test(dependsOnMethods = "addThreeMoreSectionInHighSchoolClass", groups = "project15")
    public void deleteHighSchoolClassDepartment(){
        schoolDepartmentsPage.clickSearchButton();
        schoolDepartmentsPage.clickTrashCanItemForHighSchoolClasses();
        schoolDepartmentsPage.clickSubmitDeleteButton();
        schoolDepartmentsPage.clickTrashCanItemForHighSchoolClasses();
        schoolDepartmentsPage.clickSubmitDeleteButton();
//        Assert.assertTrue(schoolDepartmentsPage.getTextOfNameOfSchoolDepartmentAfterEdit().equals(null),
//                "Verifying delete High School Class Department successfully!");
    }

}
