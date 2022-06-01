@FeatureGroup_Requirement
Feature: feature to test login functionality

@vamsi
 Scenario: Validate login is successful with valid credentials
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  Scenario: Validate login is successful with invalid credentials
  Given User is on login page
  When User enters wrong username and password
  And Clicks on login button 
  
