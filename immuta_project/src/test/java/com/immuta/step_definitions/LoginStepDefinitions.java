package com.immuta.step_definitions;
import com.immuta.pages.BasePage;
import com.immuta.pages.LoginPage;
import com.immuta.utils.ConfigurationReader;
import com.immuta.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.Assert;

public class LoginStepDefinitions extends BasePage {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().
                get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should see Immuta's logo")
    public void user_should_see_immuta_s_logo() {
        Assert.assertTrue(loginPage.veryfiyingLogo());
    }

    @When("user enters username and password and clicks on the login button")
    public void user_is_enter_user_name_and_password_and_clicks_login_button() {
      loginPage.login();
    }

    @Then("user should see the dashboard page")
    public void user_user_should_see_dashboard_page() {
        String expected = "Immuta - Log In";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expected,actual);

    }


}
