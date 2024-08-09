Feature: Test BDD framework with tags test2
  @Regression
  Scenario: test1-Scenario1-Testing the scenario for BDD framework with tags
    Given Open Url
    When User enters Name,Email,Gender,Mobile
    And User enters Picture,Current Address,State and City
    And User enters Date of Birth,Subjects,Hobbies
    And Click on Login button
    Then User should be created
  @systemTest
  Scenario: test1-Scenario2-Testing the scenario for BDD framework with tags
    Given Open Url
    When User enters Name,Email,Gender,Mobile
    And User enters Picture,Current Address,State and City
    And User enters Date of Birth,Subjects,Hobbies
    And Click on Login button
    Then User should be created