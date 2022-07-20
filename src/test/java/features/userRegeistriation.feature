Feature: user Regeisteration
       I want to check that user can register in our e-commerce website

Scenario Outline: user Registeration
Given the user in the home page
When i click on register link
And i entered "<firstname>","<lastname>","<email>","<password>"
Then  the registeration page displayed successfully

Examples:
|firstname | lastname| email              |password|
|omar      | gomaa   |omarcucumer@test.com|12345678|
