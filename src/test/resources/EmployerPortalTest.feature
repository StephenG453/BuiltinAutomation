Feature: test functionality of the Employers portal on builtin.com

  Scenario: verification that the PostJobs button can be clicked and opens a new page
    Given builtin.com is loaded and home page is visible
    When user clicks post job button
    Then job post page is displayed
#    When get started button is pressed