@tag
Feature: Admin Login
   I want to use this templete to click Admin Login
   
@tag1
Scenario: Check Admin Login with valid data
Given i open browser with url "http://orangehrm.qedgetech.com"
When i enter username as "Admin"
And i enter password as "Qedge123!@#"
And i click login button
When i click logout
When i close Browser 

@tag2
Scenario Outline: Check Admin Login with valid data
Given i open browser with url "http://orangehrm.qedgetech.com"
When i enter username as "<username>" 
And i enter password as "<password>" 
And i click login button
When i click logout
When i close Browser
Examples:
|username|password|
|Admin|Qedge123!@#|
|Admin12|Qedge123!@#|
|Admin|Qedge123|
|admin|Qedge!@#|