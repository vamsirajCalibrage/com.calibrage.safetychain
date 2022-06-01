package stepdefinition;


import io.cucumber.java.en.Then;
import pages.Link_FavoritesDashPage;


public class Link_FavoritesDash_Steps {
	Link_FavoritesDashPage favorites = new Link_FavoritesDashPage();

	@Then("^User validates all the fields in Link FavoritesDashPage$")
	public void user_validates_all_the_fields_in_link_favoritesDashpage() throws Throwable {
		favorites.user_validates_all_the_fields_in_link_favoritesdashboardpage();
	    }

}
	