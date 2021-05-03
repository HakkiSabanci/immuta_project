package com.immuta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataSourceLocalPoliciesPage extends BasePage{

    @FindBy(xpath = "//tbody/tr[@id='data-source-7']/td[2]/div[1]/a[1]")
    public WebElement dataSourcePolices;

    @FindBy(xpath = "//button[@id='datasource_DataDictionary']")
    public WebElement dataDictionary;

    @FindBy(xpath = "//button[@id='entry-3-tag']")
    public WebElement ssnAddTagButton;

    @FindBy(xpath = "//label[contains(text(),'Search by Tag Name')]")
    public WebElement addTagSearchBox;

    @FindBy(className = "dp-chip--text ng-binding")
    public WebElement  policyTagsDataTag;


}
