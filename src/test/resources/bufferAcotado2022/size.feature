Feature: Cheking the size count of a buffer
  I want to check that the buffer correctly counts the size of itself.

  Scenario: Checking the correct size of the buffer
    Given I have a buffer with a capacity of 2
    When I add an "element1"
    When I add an "element2"
    Then The size should be 2
