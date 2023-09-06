Feature: [US_028] As an administrator (admin), I want to add new sources of income to the system to increase school revenues.

@28-1
  Scenario: [TC_01 --> US_028]  In the admin panel's sidebar, under the "Income" menu, the "Add Income" page link should be displayed,
            when clicking the "Save" button, a new Income record should be created..

    Given Go to Url "adminLoginUrl"
    Then Login as admin
    And In the admin panel's sidebar,click Income link
    Then verifies that Add Income link is displayed and Click Add Income link
    And Verifies that Income Head dropdown menu, Name, Invoice Number, Date, Amount, and Description are displayed
    And Verifies that the allowed the uploading of documents
  Then Verifies that when clicking the Save button, a new Income record should be created
    And Close the page


@28-2

  Scenario: [TC_02 --> US_028] The "Income List" section should display columns: Name, Description, Invoice Number,
            Date, Income Head, and Amount(*),have a search box,The number of records should be changeable (e.g., 100/all).

    Given Go to Url "adminLoginUrl"
    Then Login as admin
    And In the admin panel's sidebar,click Income link
    Then verifies that Add Income link is displayed and Click Add Income link
    Then Verifies that the Income List section should display columns: Name, Description, Invoice Number, Date, Income Head, and Amount
    And Verifies that The Income List section should have a search box to enable searching for specific data
    And Verifies that The number of records displayed on one page in the Income List section should be changeable
    And Close the page

