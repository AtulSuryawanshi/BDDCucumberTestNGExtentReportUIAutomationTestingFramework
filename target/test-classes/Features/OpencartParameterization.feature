# BDD Cucumber Parameterization - Scenario Outline, Examples & Data table

Feature: Opencart Application Login

  Scenario Outline: Opencart SignUp
    User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User enters <Username> and <Password>

    Examples: 
      | Username | Password |
      | Test1    | Test2    |

  Scenario Outline: Opencart SignUp
    User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User enters below details
      #|FName|LName|Mob Number|Address|
      | Atul | Suryawanshi | +91 123456789 | abc |
