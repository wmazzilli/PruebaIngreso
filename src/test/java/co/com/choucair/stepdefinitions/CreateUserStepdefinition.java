package co.com.choucair.stepdefinitions;

import co.com.choucair.interactions.OpenPage;
import co.com.choucair.tasks.CreateUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreateUserStepdefinition {



    @When("The user completes the utest.com form")
    public void theUserCompletesTheUtestComForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateUser.inPageUtest()
        );
    }

    @Then("User click the complete setup button")
    public void userClickTheCompleteSetupButton() {

    }

}
