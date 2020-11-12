Feature: Calculate the insurance prime of a customer
	
	Scenario Outline: The customer has or not a license
		Given a boolean value "<license>"
		When Calculate the premium
		Then the system show "<answer>"
		
	Examples:
	| license | answer |
	| true |  Not Valid Customer!! |
	| false |  Valid Customer!! |
	| anything else! | Not correct answer |