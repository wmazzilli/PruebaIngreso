  Feature: Join today to Utest.
           Verify that a user can successfully complete the registration process on the uTest.com page,
           ensuring that all their data is correct and complete.

    Background:
      Given The user must be on the main utest.com page


    Scenario: Press click on join today
      #Given The user must be on the main utest.com page
      When  The user clicks on join today
      Then  The user should start creating their account on utest.com


    Scenario: The user will create an account at utest.com
      #Given The user is in the account creation form
      When  The user enters their information in the account creation form
      Then  the user should start creating their account on utest.com
