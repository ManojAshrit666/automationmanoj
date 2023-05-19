#Author
#Date


@SmokeScenario
Feature: Feature to test login functionality
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: Verify login is successful with valid credentials.
    Given User is on Login page
    When User enters <Username> and <Password>
    And Click on Login button
    Then User navigated to the Home page.

    Examples: 
      | Username | Password |
      | Manoj    | Manoj123 |
