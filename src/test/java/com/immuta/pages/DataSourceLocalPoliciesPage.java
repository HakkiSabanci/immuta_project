package com.immuta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataSourceLocalPoliciesPage extends BasePage{

    @FindBy(xpath = "//tbody/tr[@id='data-source-7']/td[2]/div[1]/a[1]")
    private WebElement dataSourcePolices;

    @FindBy(xpath = "//button[@id='datasource_DataDictionary']")
    private WebElement dataDictionary;

    @FindBy(xpath = "//button[@id='entry-3-tag']")
    private WebElement ssnAddTagButton;

    @FindBy(xpath = "//label[contains(text(),'Search by Tag Name')]")
    private WebElement addTagSearchBox;


}
