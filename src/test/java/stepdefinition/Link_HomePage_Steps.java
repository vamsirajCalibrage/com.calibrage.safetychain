package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Link_HomePage;

public class Link_HomePage_Steps {
	Link_HomePage LinkHomePage = new Link_HomePage();
	
	@And("^User click on Link under Hamburger icon in webpage$")
	public void User_click_on_Link_under_Hamburger_icon_in_webpage() throws Throwable {
		LinkHomePage.User_click_on_Link_under_WebHamburger_in_Webpage();
	}
	
	@Then("^User validates SafetyChain Logo in Link HomePage$")
	public void User_validates_SafetyChain_Logo_in_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_SafetyChainLogo();
	}
	
	@And("^User validates Hamburger SafetyChainLogo DatePickers SearchLocations under Link HomePage$")
	public void User_validates_Hamburger_SafetyChainLogo_DatePickers_SearchLocations_under_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_Hamburger_SafetyChainLogo_DatePickers_SearchLocations();
	}
	
	@And("^User validates Filters Records PassPercentage Refresh under Link HomePage$")
	public void User_validates_Filters_Records_PassPercentage_Refresh_under_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_Filters_Records_PassPercentage_Refresh_LinkVersion();
	}
	
	@And("^User validates User Profile MyDashBoards DashBuilder Records under Link HomePage$")
	public void User_validates_User_Profile_MyDashBoards_DashBuilder_Records_under_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_User_Profile_MyDashBoards_DashBuilder_Records();
	}
	
	@And("^User validates ScheduleTasks Documents Cases under Link HomePage$")
	public void User_validates_ScheduleTasks_Documents_Cases_under_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_ScheduleTasks_Documents_Cases();
	}
	
	@And("^User validates Suppliers Verifications AdminTools under Link HomePage$")
	public void User_validates_Suppliers_Verifications_AdminTools_under_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_Suppliers_Verifications_AdminTools();
	}
	
	@And("^User validates Reports CustomReports under Link HomePage$")
	public void User_validates_Reports_CustomReports_under_Link_HomePage() throws Throwable {
		LinkHomePage.validating_Link_HomePage_Reports_CustomReports();
	}
	
	@And("^User validates HomeLink Under Hamburger in Link HomePage$")
	public void User_validates_HomeLink_Under_Hamburger_in_Link_HomePage() throws Throwable {
		LinkHomePage.validating_HomeLink_Under_Hamburger_in_Link_HomePage();
	}
	
	@And("^User validates MenuBarLinks Under LinkHomePage$")
	public void User_validates_MenuBarLinks_Under_LinkHomePage() throws Throwable {
		LinkHomePage.validating_MenuBarLinks_HomePage();
	}
	
	@And("^User validates Search Location and SuperAdmin Widget Under LinkHomePage$")
	public void User_validates_Search_Location_and_SuperAdmin_Widget_Under_LinkHomePage() throws Throwable {
		LinkHomePage.validating_Search_Location_and_SuperAdmin_Widget_HomePage();
	}
	
	@And("^User validates Location Search Under LinkHomePage$")
	public void User_validates_Location_Search_Under_LinkHomePage() throws Throwable {
		LinkHomePage.validating_LocationSearch_HomePage();
	}
	
	@Then("^User validates Filters Under LinkHomePage$")
	public void User_validates_Filters_Under_LinkHomePage() throws Throwable {
		LinkHomePage.validating_Filters_HomePage();
	}
	
}
