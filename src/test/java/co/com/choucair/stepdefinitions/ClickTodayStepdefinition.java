package co.com.choucair.stepdefinitions;

import co.com.choucair.interactions.OpenPage;
import co.com.choucair.questions.ValidationOfSignIn;
import co.com.choucair.tasks.DoClick;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ClickTodayStepdefinition {



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
