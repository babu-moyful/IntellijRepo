Feature: Validation of Search functionality

  @amazon01
  Scenario: Validation of Search functionality
    Given user navigates to amazon homepage
    When user enters the product name "keyboard"
    And user clicks on Search button
    Then user verify the title of page
