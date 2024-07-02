Feature: Appointment schedule

  Scenario: set an appointment
    Given user is on a home page
    Then user clicks Schedule an appointment link
    Then user clicks on Everyday banking module
    And user select the option Open a new account and clicks next button
    And user clicks on Search be zip code tab
    And user enters zip code "18974" in a search line and clicks Find locations button
    Then user selects the first location from the list and confirmes the selection by clicking yes button
    And user selects the fist specialist from the list
    And user selects the fisrt available date "27"
    And user selects the fisrt available time "10:00 AM" and clicks next
    Then user can see "Continue without signing in" option


