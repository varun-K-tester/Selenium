Feature: Login to site

  Scenario: User is able to login into site with valid credentials
    Given user is on login page
    When User enters valid username and password
    And User clicks on login button
    Then User is naviagted to homepage