Feature: Search Product Functionality

@CheckoutProductsFromBasketTests
Scenario Outline: Check user can search product as expected
Given Open Main page
And Login with User
When Search Product <productName>
Then Validate the Product <productName>

Examples: 
|productName                                          |
|John Lewis & Partners Calia TV Stand for TVs up to 60| 
|John Lewis & Partners Ines Duvet Cover Set, Citrine  |
|John Lewis & Partners Anton 6-8 Seater Extending Dining Table, Natural|