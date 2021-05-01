Feature: Login

  As user, I want to be able to login Immuta's webpage

  Scenario: Login as user
    Given user is on the login page
    And user is enter user name and password and clicks login button
    Then user user should see dashboard page