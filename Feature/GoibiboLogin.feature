Feature: Login to goibibo website

Scenario: Successful Login with Valid Credentials
	Then user navigate to Goibibo site 
	Then User clicks on SIgn In Button
	When User enter username and password
	And User click on login
	Then User authentication will be successful
	
	#Given,when ,then,and
	
	#Cucumber BDD frameowkD


	
