package co.com.choucair.interactions;

import co.com.choucair.userinterfaces.Utestform;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Interaction {

    Utestform utestform;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(utestform)
        );
    }

    public static Performable theBrowser(){
        return instrumented(OpenPage.class);
    }

}
