Feature: Qwant phrase search
  Scenario: Succesful phrase search
    Given Page "htttps://www.qwant.com" opened in browser
    When Phrase "Szkice piórkiem" entered in search input box
    And Search button clicked
    Then first 3 results link texts contain phrase "Szkice piórkiem"