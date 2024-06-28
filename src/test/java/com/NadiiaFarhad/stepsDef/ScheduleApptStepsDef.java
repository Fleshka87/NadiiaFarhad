package com.NadiiaFarhad.stepsDef;

import com.NadiiaFarhad.pages.PersonalPage;
import com.NadiiaFarhad.utilities.BrowserUtils;
import com.NadiiaFarhad.utilities.ConfigurationReader;
import com.NadiiaFarhad.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v124.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ScheduleApptStepsDef {
    PersonalPage personalPage = new PersonalPage();

    @Given("user is on a home page")
    public void user_is_on_a_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));

    }

    @Then("user clicks Schedule an appointment link")
    public void user_clicks_schedule_an_appointment_link() {
        BrowserUtils.sleep(5);
        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", personalPage.imagerHolder);
        personalPage.apptSchedule.click();
    }

    @Then("user clicks on Everyday banking module")
    public void user_clicks_on_everyday_banking_module() {
        personalPage.everyDayBanking.click();
    }

    @Then("user select the option Open a new account and clicks next button")
    public void user_select_the_option_open_a_new_account_and_clicks_next_button() {
        personalPage.selectOpenNewAccount.click();
        BrowserUtils.sleep(5);
        personalPage.nextButtonOpenNewAccount.click();
    }

    @Then("user clicks on Search be zip code tab")
    public void user_clicks_on_search_be_zip_code_tab() {
        personalPage.searchByZipCode.click();

    }

    @Then("user enters zip code {string} in a search line and clicks Find locations button")
    public void user_enters_zip_code_in_a_search_line_and_clicks_find_locations_button(String string) {
        personalPage.inputZipCode.sendKeys(string + Keys.ENTER);
        BrowserUtils.sleep(5);
    }

    @Then("user selects the first location from the list and confirmes the selection by clicking yes button")
    public void user_selects_the_first_location_from_the_list_and_confirmes_the_selection_by_clicking_yes_button() throws InterruptedException {

     personalPage.location.click();
        BrowserUtils.sleep(5);
     personalPage.yesButton.click();
        BrowserUtils.sleep(5);
    }


    @Then("user selects the fist specialist from the list")
    public void user_selects_the_fist_specialist_from_the_list() {
        personalPage.specialistChoose.click();
        BrowserUtils.sleep(5);
        
    }

    @Then("user selects the fisrt available date {string}")
    public void user_selects_the_fisrt_available_date(String string) {
        personalPage.dateForAppointment.click();

    }

    @Then("user selects the fisrt available time {string} and clicks next")
    public void user_selects_the_fisrt_available_time_and_clicks_next(String string) {
       personalPage.timeForAppointment.click();
       personalPage.buttonNextAppointment.click();
    }

    @Then("user can see {string} option")
    public void user_can_see_option(String string) {
       String expResutl=string;
        Assert.assertTrue(personalPage.withOutSigninButton.getText().equals(expResutl));
    }
}
