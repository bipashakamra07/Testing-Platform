#Author: your.email@your.domain.com
@tag
Feature: cucumber.io documentation page testing

	Background:
	Given The user must be in chrome browser
  

  @tag1
  Scenario: Verify the documentation
    Given The user is in cucumber.io homepage
    When The user clicks on Documentation link
    Then The user can view the page content with What is Cucumber?
   

 