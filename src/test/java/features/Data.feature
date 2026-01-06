Feature: to check functionality of Swag lab
  Scenario S3: valid valid details of swag lab
    Given User is on login page
    When user enter username "standard_user"
    And user enter password "secret_sauce"
    Then User enter next page and text "Swag Labs" should be compared