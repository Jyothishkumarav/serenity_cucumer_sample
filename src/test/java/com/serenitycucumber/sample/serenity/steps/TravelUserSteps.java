package com.serenitycucumber.sample.serenity.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.serenity.sample.pages.TravelsHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TravelUserSteps extends ScenarioSteps {

	private TravelsHomePage travelHomePage;

	@Step
	public void userOpensPage() {

		travelHomePage.open();
	}

	@Step
	public void should_have_access() {

		assertTrue(travelHomePage.getDriver().getCurrentUrl().contains("https://www.makemytrip.com/"));
	}

	@Step
	public void should_see_links() {
		assertEquals(travelHomePage.isLinksDisplayed(), true);
	}


}
