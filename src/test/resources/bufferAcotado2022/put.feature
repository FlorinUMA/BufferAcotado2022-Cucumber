Feature: Putting an element into a buffer
  I want to add an element into a buffer

  Scenario Outline: Adding elements untill it is almost full
    Given I have a buffer with a capacity of 4
    And The buffer is not full
    When I add an "<element>"
    Then It will be added to the buffer

    Examples: 
      | element |
      | a1      |
      | a2      |
      | a3      |

  Scenario: Try to add an element when the buffer is full
    Given I have a full buffer
    When I add an "elemento que no cabe"
    Then I will not be able to add the element
