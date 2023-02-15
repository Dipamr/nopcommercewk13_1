package com.nopcommercewk13.testsuite;

import com.nopcommercewk13.pages.HomePage;
import com.nopcommercewk13.pages.LoginPage;
import com.nopcommercewk13.pages.RegisterPage;
import com.nopcommercewk13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void verifyTheErrorMessageWithinValidCredential() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("cow@gmail.com");
        loginPage.enterPassword("454545");
        loginPage.clickOnLoginButton();

    }

    @Test
    public void verifyTheMessageWithinValidCredential() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("cow@gmail.com");
        loginPage.enterPassword("44545");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogOutLink();

    }

    @Test
    public void verifyUserShouldLogOutSuccessfully() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("cow@gmail.com");
        loginPage.enterPassword("454545");
        loginPage.clickOnLoginButton();

    }
}














