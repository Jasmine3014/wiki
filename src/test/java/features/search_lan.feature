Feature: Search Language
  I am user
  I want to search for an article
  Able to view the article in a specific language

  Scenario: Search Language
    Then Homepage is displayed
    When I type "Gabriel García Márquez"
    And I change the language to "SPANISH"
    And I click the search button
    Then I verify that "Gabriel García Márquez" Article is displayed
