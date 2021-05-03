@policies
Feature: Add global policy
  Description: The purpose of this feature is to test adding  global policy to the data source

  Background: User logged in to Immuta's page
    Given user navigates to the login page
    Then user submits username and password
    Then user should be logged in

  Scenario: As a user I should add ssn under local policies

    When user on the dashboard page
    Then user click on the data source titled Data Source - Local Policies
    Then user navigates to the Data Dictionary tab
    And user click the Add Tags button in the ssn column
    And user apply the Policy Tags.Data tag
    Then user should see the tag Example Global Data Policy in data source
