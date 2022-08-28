Feature: Amazon Search product 

Scenario: Amazon Search for a product Test Scenario

Given user is already on Login Page
When title of login page is amazon sign page
Then user enters username and password
Then user clicks on login button

Then user is on Home Page
When user select search bar and enters procductname
And user clicks on search Icon 
Then user is on product page
