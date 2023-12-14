Feature: Is it Friday

#  Scenario: It is Sunday, not Friday
#    Given It is Sunday
#    When I ask if it is Friday
#    Then I should get a "no"


#  Scenario: Friday is Friday
#    Given today is Friday
#    When I ask whether it's Friday yet
#    Then I should be told "TGIF"

  Scenario Outline:
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"
    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | no     |
      | anything else! | no     |