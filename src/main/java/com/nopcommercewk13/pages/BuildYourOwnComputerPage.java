package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[@class='product-title']/a[contains(text(),'Build your own computer')]")
    WebElement BuildyourowncomputerText;
    @FindBy(linkText = "Build your own computer")
    WebElement Buildyourowncomputer;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement ProcessorDropDown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement RamDropDown;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDDradiosbutton;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement OSradiosbutton;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement Softwarecheckboxesbutton;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement Addtocartbutton;
    @FindBy(xpath = "//a[@class='ico-cart']/span[2]")
    WebElement Addedtoyourshoppingcartbutton;
    public String getBuildyourowncomputerText() {
        return getTextFromElement(BuildyourowncomputerText);
    }

    public void ClickOnBuildyourowncomputer() {
        clickOnElement(Buildyourowncomputer);
        log.info("Click on Buildyourowncomputer " + Buildyourowncomputer.toString());

    }
        public void RamDropDownLink(String ram)    {
        clickOnElement(RamDropDown);
        log.info("click On  the RamDropDown" + RamDropDown.toString());


    }

    public void ProcessorDropDownLink(String processor) {
        clickOnElement(ProcessorDropDown);
        log.info("click On  the ProcessorDropDownLink" + ProcessorDropDown.toString());

    }

    public void clickOnHDDradiosbutton(String hdd) {
        clickOnElement(HDDradiosbutton);
        log.info("click On  the HDDradiosbutton" + HDDradiosbutton.toString());

    }

    public void clickOnOSradiosbutton(String os) {
        clickOnElement(OSradiosbutton);
        log.info("click On  the OSradiosbutton" + OSradiosbutton.toString());
    }

    public void clickOnSoftwarecheckboxesbutton(String software) {
        clickOnElement(Softwarecheckboxesbutton);
        log.info("click On  the Softwarecheckboxesbutton " + Softwarecheckboxesbutton.toString());
    }

    public void clickOnAddtocartbutton() {
        clickOnElement(Addtocartbutton);
        log.info("click On  the Addtocartbutton " + Addtocartbutton.toString());
    }

    public void clickOnAddedtoyourshoppingcartbutton() {
        clickOnElement(Addedtoyourshoppingcartbutton);
        log.info("click On  the Addedtoyourshoppingcartbutton" + Addedtoyourshoppingcartbutton.toString());
    }
    public void makeyourown(String processor, String ram, String hdd, String os, String software) {
        ProcessorDropDownLink(processor);
        RamDropDownLink(ram);
        clickOnHDDradiosbutton(hdd);
        clickOnOSradiosbutton(os);
        clickOnSoftwarecheckboxesbutton(software);
    }
}
