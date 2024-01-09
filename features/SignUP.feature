Feature: phptravels End to End to test case 

Scenario Outline: User able to sign up phptravels application 
	Given User able to  launch the phptravels application 
	When User enter the '<firstname>'  firstname in Sign Up Page 
	And User enter the '<lastname>'  lastname in Sign Up Page 
	And User select  the '<country>' dropdown in Sign Up Page 
	And User enter the '<phone>' phone  in Sign Up Page 
	And User enter the '<email>' emailaddress in Sign Up Page 
	And User enter the '<password>' password in Sign Up Page 
	And User Click the capcha Button  in Sign Up Page 
	And User Click the Sign Up Button  in Sign Up Page 
	Then User Verify the user is naviogated to signup success page with 'Your account has been created' displayed in the header 
	
	
	Examples: 
		|firstname	|lastname	|country|email|password|phone|country|
		|kumanan	|ragupathy	|india|	kr@gmail.com|12345|987665534|india|
		
Scenario Outline: Flight booking functionality 
	Given user able to successfully booking confirmation 
	When  user Perform a flight search by entering  '<flying from>' and '<destination>' 
	And  user select the calender in '<depart date>' 
	And user clicks on the search button 
	Then user able to see the search results 
	When user enters the passenger name 
	And user enters the passenger email 
	Then user booking confirmation is displayed 
	
