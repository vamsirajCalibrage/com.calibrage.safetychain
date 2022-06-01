@FeatureGroup_Requirement
Feature: feature to test Link Resource Page functionality

  @SmokeTest
  Scenario: Validate Resources Page Features
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User navigated to the home page
    And User click on Link under Hamburger icon in webpage
    Then User click on Resources under Hamburger icon in Link Page
    Then User validates all the fields in Resources Page
    Then User validates all the fields in Attributes Page
    Then User validates all the fields in Links Page
    Then User validates all the fields in Forms Page
