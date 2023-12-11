Feature: Is it Friday

  Scenario: It is Sunday, not Friday
    Given It is Sunday
    When I ask if it is Friday
    Then I should get a "no"