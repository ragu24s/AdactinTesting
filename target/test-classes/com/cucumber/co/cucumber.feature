Feature: to validate login module of the website

Background:
    Given navigate to the url
 @A
Scenario: to check the login functionality
   
    When username "9750308485" is given
    And password "24022000" is given
    And login in
    Then homepage should be displayed