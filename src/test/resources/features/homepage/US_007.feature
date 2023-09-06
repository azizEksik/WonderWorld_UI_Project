Feature: As a user, I want a "Gallery" page on the website to have access to more visuals and pictures related to the school.


  Scenario: TC_01 >> When clicking 'Gallery' on the homepage, verify redirection to the 'Gallery' page. On the Gallery page, check headings: Art&Music, Campus, Activities, Pre Primary, Classrooms, Sports, and ensure board clicks lead to respective pages

    * Open the browser and go to the "homePageUrl"
    * Click on the Gallery link in the top bar of the homepage
    * Confirm that the page title is "galleryPageTitle"
    * Verify that the first image's title is "galleryPageFirstImageTitle" and when clicked, it redirects to a page with the title "artMusicPageTitle"
    * Confirm that the second image's title is "galleryPageSecondImageTitle" and when clicked, it redirects to a page with the title "campusPageTitle"
    * Verify that the third image's title is "galleryPageThirdImageTitle" and when clicked, it redirects to a page with the title "activitiesPageTitle"
    * Confirm that the fourth image's title is "galleryPageFourthImageTitle" and when clicked, it redirects to a page with the title "prePrimaryPageTitle"
    * Verify that the fifth image's title is "galleryPageFifthImageTitle" and when clicked, it redirects to a page with the title "classroomsPageTitle"
    * Confirm that the sixth image's title is "galleryPageSixthImageTitle" and when clicked, it redirects to a page with the title "sportsPageTitle"
    * Close the browser