Feature: Cheking if a buffer is full or not
  I want to check that the buffer correctly shows if it is marked or not.

  Scenario: Checking the correct size of the buffer
    Given I have a buffer with a capacity of 2
    When I add an "element1"
    When I add an "element2"
    Then The size should be full
