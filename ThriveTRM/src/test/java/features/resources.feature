Feature: Resources Page
     As a user i want to view a list of resources available to me so that i can 
         have assistance hiring the right talent
         
Scenario: User should be able to view list of Resources
Given a user
When user navigates to insights
And selects Resources
Then user should be taken to resources page         