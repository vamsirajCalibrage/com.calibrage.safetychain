@FeatureGroup_Requirement
Feature: feature to Void the Records in OEE Batch

@Voiding_Records_of_Batch_in_Live_Env
 Scenario: Validate MemuBar Links under LinkHomePage
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User void the Records in OEE Batch