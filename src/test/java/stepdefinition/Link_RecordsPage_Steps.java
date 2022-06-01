package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Link_RecordsPage;

public class Link_RecordsPage_Steps {
	Link_RecordsPage RecordPage = new Link_RecordsPage();
	
	@And("^User click on Record Under Hamburger in Link HomePage$")
	public void User_click_on_Record_Under_Hamburger_in_Link_HomePage() throws Throwable {
		RecordPage.clickRecordUnderHamburger();
	}
	
	@Then("^User click on Three months under Record Page$")
	public void User_click_on_Three_months_under_Record_Page() throws Throwable {
		RecordPage.clickonThreeMonths();
	}
	
	@And("^User click on SignOff under Verify of Record Page$")
	public void User_click_on_SignOff_under_Verify_of_Record_Page() throws Throwable {
		RecordPage.clickOnSignOffUnderVerify();
	}
	
	@Then("^User select CheckBox Of First Record and SignOff The Record$")
	public void User_select_CheckBox_Of_First_Record_and_SignOff_The_Record() throws Throwable {
		RecordPage.CheckTheCheckBoxOfFirstRecordForSignOffandClickOnVerify();
	}
	
	@And("^User click on None under Verify of Record Page$")
	public void User_click_on_None_under_Verify_of_Record_Page() throws Throwable {
		RecordPage.ClickOnNoneUnderVerify();
	}
	
	@Then("^User Validate Record is Signed by Filtering the Record in Record Search$")
	public void User_Validate_Record_is_Signed_by_Filtering_the_Record_in_Record_Search() throws Throwable {
		RecordPage.FilterRecord();
	}
	
	@Then("^User click on click on Card view button$")
    public void user_click_on_click_on_card_view_button() throws Throwable {
		RecordPage.User_validates_Cardview_button();
    }

    @Then("^User click on click on Record Id link$")
    public void user_click_on_click_on_record_id_link() throws Throwable {
        
    }

    @And("^User click on expand icon in the Card$")
    public void user_click_on_expand_icon_in_the_card() throws Throwable {
        
    }
	
	
	
}