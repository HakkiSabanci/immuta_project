package com.immuta.pages;

import com.immuta.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "un")
    private WebElement userNameBox;

    @FindBy(id = "pw")
    private WebElement enterPasswordBox;

    @FindBy(id = "login")
    private WebElement loginButton;

    public boolean  veryfiyingLogo() {
        return landingPageLogo.isDisplayed();

    }

    public void login(){


        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        userNameBox.sendKeys(userName);
        enterPasswordBox.sendKeys(password);
        loginButton.click();

    }

}
