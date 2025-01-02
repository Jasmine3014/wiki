Feature: Download Article As PDF
  I am user
  I want to search for an article
  To be able download the article as pdf

Scenario: Download Article As PDF
  Then Homepage is displayed
  When I type "Albert Einstein"
  And I click the search button
  And I click Download as PDF button from tools menu
  And I click the Download button on download page
  Then I verify that the PDF file is downloaded
