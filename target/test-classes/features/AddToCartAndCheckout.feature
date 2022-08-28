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
Then user select a product
And user click on add to cart button
Then user is on added to cart page
When user click on procced to check out button
Then user is on checkout page