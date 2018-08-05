Feature: Perform integrated tests on the Avengers registration API

Background:
* url 'https://www.marvel.com/'

Scenario: Get Avenger by Id

Given path 'avengers'
When method get
Then status 200