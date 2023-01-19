Feature: Login Functionality
Scenario: Verify user is login with valid UN and Valid PWD
Given Browser open
And User is on Login Page
When User enter valid UN and valid PWD
And Click on login button
Then User should land on Homepage