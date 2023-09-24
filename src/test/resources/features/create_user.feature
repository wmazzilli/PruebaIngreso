Feature: Join today to Utest.
  Verify that a user can successfully complete the registration process on the uTest.com page,
  ensuring that all their data is correct and complete.


  @CreateAccount
  Scenario: Create an account in utest
    Given The user must be on the main utest.com page
    When The user completes the utest.com form
    Then User click the complete setup button