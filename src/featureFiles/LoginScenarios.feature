Feature: Login Functionality

@LoginTests
Scenario Outline: Check user can login with valid credentials
Given Open Main page
And Enter User Credentials on login page with <username> and password <password>
When Click on Login
Then Verify User has logged in

Examples: 
| username              | password  | 
| bddtesting@gmail.com  | Test@123  |
