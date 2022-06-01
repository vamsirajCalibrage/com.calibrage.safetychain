package stepdefinition;

import io.cucumber.java.en.Given;
import pages.Logout;
import util.Utilities;

public class LogoutSteps {
	Logout logout = new Logout();
	Utilities utilities = new Utilities();
	
	@Given("^Click on Logout button$")
	public void click_on_Logout_button() throws Throwable {
		logout.clickLogout();
	}
}
