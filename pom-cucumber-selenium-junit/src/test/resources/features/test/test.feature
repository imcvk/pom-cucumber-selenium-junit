Feature: Test BDD framework
  @smokeTest
  Scenario: Testing the scenario for BDD framework
    Given Open Url
    When User enters Name,Email,Gender,Mobile
    And User enters Date of Birth,Subjects,Hobbies
    And User enters Picture,Current Address,State and City
    And Click on Login button
    Then User should be created