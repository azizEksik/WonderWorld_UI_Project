
  Feature: Verify that the OUR EXPERIENCED STAFF section is visible on the homepage.

    Scenario: Verify that the OUR EXPERIENCED STAFF section is visible.

      Given  Launch browser and Navigate to "homePageUrl"
      Then The visibility of the OUR EXPERIENCED STAFFS section is verified
      Then Confirmed to be named "Anthony Carter", "Ava Turner", "Davidson Morgan", "Lily Peterson"
      And  Browser is closed.

