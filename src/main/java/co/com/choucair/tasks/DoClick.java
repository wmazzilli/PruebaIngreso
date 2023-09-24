package co.com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.userinterfaces.Utestform.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoClick implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(BUTTON_JOIN_TODAY)
        );
    }

    public static Performable inJoinToday(){
        return instrumented(DoClick.class);
    }
}
