Feature: Foreign Exchange

@smoke @regression
Scenario: Foreign Exchange Page success
Given API for foreign exchange
When posted with correct Information
Then validate positive response code received

Scenario: Foreign Exchange Page failure
Given API for foreign exchange one
When posted with incorrect Information
Then validate negative response code received


Scenario: Foreign Exchange Page future date
Given API for foreign exchange two
When posted with future date information
Then validate positive response code received from futuredate

Scenario: login page using data provider
Given API for login
When posted with multiple set of data 
Then validate positive response code received from login page