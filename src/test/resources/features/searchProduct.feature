@Something
Feature: Search feature for Altex
  Scenario: Check if search bar works
    Given An user goes to Altex main page
    When The user inserts televizor in the search bar
    When The user presses the search button
    Then A search list will be populated