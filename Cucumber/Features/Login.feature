Feature: Login with Valid Credentials

  @sanity @regression
  Scenario Outline: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on Login
    And User enter Email as "<email>" and Password as "<password>"
    And click on Login button
    Then User navigates to MyAccount Page

    Examples:
      | email                     | password |
      | pavanol@gmail.com         | test123  |
      | pavanoltraining@gmail.com | test@123 |
