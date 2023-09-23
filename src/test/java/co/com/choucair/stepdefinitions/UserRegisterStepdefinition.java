package co.com.choucair.stepdefinitions;

import co.com.choucair.interactions.OpenPage;
import co.com.choucair.questions.ValidationOfSignIn;
import co.com.choucair.tasks.DoClick;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class UserRegisterStepdefinition {

    @Before
    public void prepareTheActor(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user must be on the main utest.com page")
    public void the_user_must_be_on_the_main_utest_com_page() {
        OnStage.theActorCalled("Mazzilli").wasAbleTo(
         OpenPage.theBrowser()
        );
    }
    @When("The user clicks on join today")
    public void the_user_clicks_on_join_today() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DoClick.inJoinToday()
        );
    }
    @Then("The user should see the signup page on utest.com")
    public void the_user_should_see_the_signup_page_on_utest_com() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                ValidationOfSignIn.inUtest()
        ));

    }

}
