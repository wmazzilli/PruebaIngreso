package co.com.choucair.tasks.factories;

import co.com.choucair.tasks.CreateUser;
import co.com.choucair.tasks.DoClick;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOut {

    private FillOut() {
    }

    public static Performable inTheBottonToday(){
        return instrumented(DoClick.class);
    }

    public static Performable theFormOfUtest(){
        return instrumented(CreateUser.class);
    }


}


