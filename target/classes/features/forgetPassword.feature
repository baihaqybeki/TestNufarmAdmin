Feature: Forget Password

  @ValidEmail
  Scenario: validate the positive functionality
    Given Start driver for forgetpassword
    When navigate url to forgetpassword
    And enter email in forgetpassword "muhammadbaihaqy98@gmail.com"
    And enter button in forgetpassword
    
  @WrongEmail
  Scenario: validate the positive functionality
    Given Start driver for forgetpassword
    When navigate url to forgetpassword
    And enter email in forgetpassword "muhammadbaihaqy89@gmail.com"
    And enter button in forgetpassword