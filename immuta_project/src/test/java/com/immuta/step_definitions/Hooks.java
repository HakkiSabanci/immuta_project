package com.immuta.step_definitions;

import com.immuta.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

/**
 * Hooks name is not reserved. You may name this class in any way.
 * For example: SuiteSetupAndTearDown
 * Hooks triggered based on tags not class name or their location.
 * These methods can be a part of any step definition class.
 * Common practice is to store them in the separate class.
 */
public class Hooks {
    @Before
    public void setup(Scenario scenario) {
        System.out.println("::: Starting Automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {
        //close browser, close DB connection, close tunnel,capture screenshot of the error, etc..
        //this is a hook after
        //runs automatically after every test
        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");
    }

}
