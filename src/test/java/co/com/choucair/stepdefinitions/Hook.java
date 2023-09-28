package co.com.choucair.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {
   @Before
    public void prepareTheActor(){
        OnStage.setTheStage(new OnlineCast());
    }

}
