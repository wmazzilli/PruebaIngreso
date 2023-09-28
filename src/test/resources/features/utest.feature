  Feature: Join today to Utest.
           Press click on join today


    Background:
      Given The user must be on the main utest.com page

      @ClickOnJoinToday
    Scenario: Press click on join today
        When  The user clicks on join today
        Then  The user should see the signup page on utest.com

