package com.NadiiaFarhad.pages;

import com.NadiiaFarhad.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalPage extends TestBase{

    public PersonalPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "apptScheduler")
    public WebElement apptSchedule;



    @FindBy(css = ".image-holder ")
    public WebElement imagerHolder;
    @FindBy(css = "#Everyday_Banking")
    public WebElement everyDayBanking;


    @FindBy(css = "#A1100")
    public WebElement selectOpenNewAccount;


    @FindBy(css = "#nextBtnSubTopic")
    public WebElement nextButtonOpenNewAccount;

    @FindBy(id = "meeting-type-in-person")
    public WebElement searchByZipCode;


    @FindBy(css = "#findLocTextBox")
    public WebElement inputZipCode;

    @FindBy(id = "changeLocationSearchButton")
    public WebElement findLocationButton;


    @FindBy(xpath = "(//tbody//tr[1]//a['.=Select this Specialist'])[4]")
    public WebElement location;


    @FindBy(name = "Specialist_Yes")
    public WebElement yesButton;



    @FindBy(xpath = "//tbody/tr[1]//button[@name='Select_this_specialist']")
    public WebElement specialistChoose;

    @FindBy(xpath = "(//tbody//td[.='27'])[2]")
    public WebElement dateForAppointment;



    @FindBy(linkText = "10:00 am")
    public WebElement timeForAppointment;



    @FindBy(xpath = "(//button[@data-v-on-click='submitAppointment'])[1]")
    public WebElement buttonNextAppointment;


    @FindBy(id = "signin-button")
    public WebElement signinButton;

    @FindBy(id = "prospect-widget-button")
    public WebElement withOutSigninButton;
}
