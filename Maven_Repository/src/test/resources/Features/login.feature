Feature: Validate sauce demo Application

  Scenario: Login with valid credentials in sauce demo Application
    Given Login to the browser
    And I navigate to url "https://www.saucedemo.com/"
    When Enter the username and password
    And click on signin button
    Then I naviagate to the home page
