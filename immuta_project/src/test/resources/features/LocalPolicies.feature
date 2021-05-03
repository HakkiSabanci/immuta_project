@policies
Feature: Local policies

  Background: User logged in to Immuta's page
  Given user is on the login page
    Then user enters username and password and clicks on the login button

  Scenario: As a user I should add ssn under local policies

    When user on the dashboard page
    Then user click on the data source titled Data Source - Local Policies
    Then user navigates to the Data Dictionary tab
    And user click the Add Tags button in the ssn column
    And user apply the Policy Tags.Data tag
    Then user should see the tag Example Global Data Policy in data source
