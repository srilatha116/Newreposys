
Feature: Loginpage

  @tag
  Scenario: Login
    Given Open browser and enter url
    When enter user name,password and click on submit login
    Then home page should be opened
    And close browser

  