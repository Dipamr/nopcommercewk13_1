package com.nopcommercewk13.testsuite;

import com.nopcommercewk13.pages.*;
import com.nopcommercewk13.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TeseData;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        registerPage.clickOnRegisterLink();
        registerPage.RegisterText();

    }

    @Test
    public void verifyThatFirstNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        registerPage.clickOnRegisterLink();
        registerPage.clickOnenterRegisterButton();
        registerPage.Firstnamerequired();
        registerPage.Lastnamerequired();
        registerPage.Emailrequired();
        registerPage.Passwordrequired();
        registerPage.Confirmpasswordrequired();
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputers();
        computerPage.clickOnDesktopsLink();
        desktopsPage.getDesktopsText();


    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        registerPage.clickOnRegisterLink();
        registerPage.clickOnfemaleradiobutton();
        registerPage.clickOnenterFirstnamebutton("cow");
        registerPage.clickOnenterLastnamebutton("got");
        registerPage.clickOnDateofBirthbutton("14");
        registerPage.clickOnMonthofbirthbutton("10");
        registerPage.clickOnYearofbirthbutton("1930");
        registerPage.clickOnenterEmailfield("cow@gmail.com");
        registerPage.clickOnenterPasswordfield("454545");
        registerPage.clickOnenterConfirmpasswordfield("454545");
        registerPage.clickOnenterRegisterButton();

    }

    @Test(dataProvider = "BuildyourOwnComputer",dataProviderClass = TeseData.class)
    public void verifyThatUserShouldBuildyourOwnComputerAndAddThemToCartSuccessFully(String processor, String ram, String hdd, String os,
                                                                                     String software) {

        homePage.clickOnComputers();
        computerPage.clickOnDesktopsLink();
        buildYourOwnComputerPage.ClickOnBuildyourowncomputer();
        buildYourOwnComputerPage.ProcessorDropDownLink(processor);
        buildYourOwnComputerPage.RamDropDownLink(ram);
        buildYourOwnComputerPage.clickOnHDDradiosbutton(hdd);
        buildYourOwnComputerPage.clickOnOSradiosbutton(os);
        buildYourOwnComputerPage.clickOnSoftwarecheckboxesbutton(software);
        buildYourOwnComputerPage.clickOnAddtocartbutton();
        buildYourOwnComputerPage.clickOnAddedtoyourshoppingcartbutton();

//        String actualMsg1=buildYourOwnComputerPage.The ProducthasbeenaddedtoyourShoppingCartText();
//         String expectedMsg1="The Product has been added to your ShoppingCart";
//       Assert.accertEquals(actualMsg1,expectedMsg1,"Product added message verified);
//

    }
}





