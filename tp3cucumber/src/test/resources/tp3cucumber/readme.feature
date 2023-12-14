Feature: Checking if the readme is working

 Scenario Outline: After a TP, I update the readme with some code and a picture
   Given I finished TP <nTP>
   When I have the readme file
   Then The picture should be in the readme
   Examples:
     | nTP        |
     | 1          |
     | 2          |
     | 3          |
