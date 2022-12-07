Feature:  All login page scenarios

  Background: before every scenario
    Given I open browser
    And I maximize it

  @valid @login
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
   # When I enter correct username and correct password
    When I enter "admin" and "admin123"
    And I click on login button
    Then I should reach to home page


    @invalid @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
 #   When I enter incorrect username and incorrect password
      When I enter "xyz" and "abc"
    And I click on login button
    Then I should get Error message

  @blank @login
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
 #   When I dont enter username and password
    When I enter "" and ""
    And I click on login button
    Then I should get another Error message


    @userReg
    Scenario: to test the functionality of submit button for valid data
      Given I am on user registration page
      When I enter below data
      | amol | ujagare | 77878787 | amol@gmail.com |
      Then  user should be added


    @subscription
    Scenario Outline: to test the functionality of subscribe button for valid data
      Given I am on subscription page
      When I enter <name> , <contact> , <email>
      Then  user should be subscribed
      Examples:
        | name    | contact | email             |
        | amol    | 323232  | amol@email.com    |
        | pradeep | 454545  | pradeep@email.com |
        | pramod  | 1414144 | pramod@email.com  |
        | balu    | 1443434 | balu@email.com    |
