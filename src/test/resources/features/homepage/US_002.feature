
Feature: [US_002] As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.


  Scenario: [TC_01] Verify scrolling Latest News text on the top bar, visibility of logo & menu titles
  (Home, Online Admission, Exam Result, About Us, Academics, Course, Gallery, News, Contact), their redirections, and homepage refresh on logo click.
    * Open the browser and go to the "homePageUrl"
    * It is verified that Latest News information is visible in the form of scrolling text on the top bar of the homepage.
    * It is verified that the site logo and menu titles are visible on the top bar
    * Clicking on the site logo verifies that the home page refreshes
    * Click on the Home button and verify that it redirects to the relevant page
    * Click on the Online Admission button and verify that it redirects to the relevant page
    * Click on the Exam Result button and verify that it redirects to the relevant page
    * Click the About Us button and verify that it redirects to the relevant page
    * Click on the Course button and verify that it redirects to the relevant page
    * Click the Gallery button and verify that it redirects to the relevant page
    * Click on the News button and verify that it redirects to the relevant page
    * Click the Contact button and verify that it redirects to the relevant page
    * Close the browser


  Scenario: [TC_02] Verify Academics dropdown menu on the top bar of the home page with pages: Facilities, School Uniform,
  Principal Message, Know Us, Approach, Teacher, Houses & Mentoring, Student Council. Check redirection on click.
    * Open the browser and go to the "homePageUrl"
    * Academics drop down menu opens in the headings on the top bar of the homepage
    * Verify that the menu contains Facilities, School Uniform, Principal Message, Know Us, Approach, Teacher, Houses & Mentoring, Student Council pages
    * Click on the Facilities button and verify that it redirects to the relevant page
    * Click on the School Uniform button and verify that it redirects to the relevant page
    * Click on the Principal Message button and verify that it redirects to the relevant page
    * Click on the Know Us button and verify that it redirects to the relevant page
    * Click the Approach button and verify that it redirects to the relevant page
    * Click on the Teacher button and verify that it redirects to the relevant page
    * Click on the Houses & Mentoring button and verify that it redirects to the relevant page
    * Click on the Student Council button and verify that it redirects to the relevant page
    * Close the browser