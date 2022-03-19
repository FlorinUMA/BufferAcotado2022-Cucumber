Feature: Geting an element from a buffer
  I want to get an element from a buffer

  Scenario: Getting an element from a buffer
    Given I have a buffer with a capacity of 3
    When I add an "element1"
    And "element1" is the first element
    When I add an "element2"
    When I add an "element3"
    Then The first element to get should be the first I have put in the buffer
