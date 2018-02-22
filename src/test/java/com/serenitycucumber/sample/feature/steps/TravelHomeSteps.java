package com.serenitycucumber.sample.feature.steps;

import com.serenitycucumber.sample.serenity.steps.TravelUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TravelHomeSteps {
	@Steps(shared=true)
	private TravelUserSteps travelUser;

	@Given("^user navigates to home page$")
	public void userNavigatesToHomePage() throws Throwable {

		travelUser.userOpensPage();
	}

	@When("^user has access to home page$")
	public void userHasAccessToHomePage() throws Throwable {
		
		travelUser.should_have_access();
		
	}

	@Then("^link for \"([^\"]*)\" and \"([^\"]*)\" displayed$")
	public void linkForAndDisplayed(String hotelLink, String flightLink) throws Throwable {
		
		travelUser.should_see_links();
	}


}
