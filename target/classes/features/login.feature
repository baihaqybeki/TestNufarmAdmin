Feature: Login

  @ValidLogin
  Scenario: validate the positive functionality
    Given Start driver
    When navigate url to login
    And enter email "dev01@bestada.co.id"
    And enter password "SssOoo*01"
    And enter button
    And get current link login
  	Then to validate login move to page "http://34.101.70.83:5100/"
    
  @WrongPassword
  Scenario: validate the negative login functionality
    Given Start driver
    When navigate url to login
    And enter email "dev01@bestada.co.id"
    And enter password "SssOOO*01"
    And enter button
    And get current link login
    Then to validate login move to page "http://34.101.70.83:5100/auth/login"
    
    @WrongEmail
  	Scenario: validate the negative login functionality
    Given Start driver
    When navigate url to login
    And enter email "dev10@bestada.co.id"
    And enter password "SssOoo*01"
    And enter button
    And get current link login
    Then to validate login move to page "http://34.101.70.83:5100/auth/login"

    