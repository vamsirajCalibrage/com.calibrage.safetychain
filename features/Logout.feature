@FeatureGroup_Requirement
Feature: feature to test logout functionality

@SmokeTest
 Scenario: Validate login is successful with valid credentials
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And Click on Logout button
