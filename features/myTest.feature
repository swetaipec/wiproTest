Feature: Register functionality on Home page of Application 

Scenario: user able to register using valid email id
Given Open the Firefox and launch the application			
When Enter the Email address			
Then click on create myaccount button
Then verify user is  logged in



Scenario: While registering, if the email address is incorrect. User should see an error message
Given Open the Firefox and launch the application			
When Enter the invalidEmail address			
Then click on create myaccount button
Then check system throw an error
 


Scenario: Checl whether megamenu works_Dresses>Summer dresses
Given Open the Firefox and launch the application			
When megamenu Dresses Clicked			
Then click on submenu summer menu




Scenario: sort by price and check grid is arranged properly
Given Open the Firefox and launch the application	
When megamenu Dresses Clicked		
Then click on submenu summer menu		
Then sort by Price lowest first


