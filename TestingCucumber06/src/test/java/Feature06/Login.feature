#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Cucumber.io page login

  
  Background:
  The user must be in Chrome browser

  @tag1
    
   Scenario Outline: Successful Login with Valid Credentials
  Given I am on the login page
  When I enter mandatory details from "<test_id>" in "<sheetName>"
  Then I should be logged in successfully
 
  Examples:
    | test_id | sheetName |
    | Case1   | LoginData |
    | Case2   | LoginData |