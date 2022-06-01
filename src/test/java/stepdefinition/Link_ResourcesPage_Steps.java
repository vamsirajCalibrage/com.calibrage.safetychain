package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Link_ResourcesPage;
public class Link_ResourcesPage_Steps {
	Link_ResourcesPage Resources = new Link_ResourcesPage();

	@And("^User click on Resources under Hamburger icon in Link Page$")
	public void User_click_on_Resources_under_Hamburger_icon_in_Link_Page() throws Throwable {
		Resources.User_click_on_Resources_under_Hamburger_in_Linkpage();
	}

	@Then("^User validates all the fields in Resources Page$")
	public void user_validates_all_the_fields_in_resources_page() throws Throwable {
		Resources.validating_Link_ResourcePage_Hamburger_SafetyChainLogo_DatePickers();
		Resources.validating_Link_ResourcesPage_Filters();
		Resources.validating_Alldropdown();
//		Resources.validating_Attributedropdown();
		Resources.validating_checkboxes();
		
	}
	 @Then("^User validates all the fields in Attributes Page$")
	    public void user_validates_all_the_fields_in_attributes_page() throws Throwable {
		 Resources.User_click_on_Attributesbutton_in_Resourcepage();
		 Resources.validating_Alldropdown();
		 Resources.validating_checkboxes();
	    }

    @Then("^User validates all the fields in Links Page$")
    	public void user_validates_all_the_fields_in_links_page() throws Throwable {
    	Resources.User_click_on_linksbutton_in_Resourcepage();
//    	Resources.validating_Alldropdown();
//		Resources.validating_checkboxes();
    	}

	 @Then("^User validates all the fields in Forms Page$")
	    public void user_validates_all_the_fields_in_forms_page() throws Throwable {
    	Resources.User_click_on_formsbutton_in_Resourcepage();
	}
}

