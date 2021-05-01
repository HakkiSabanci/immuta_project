Feature: Login

  As user, I want to be able to login Immuta's webpage

  Scenario: Login as user
    Given user is on the landing page
    Then user should see Immuta's logo
    When user enters username and password and clicks on the login button
    Then user should see the dashboard page