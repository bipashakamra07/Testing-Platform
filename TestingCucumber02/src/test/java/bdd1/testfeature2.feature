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
Feature: To test the basic calculator
  Rule: This calculator has to be used for school students only
  
  Background:
  	Given a global administrator named
  	
  @tag1
  Scenario: To check i can perform addition
    Given I am holding the calculator
    When I enter the first number
    And I click on + symbol
    And I enter the third number
    Then I must be able to view the sum of the numbers
  @tag2
  Scenario: I want to mention my firstname as input
    Given I am in registration form
    When I enter my first name
 

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
