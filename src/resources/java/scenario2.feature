Feature: Login Functionality
Scenario Outline: Login Functionality

Given User must be registered
When login using username "<username>" and password "<password>"
Then user shoild be in Home page

	Examples:
				| username | password |
				| AlexUser | Alex@123 |

