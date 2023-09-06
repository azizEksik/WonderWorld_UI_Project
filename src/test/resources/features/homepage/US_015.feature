Feature: US_015 As a user, I want to see comments from users who have made comments about the school on the homepage.

@15
  Scenario: TC_01 It should be verified that the "WHAT PEOPLE SAY" section is present on the homepage and
            there are testimonials or comments from different individuals.

    Given Go to Url "homePageUrl"
    Then Press the Pagedown key to move to the bottom of the page
    Then Verifies that the text whatPeapleSays is visible
    Then Verifies that there are different reviews from different users
    And Close the page