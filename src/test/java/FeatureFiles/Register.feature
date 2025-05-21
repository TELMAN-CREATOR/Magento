Feature: Magento

  Background:
    Given Navigate to Magento main
  Scenario:
    Given Click the Create an account link
    When Enter the all information
    Then User should create an account successfully
