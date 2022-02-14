Feature:  Items can be added to the shopping cart on demoblaze.com for both members and guests
 
Scenario: member adds product to shopping cart
Given Member has an account
When Member logs in with his valid credentials
And Member adds a product to the shopping cart
Then the product is visible in the shopping cart
 
Scenario: guest adds product to shopping cart
Given Guest does not have an account
When Guest adds a product to the shopping cart
Then the product is visible in the shopping cart


