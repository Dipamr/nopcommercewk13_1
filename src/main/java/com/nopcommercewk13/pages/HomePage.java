package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;
    //By loginLink = By.linkText("Log in");

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(linkText = "My account")
    WebElement accountLink;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement LogoutLink;

    @FindBy(xpath = "//div[@class='header-logo']/a/img")
    WebElement logo;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    WebElement sevenmenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    WebElement Computers;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement Electronicsmenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement Apparelmenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement Digitaldownloadsmenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement Booksmenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement Jewelrymenu;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Card')]")
    WebElement Giftcardmenu;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("click On loginlink" + loginLink.toString());
    }


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click On registerLink" + registerLink.toString());
    }

    public void clickOnMyaccount() {
        clickOnElement(accountLink);
        log.info("click On accountLink" + accountLink.toString());
    }

    public void clickOnLogOutLink() {
        clickOnElement(LogoutLink);
        log.info("click On LogoutLink" + LogoutLink.toString());

    }

    public void clickOnLogo() {
        clickOnElement(logo);
        log.info("click On logo" + logo.toString());
    }

    public void clickOnsevenmenu() {
        clickOnElement(sevenmenu);
        log.info("click On any of the sevenmenu" + sevenmenu.toString());
    }

    public void clickOnComputers() {
        clickOnElement(Computers);
        log.info("click  the Computers" + Computers.toString());

    }

    public void clickOnElectronicsmenu() {
        clickOnElement(Electronicsmenu);
        log.info("click On  the Electronicsmenu" + Electronicsmenu.toString());
    }

    public void clickOnApparelmenu() {
        clickOnElement(Apparelmenu);
        log.info("click On  the Apparelmenu" + Apparelmenu.toString());
    }

    public void clickOnDigitaldownloadsmenu() {
        clickOnElement(Digitaldownloadsmenu);
        log.info("click On  the Digitaldownloadsmenu" + Digitaldownloadsmenu.toString());

    }

    public void clickOnBooksmenu() {
        clickOnElement(Booksmenu);
        log.info("click On  the Booksmenu" + Booksmenu.toString());
    }
    public void clickOnJewelrymenu() {
        clickOnElement(Jewelrymenu);
        log.info("click On  the Jewelrymenu" + Jewelrymenu.toString());
    }
    public void clickOnGiftcardmenu() {
        clickOnElement(Giftcardmenu);
        log.info("click On  the Giftcardmenu" + Giftcardmenu.toString());
    }
}
