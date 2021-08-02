Feature: Search Product Functionality

@AddProductsToBasketTests
Scenario Outline: Check user can add product to basket
Given Open Main page
And Login with User
When Search Product <productName>
And Add Product <productName> to basket
Then Validate the basket with Product <productName>

Examples: 
|productName                                          |
|John Lewis & Partners Calia TV Stand for TVs up to 60| 
|John Lewis & Partners Ines Duvet Cover Set, Citrine  |
|John Lewis & Partners Anton 6-8 Seater Extending Dining Table, Natural|