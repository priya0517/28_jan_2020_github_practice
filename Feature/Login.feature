Feature: Login Action

Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn page
    And User enters Username and Password
    Then Message displayed Login Successfully
    
Scenario: Successful Logout
    When User Logout from the Application
    Then Message displayed Logout Successfully