Feature: to check functionality of Swaglab

  Background:
    Given User is on login page
    When user enter username "standard_user"

   Scenario S4: valide valid details of swaglab
     And user enter password "secret_sauce"
    Then User enter next page and text "Swag Labs" should be compared


  Scenario S5: valide invalid details of swaglab
    And user enter password "secret_sauce"
    Then User enter next page and text "Swag Labs" should be compared