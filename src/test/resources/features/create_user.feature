Feature: Create an user on Regres.info
  I want to create an user

  Scenario: Creation an user
    When you create an user
    | name | job |
    |branon| java|
    Then I should see the user created