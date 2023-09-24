package co.com.choucair.stepdefinitions;

import co.com.choucair.interactions.OpenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {
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
}
