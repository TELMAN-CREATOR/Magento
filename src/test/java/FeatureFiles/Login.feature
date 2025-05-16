Feature: Magento

  Background:
    Given Navigate to Magento

  Scenario: User successfully logs in with valid credentials
    When Enter email and password
    And Click the Sign In button
    Then User should login successfully

  Scenario: User fails to log in with invalid credentials
    When Enter invalid email or password
    And Click the Sign In button
    Then The user should see an error message

  Scenario: User fails to log in with empty credentials
    When Enter empty email and password
    And Click the Sign In button
    Then The user should see a required field error message

  Scenario: User resets password successfully
    When Click the Forgot Your Password link
    And Enter email address and click Reset My Password button
    Then The user should see a password reset confirmation message
