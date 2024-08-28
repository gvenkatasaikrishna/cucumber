Feature: Admin login and Create Skills Records

Background: commom steps
Given user launch chrome browser
When user opens url "http://orangehrm.qedgetech.com"
Scenario: Create Skills Record
And login into application with below credentials
      |Admin|Qedge123!@#|
Then created skills record
      |Java001|Javadesc001|
      |Java002|Javadesc002|
      |Java003|Javadesc003|
When i logout the application
Then i close the browser 