package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement ComputerText;

    @FindBy(xpath = "//div[@class='page-body']/div[1]/div[1]/div[1]/div[1]/h2/a")
    WebElement DesktopsLink;

    @FindBy(xpath = "//a[contains(text(),' Notebooks')]")
    WebElement NotbooksLink;
    @FindBy(xpath = "//a[contains(text(),' Software')]")
    WebElement SoftwareLink;

    public String getComputerText() {
        return getTextFromElement(ComputerText);
    }
    public void clickOnDesktopsLink() {
        clickOnElement(DesktopsLink);
        log.info("click On  the DesktopsLink" + DesktopsLink.toString());
    }
    public void clickOnNotbooksLink() {
        clickOnElement(NotbooksLink);
        log.info("click On  the NotbooksLink" + NotbooksLink.toString());
    }
    public void clickOnSoftwareLink() {
        clickOnElement(SoftwareLink);
        log.info("click On  the SoftwareLink" + SoftwareLink.toString());
    }

}