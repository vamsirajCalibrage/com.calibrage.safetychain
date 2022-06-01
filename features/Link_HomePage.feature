@FeatureGroup_Requirement
Feature: feature to test Link Home Page functionality

@SmokeTest
 Scenario: Validate Navigating to Home page and Validating the elements in Link HomePage
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates Hamburger SafetyChainLogo DatePickers SearchLocations under Link HomePage
  And User validates Filters Records PassPercentage Refresh under Link HomePage
  And User validates User Profile MyDashBoards DashBuilder Records under Link HomePage
  And User validates ScheduleTasks Documents Cases under Link HomePage
  And User validates Suppliers Verifications AdminTools under Link HomePage
  And User validates Reports CustomReports under Link HomePage
  
@SmokeTest
 Scenario: Validate SafetyChain Logo in Homepage of Link
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates SafetyChain Logo in Link HomePage

@SmokeTest
 Scenario: Validate Home Link Under Hamburger in HomePage of Link
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates HomeLink Under Hamburger in Link HomePage
 
@SmokeTest
 Scenario: Validate MemuBar Links under LinkHomePage
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates MenuBarLinks Under LinkHomePage
  
@SmokeTest
 Scenario: Search Location and SuperAdmin Widget Under Link HomePage
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates Search Location and SuperAdmin Widget Under LinkHomePage

@SmokeTest
 Scenario: Search Location and SuperAdmin Widget Under Link HomePage
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates Location Search Under LinkHomePage
  
@SmokeTest
 Scenario: Verify Filters Under Link HomePage
  Given User is on login page
  When User enters username and password
  And Clicks on login button
  Then User navigated to the home page
  And User click on Link under Hamburger icon in webpage
  Then User validates Filters Under LinkHomePage
  
