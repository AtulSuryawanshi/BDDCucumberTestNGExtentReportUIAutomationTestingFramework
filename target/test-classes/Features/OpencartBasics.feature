# BDD Cucumber Keywords - Feature, Given, When, Then, And, But
# Scenario & Scenario Outline - Examples
# Single & Multiple tags
Feature: Opencart Application Login

  Background: 
    Given User navigate to Opencart website

  @RegressionTest @SmokeTest @SanityTest
  Scenario: Opencart Login
      User should be able to login Opencart web application using the valid username and password

    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page

  @RegressionTest @SmokeTest
  Scenario: Opencart Signup
    User should be able to login Opencart web application using the valid username and password

    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page

  @RegressionTest
  Scenario Outline: Opencart Registration
    User should be able to login Opencart web application using the valid username and password

    When User enters <Username> and <Password>

    Examples: 
      | Username | Password |
      | Test1    | Test2    |
