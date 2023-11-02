Feature: Sales Force TestCases Login Feature
Scenario: TC02:Verify Login with valid username and password 
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 And close the browser
 
 
 
 
 
 
Scenario: TC03:Test the remember username check box  
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 When User clicks on user menu dropdown
 And logout menu is clicked
 And close the browser

Scenario: TC04A:Test forgot password link
 Given User login page is launched
 When User clicks forgot password link
 Then SalesForce forgot password page should be displayed
 When Valid username enters username field in forgot password page
 And Continue button is clicked
 Then Password reset message page is displayed
 And close the browser
 
Scenario: TC04B:Test with wrong Username and wrong password
 Given User login page is launched
 When Wrong username enters username field
 And Wrong password enters password field
 When User clicks on Login button 
 Then Error message Displayed on login page
 And close the browser
 
Scenario: TC05:Verify user dropdown menu 
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 When User clicks on user menu dropdown
 Then User dropdown menu should be displayed
 And close the browser
 