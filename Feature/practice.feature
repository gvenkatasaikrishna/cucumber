@tag
Feature: Admin Login
   I want to use this templete to click Admin Login

@tag1
Scenario: Check Admin Login with valid data
Given i open browser with url "http://orangehrm.qedgetech.com"
When i enter username as "Admin"
And i enter password as "Qedge123!@#"
And i click login button
Then i click Admin button
Then i click job link
Then i click jobtitle button
When i click Add button
Then i enter job title as "sales" and i enter job Description as "Salesdesc" and i enter job note as "job record created"
When i click save button
When i click logout
When i close Browser 

@tag2
Scenario Outline: create multiple job records
Given i open browser with url "http://orangehrm.qedgetech.com"
When i enter username as "Admin"
And i enter password as "Qedge123!@#"
And i click login button
Then i click Admin button
Then i click job link
Then i click jobtitle button
When i click Add button
Then i enter "<job title>" and i enter "<job Description>" and i enter "<job note>"
When i click save button
When i click logout
When i close Browser 
Examples:
|job title|job Description|job note|
|Sales1|Sales1|Sales1 created|
|Sales2|Sales2|Sales2 created|
|Sales3|Sales3|Sales3 created|