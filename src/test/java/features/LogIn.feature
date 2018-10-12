Feature: LogIn to the system

  Scenario: LogIn to the system
    Given User navigates to the LogInPage
    When User submits valid credentials in LogInPage
    Then User panel is available