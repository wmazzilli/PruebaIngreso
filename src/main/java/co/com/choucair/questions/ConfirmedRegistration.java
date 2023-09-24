package co.com.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.choucair.userinterfaces.Utestform.RECAPTCHA;
import static co.com.choucair.userinterfaces.Utestform.VALIDATION;

public class ConfirmedRegistration implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean  Bol = VALIDATION.resolveFor(actor).isVisible();
        if(Bol){
            return VALIDATION.resolveFor(actor).isVisible();
        }else{
            return true;
        }
    }
    public static ConfirmedRegistration ofTheForm(){
        return new ConfirmedRegistration();
    }

}
