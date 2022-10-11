@Automationexercise
Feature: Qutomation test2
  Scenario:Login User with correct email and password

Given Navigate to url http_automationexercise_com
Then Verify that home page is visible successfully
Then Click on Signup  Login button
Then Verify Login to your account is visible
Then Enter correct email address and password
Then Verify that Logged in as username is visible
Then Click Delete Account1 button
 And Verify that ACCOUNT DELETED!' is visible
