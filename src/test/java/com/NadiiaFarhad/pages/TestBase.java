package com.NadiiaFarhad.pages;

import com.NadiiaFarhad.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
    public TestBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="NAV_PERSONAL")
     public WebElement personalModule;

}
