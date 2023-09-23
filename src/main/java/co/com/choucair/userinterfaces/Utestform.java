package co.com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Utestform  extends PageObject {
    public static final Target BUTTON_JOIN_TODAY = Target.the("Button for start the form").located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("place for write the first name").located(By.id("firstName"));

}
