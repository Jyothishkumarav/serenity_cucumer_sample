#Author: jyothish.kumar@philips.com

@Type:Web_automation
@Story:1234

Feature: To Test feature of a travels web app Home Page
	As a user i should have access to Travels Home page
	And should able to access link and flight pages
	
Scenario: Hotel And flight links are displayed
    Given user navigates to home page
    When user has access to home page
    Then link for "hotel" and "flight" displayed