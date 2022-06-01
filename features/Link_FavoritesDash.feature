@FeatureGroup_Requirement
Feature: feature to test link favoritesDash functionality.

@SmokeTest
 Scenario: Validate Link Favorites Dashbaord Page Features
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates all the fields in Link FavoritesDashPage