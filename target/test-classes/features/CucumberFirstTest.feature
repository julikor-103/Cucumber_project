Feature: cucumber first test

  @cucumber
  Scenario: Google search Page
    Given Google Search page is opened
    When User searches with text
    And User clicks on the search link
    Then automationpractice website is opened

