Feature: Register

  Scenario: Registration of a new user
    Given User navigates to the SignInPage
    And User provides e-mail address
    And User provides valid personal credentials
    Then User is looged in to the created account