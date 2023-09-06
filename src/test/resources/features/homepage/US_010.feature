Feature: As a user, I want the homepage to have a slider featuring pictures related to the school, and I would like the images to change at regular intervals.


  Scenario: TC_01 >> It should be verified that there is a slider on the homepage consisting of images. It should be confirmed that the images inside the slider change after a certain time on the screen. It should also be confirmed that the images can be manually changed

    * Open the browser and go to the "homePageUrl"
    * Verify that the slider is visible in the Home Page body section
    * Confirm that the images in the slider are visible
    * Ensure that the left scroll button is visible and active
    * Click on the left scroll button and confirm that the 5th image is visible
    * Ensure that the right scroll button is visible and active
    * Click on the right scroll button and confirm that the first image is visible
    * Close the browser