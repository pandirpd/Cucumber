#Author
#Date
#Description
@SmokeFeature
Feature: fearure to test login functionality 

@smoketest
Scenario: Check login is successful with valid credentials 

	Given user is on login page 
	When user enters username and password 
	And click on login button 
	Then user is navigated to the home page 
	