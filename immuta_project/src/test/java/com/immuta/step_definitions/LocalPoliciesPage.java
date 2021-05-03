package com.immuta.step_definitions;

import com.immuta.pages.DataSourceLocalPoliciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocalPoliciesPage extends DataSourceLocalPoliciesPage {
    DataSourceLocalPoliciesPage dataSourceLocalPoliciesPage = new DataSourceLocalPoliciesPage();
/*
    @Given("user navigates to the login page")
    public void userNavigatesToTheLoginPage() {

    }

    @Then("user submits username and password")
    public void userSubmitsUsernameAndPassword() {
    }

    @Then("user should be logged in")
    public void userShouldBeLoggedIn() {
    }


    @When("user on the dashboard page")
    public void user_on_the_dashboard_page() {


    }

 */

    @Then("user click on the data source titled Data Source - Local Policies")
    public void user_click_on_the_data_source_titled() {
        dataSourcePolices.click();
    }
    @Then("user navigates to the Data Dictionary tab")
    public void userNavigatesToTheDataDictionaryTab() {
       dataDictionary.click();
    }

    @And("user click the Add Tags button in the ssn column")
    public void userClickTheAddTagsButtonInTheSsnColumn() {
        ssnAddTagButton.click();

    }
    @And("user apply the Policy Tags.Data tag")
    public void userApplyTheTag() {
        ssnAddTagButton.sendKeys("Policy Tags.Data");
    }

    @Then("user should see the tag Example Global Data Policy data source")
    public void user_should_see_the_tag_in_data_source() {

        System.out.println( policyTagsDataTag.isDisplayed());

    }

    @Then("user should see the tag Example Global Data Policy in data source")
    public void userShouldSeeTheTagExampleGlobalDataPolicyInDataSource() {

       /* Here I am not sure where exactly it should appear. It is not visible under Example Global Data
        Policy but it's under activities on the right side.

        */

    }
}
