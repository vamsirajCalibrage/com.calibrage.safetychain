package stepdefinition;

import pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage loginPage = new LoginPage();
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage.User_login_into_SIMS();
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		loginPage.enterUserNameAndPassword();
	}
	
	@When("^User enters wrong username and password$")
	public void user_enters_wrong_username_and_password() throws Throwable {
		loginPage.enterwrongUserNameAndPassword();
	}

	@And("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		loginPage.clickLoginBtn();
	}

	@Then("^User navigated to the home page$")
	public void user_navigated_to_the_home_page() throws Throwable {
		loginPage.NavigatedToHomePage();
	}
	
	
	
	
	
	
	
	
	
}
