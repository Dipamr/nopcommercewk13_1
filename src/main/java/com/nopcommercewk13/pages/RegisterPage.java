package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement RegisterText;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleradiobutton;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleradiobutton;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFirstnamebutton;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLastnamebutton;
    @FindBy(xpath = "//div[@class='inputs date-of-birth']/div/select[1]")
    WebElement Dateofbirthbutton;
    @FindBy(xpath = "//div[@class='inputs date-of-birth']/div/select[2]")
    WebElement Monthofbirthbutton;
    @FindBy(xpath = "//div[@class='inputs date-of-birth']/div/select[3]")
    WebElement Yearofbirthbutton;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmailfield;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPasswordfield;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmpasswordfield;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement enterRegisterButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMsg;
    @FindBy(xpath = "//div[@class='result']")
    WebElement RegistrationcompletedText;
    @FindBy(xpath = "//div[@class='result']")
    WebElement ContinueButton;

    @FindBy(id = "FirstName-error")
    WebElement FirstnameRequired;
    @FindBy(id = "LastName-error")
    WebElement LastNameRequired;
    @FindBy(id = "Email-error")
    WebElement EmailRequired;
    @FindBy(id = "Password-error")
    WebElement PasswordRequired;
    @FindBy(id = "ConfirmPassword-error")
    WebElement ConfirmPasswordRequired;


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click On registerLink" + registerLink.toString());
    }

    public String RegisterText() {
        log.info("Getting registertext from " + RegisterText.toString());
        return getTextFromElement(RegisterText);

    }

    public void clickOnenterFirstnamebutton(String milk) {
        clickOnElement(enterFirstnamebutton);
        log.info("click On  clickOn enterFirstnamebutton" + enterFirstnamebutton.toString());

    }

    public void clickOnenterLastnamebutton(String patel) {
        clickOnElement(enterLastnamebutton);
        log.info("click On  clickOn enterLastnamebutton" + enterLastnamebutton.toString());
    }

    public void clickOnmaleradiobutton() {
        clickOnElement(maleradiobutton);
        log.info("click On  clickOn maleradiobutton" + maleradiobutton.toString());
    }

    public void clickOnfemaleradiobutton() {
        clickOnElement(femaleradiobutton);
        log.info("click On  clickOn femaleradiobutton" + femaleradiobutton.toString());
    }

    public void clickOnDateofBirthbutton(String s) {
        clickOnElement(Dateofbirthbutton);
        log.info("click On  click On Dateofbirthbutton" + Dateofbirthbutton.toString());
    }

    public void clickOnMonthofbirthbutton(String s) {
        clickOnElement(Monthofbirthbutton);
        log.info("click On  click On Monthofbirthbutton" + Monthofbirthbutton.toString());
    }

    public void clickOnYearofbirthbutton(String s) {
        clickOnElement(Yearofbirthbutton);
        log.info("click On  click On Yearofbirthbutton" + Yearofbirthbutton.toString());
    }

    public void clickOnenterEmailfield(String s) {
        clickOnElement(enterEmailfield);
        log.info("click On  click On enterEmailfield" + enterEmailfield.toString());
    }

    public void clickOnenterPasswordfield(String s) {
        clickOnElement(enterPasswordfield);
        log.info("click On  click On enterPasswordfield" + enterPasswordfield.toString());
    }

    public void clickOnenterConfirmpasswordfield(String s) {
        clickOnElement(enterConfirmpasswordfield);
        log.info("click On  click On enterConfirmpasswordfield" + enterConfirmpasswordfield.toString());
    }

    public void clickOnenterRegisterButton() {
        clickOnElement(enterRegisterButton);
        log.info("click On  click On enterRegisterButton " + enterRegisterButton.toString());
    }

    public String RegistrationcompletedText() {
        log.info("Getting RegistrationcompletedText from " + RegistrationcompletedText.toString());
        return getTextFromElement(RegistrationcompletedText);
    }

    public void clickOnContinueButton() {
        clickOnElement(ContinueButton);
        log.info("click On  click On ContinueButton " + ContinueButton.toString());
    }

    public String Emailrequired() {
        return getTextFromElement(EmailRequired);
    }

    public String Firstnamerequired() {
        return getTextFromElement(FirstnameRequired);

    }
    public String Lastnamerequired(){
        return getTextFromElement(LastNameRequired);
    }

    public String Passwordrequired() {
        return getTextFromElement(PasswordRequired);
    }

    public String Confirmpasswordrequired() {
        return getTextFromElement(ConfirmPasswordRequired);
    }
}

