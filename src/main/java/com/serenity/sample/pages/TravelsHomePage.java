package com.serenity.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.makemytrip.com/")
public class TravelsHomePage extends BasePage {
	
	private static Logger log = LoggerFactory.getLogger(TravelsHomePage.class);
		
	@FindBy(how = How.CSS, using = "a[href='https://www.makemytrip.com/flights/']")
	private WebElement flightsLink;
	/*@FindBy(how = How.PARTIAL_LINK_TEXT, using = "hotels")*/
/*	private WebElement hotelLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "TOURS")
	private WebElement toursLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "CARS")*/
	//private WebElement carsLink;

	public boolean isLinksDisplayed() {
		
		waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='https://www.makemytrip.com/flights/']")));
		boolean isLinkdiplayed = flightsLink.isDisplayed();
		log.info("***   Flight Link Status : {} ", isLinkdiplayed);
		return isLinkdiplayed;

	}

}
