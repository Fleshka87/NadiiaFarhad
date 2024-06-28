package com.NadiiaFarhad.stepsDef;

import com.NadiiaFarhad.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardown(Scenario scenario) {
        byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        System.out.println("running after each scenario");
        //BrowserUtils.sleep(3);
        Driver.closeDriver();

    }

}
