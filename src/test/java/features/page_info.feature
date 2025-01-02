Feature: Page Information
  As a user,
  I want to search for an article,
  So that I can view its page information.

  Scenario: Page Information
    Then Homepage is displayed
    When I type "Bengal tiger"
    And I click the search button
    And I click Page information button from tools menu for view the article
    Then I verify that the information page of "Bengal tiger" is displayed
