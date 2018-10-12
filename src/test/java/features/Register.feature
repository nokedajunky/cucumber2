Feature: Register

  Scenario: Registration of a new user
    Given User navigates to the register page one
    When User submits valid credentials in register page one
    And User submits valid credentials in register page two
    And User submits valid credentials in register page three
    And User submits valid credentials in register page four
    Then confirmation message is displayed