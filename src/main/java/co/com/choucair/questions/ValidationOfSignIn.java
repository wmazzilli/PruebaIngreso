package co.com.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.userinterfaces.Utestform.INPUT_FIRST_NAME;

public class ValidationOfSignIn implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return INPUT_FIRST_NAME.resolveFor(actor).isVisible();
    }

    public static ValidationOfSignIn inUtest(){
        return new ValidationOfSignIn();
    }
}
