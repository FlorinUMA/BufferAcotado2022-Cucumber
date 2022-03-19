Feature: Checking if a buffer is correctly empty
  I want to check that the buffer correctly shows if it is empty or not.

  Scenario: Checking the correct size of the buffer
    Given I have a buffer with a capacity of 1
    Then The buffer should be empty
