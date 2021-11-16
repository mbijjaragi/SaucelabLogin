@login
Feature: Sauce Login

  Scenario Outline: Valid Login
    Given I am on the Sauce Demo Login Page
    When I fill the account information for account "<username>" into the Username field and "<password>" into the Password field
    And I click the Login Button
    Then I am redirected to the Sauce Demo Main Page
    And I verify the App Logo exists    
    Examples:
    | username | password |
    | standard_user | secret_sauce |

  Scenario Outline: Invalid Login
    Given I am on the Sauce Demo Login Page
    When I fill the account information for account "<username>" into the Username field and "<password>" into the Password field
    And I click the Login Button
    Then I verify the Error Message contains the text "Sorry, this user has been banned."
    
    Examples:
    | username | password |
    | locked_out_user | secret_sauce |
    
