package co.com.choucair.tasks;

import co.com.choucair.helpers.DataGenerator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.userinterfaces.Utestform.*;
import static co.com.choucair.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.MoveMouse.*;

public class CreateUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(BUTTON_JOIN_TODAY),
                Enter.theValue(NAME).into(INPUT_FIRST_NAME),
                Enter.theValue(LASTNAME).into(INPUT_LAST_NAME),
                Enter.theValue(EMAIL).into(INPUT_EMAIL),
                Click.on(SELECT_MONTH_BIRTH),
                Click.on(SELECT_MONTH_BIRTH_OPTION),
                Click.on(SELECT_DAY_BIRTH),
                Click.on(SELECT_DAY_BIRTH_OPTION),
                Click.on(SELECT_YEAR_BIRTH),
                Click.on(SELECT_YEAR_BIRTH_OPTION),
                Click.on(TEXT_BOX_LANGUAGE_CLICK),
                Enter.theValue(LENGUAGE).into(TEXT_BOX_LANGUAGE_CLICK),
                Click.on(TEXT_BOX_LANGUAGE_SPANISH),
                Click.on(BUTTON_STEP_1),
                Enter.theValue(CITY).into(INPUT_CITY),
                MoveMouse.to(SELECT_CITY).andThen(actions -> actions.click()),
                WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(ZIP_CODE).into(INPUT_POSTAL_CODE),
                Click.on(BUTTON_STEP_2),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(SELECT_MOBILE_DEVICE),
                MoveMouse.to(SELECT_MOBILE_DEVICE_OPTION).andThen(actions -> actions.click()),
                Click.on(SELECT_MOBILE_MODEL),
                WaitUntil.angularRequestsHaveFinished(),
                MoveMouse.to(SELECT_MOBILE_MODEL_OPTION).andThen(actions -> actions.click()),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(SELECT_OPERATING_SYSTEM),
                MoveMouse.to(SELECT_OPERATING_SYSTEM_OPTION).andThen(actions -> actions.click()),
                Click.on(BUTTON_STEP_2),
                WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(PASSWORD).into(INPUT_PASSWORD),
                Enter.theValue(PASSWORD).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_BOX_ACCEPPT_TERMS_USE),
                Click.on(CHECK_BOX_ACCEPPT_PRIVACY_POLICY),
                Click.on(BOTTON_COMPLETE_SETUP)
                );
    }

    public static Performable inPageUtest(){
        return instrumented(CreateUser.class);
    }
}
