Feature: Immuta’s search feature
  Description: This file contains manual testing scenarios to validate Immuta's search feature.
  Since I don't have required input for validation I came up with several
  of them based on Immutas dashboard page. User should have admin rights in order to access private data.

  Test Case 1:
  Given user is on the login page
  When user submits valid credentials
  Then user will be on the dashboard page

  Test Case 2:
  Given user is on the dashboard page
  And user types "Data Source" in the search box
  Then user should see 2 options Data Source - Local Policies and Data Source - Global Policies

  Test Case 3:
  When user types "Policy tags" in the search box
  Then user should see 2 options PolicyTags.Data and PolicyTags.Subscription

  Test Case 4:
  When user without admin rights search for "Customer"
  Then user should not see any results

  Negative test cases:
  When user search for keyword with special characaters ($#@$^&&)
  Then user shouldn't see any search result

  When user search for keyword with empty string ("")
  Then user shouldn't see any search result

  When user search for keyword with "null"
  Then user shouldn't see any search result
