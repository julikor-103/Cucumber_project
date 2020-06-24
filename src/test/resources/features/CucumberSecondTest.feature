Feature: cucumber second Test

  @cucumber

  Scenario: Go to search by key word
    Given Google search page is opened
    When Searches with text
    And Open url by name
    And Input in search field dress
    And Press button Search
    Then Display menu item

