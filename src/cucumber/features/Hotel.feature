Feature: Sign In Hotel Testlab



#  Scenario: Succesful sign in
#
#    Given Page "https://hotel-testlab.coderslab.pl/en/" opened in browser
#    And Button Sign in clicked
#    And Email "ssss@sss.ss" written in input
#    And Button Create an account opened
#    When Filled the survey with First Name "Jan" and Last Name "Sobieski" and password "jakieshaslo123"
#    And Clicked button Register
#    Then You are signed in in Hotel TestLab

  Scenario: Add new Address
    Given Page "https://hotel-testlab.coderslab.pl/en/" opened in browser
    And Button Sign in clicked
    And Logged with Email "sss@sss.ss" and password "jakieshaslo123"
    When Button My Addresses clicked
    And button add a new address clicked
    And Address "kickiego 27" filled
    And Zip/Postal Code "05-367" filled
    And City "Warszawa" filled
    And Country "Poland" filled
    And Mobile phone "500500500" filled
    And address title "inny adres" filled
    And Button Save clicked
    Then New address is created



