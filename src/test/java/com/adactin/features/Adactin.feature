Feature: Hotel Booking Exercise

Scenario: User wants to login  the application
	Given User launches the adactin application 
	When User enters the valid username 
	And User enters the valid password 
	Then User validates the username and password
	

Scenario: User wants to Search for hotels
    When User selects the hotel location
    And User selects the hotel
    And User selects the room type
    And User selects number of rooms
    And User clears the check-in date
	And User enters the check-in date
	And User clears the check-out date
	And User enters the check-out date
	And User enters adults per room
	And User enters children per room
	Then User clicks search 
	
	
Scenario: User wants to select the hotel
    When User selects the Hotel 
    Then User clicks continue
    
    
    Scenario: User wants to Book the hotel
    When User enters the first name
    And User enters the last name
    And User enters the billing address
    And user enters the credit card number
    And User selects the credit card type
    And User selects the expiry month
    And User selects the expiry year
    And User enters the cvv number
    Then User clicks book now
        
        
        
        
        
        
        
        
        
        
        
        
        
        