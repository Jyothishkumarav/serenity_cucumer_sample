package com.serenitycucumber.sample.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/travel_search/TravelsHome.feature",
glue = "com.serenitycucumber.sample.feature.steps")
public class TravelsHome {

}
