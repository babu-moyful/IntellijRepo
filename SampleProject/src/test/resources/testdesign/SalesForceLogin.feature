Feature: Functional validation of salesforce login page

  Scenario: validation of login functionality
    Given user navigates to salesforce login page
    When user enters the username "lmti" and password "abc"
    And user clicks on login button
    Then user validates the navigation to the homepage

  Scenario: validation of error message
    Given user navigates to salesforce login page
    When user enters the username "learnmore" and password "xyz"
    And user clicks on login button
    Then user validates the error message