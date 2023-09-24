  Feature: Join today to Utest.
           Verify that a user can successfully complete the registration process on the uTest.com page,
           ensuring that all their data is correct and complete.

      @ClickOnJoinToday
    Scenario: Press click on join today
        Given The user must be on the main utest.com page
        When  The user clicks on join today
        Then  The user should see the signup page on utest.com

