Feature: Create Account

  Scenario: Create an Account
    Given Ryan is a bank customer
    When he enter ID,Email,Cell phone
    Then he should see information about bank account