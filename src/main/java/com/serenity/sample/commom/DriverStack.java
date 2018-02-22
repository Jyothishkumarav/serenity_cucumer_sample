package com.serenity.sample.commom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.thucydides.core.webdriver.DriverSource;

public class DriverStack implements DriverSource {

	private static Logger log = LoggerFactory.getLogger(DriverStack.class);

	DesiredCapabilities capabilities;
	WebDriver driver;

	@Override
	public WebDriver newDriver() {
		
			driver = ChromeDriverFactory.getDriver();
			log.info("*** Chrome driver is initailized");
		
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}
}

	