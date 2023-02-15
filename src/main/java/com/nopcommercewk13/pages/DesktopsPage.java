package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='page category-page']/div/h1")
    WebElement DesktopsText;
    @FindBy(xpath = "//div[@class='product-sorting']/span")
    WebElement SortbyText;
    @FindBy(xpath = "//div[@class='product-page-size']//span[contains(text(),'Display')]")
    WebElement DisplayText;
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement selectproductlist;

    public String getDesktopsText() {
        log.info("Getting Desktopstext from " + DesktopsText.toString());
        return getTextFromElement(DesktopsText);
    }

    public String getSortbyText() {
        log.info("Getting SortbyText from " + SortbyText.toString());
        return getTextFromElement(SortbyText);

    }

    public String getDisplayText() {
        log.info("Getting Display Text from " + DisplayText.toString());
        return getTextFromElement(DesktopsText);
    }

    public String getselectproductlistText() {
        log.info("Getting selectproductlist Text from " + selectproductlist.toString());
        return getTextFromElement(selectproductlist);

    }
}

