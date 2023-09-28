package co.com.choucair.stepdefinitions;

import co.com.choucair.interactions.OpenPage;
import co.com.choucair.models.builder.PersonalInformationBuilder;
import co.com.choucair.questions.ConfirmedRegistration;
import co.com.choucair.tasks.CreateUser;
import co.com.choucair.tasks.factories.FillOut;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreateUserStepdefinition {


    @Given("The user must be on the main utest.com page")
    public void the_user_must_be_on_the_main_utest_com_page() {
        OnStage.theActorCalled(PersonalInformationBuilder.with().withInformation().getLastName()).wasAbleTo(
                OpenPage.theBrowser()
        );
    }

    @When("The user completes the utest.com form")
    public void theUserCompletesTheUtestComForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillOut.theFormOfUtest()
        );
    }

    @Then("User click the complete setup button")
    public void userClickTheCompleteSetupButton() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        ConfirmedRegistration.ofTheForm()
                )
        );
    }

}
