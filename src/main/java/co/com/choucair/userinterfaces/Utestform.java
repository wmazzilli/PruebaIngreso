package co.com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Utestform  extends PageObject {
    public static final Target BUTTON_JOIN_TODAY = Target.the("Button to start the form").located(By.xpath("//a[contains(text(),'Join Today')]"));
    //Step1
    public static final Target INPUT_FIRST_NAME = Target.the("Place for writing the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Place for writing the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Place for writing the email").located(By.id("email"));
    public static final Target SELECT_MONTH_BIRTH = Target.the("Place to select the month of birth").located(By.id("birthMonth"));
    public static final Target SELECT_MONTH_BIRTH_OPTION = Target.the("Place to select the month of birth").located(By.xpath("//option[@label=\"March\"]"));
    public static final Target SELECT_DAY_BIRTH = Target.the("Place to select the day of birth").located(By.id("birthDay"));
    public static final Target SELECT_DAY_BIRTH_OPTION = Target.the("Place to select the day of birth").located(By.xpath("//option[@label=\"23\"]"));
    public static final Target SELECT_YEAR_BIRTH = Target.the("Place to select the year of birth").located(By.id("birthYear"));
    public static final Target SELECT_YEAR_BIRTH_OPTION = Target.the("Place to select the year of birth").located(By.xpath("//option[@label=\"1991\"]"));
    public static final Target TEXT_BOX_LANGUAGE_CLICK = Target.the("Place to select the language").located(By.xpath("//input[@type=\"search\"]"));
    public static final Target TEXT_BOX_LANGUAGE_SPANISH = Target.the("Place to select the language").located(By.xpath("//span[contains(text(),'Spanish')]"));
    public static final Target BUTTON_STEP_1 = Target.the("Button of the step number 1").located(By.xpath("//a[@role=\"button\"]"));
    //STEP#2
    public static final Target INPUT_CITY = Target.the("Place to select the city").located(By.id("city"));

    public static final Target SELECT_CITY = Target.the("select city").located(By.xpath("  (//div[@class=\"pac-item\"])[1]"));

    public static final Target INPUT_POSTAL_CODE = Target.the("Place to select the postal code").located(By.id("zip"));

    public static final Target BUTTON_STEP_2 = Target.the("Click in Botton Step number 2").located(By.xpath("(//a[@role=\"button\"])[1]"));
    //STEP #3
    public static final Target SELECT_MOBILE_DEVICE = Target.the("Click for mobile device").located(By.xpath("//span[@aria-label=\"Select Brand\"]"));
    public static final Target SELECT_MOBILE_DEVICE_OPTION = Target.the("Click for mobile device").located(By.xpath("//div[contains(text(),'Samsung')]"));
    public static final Target SELECT_MOBILE_MODEL = Target.the("Click for mobile model").located(By.xpath("//span[@aria-label=\"Select a Model\"]"));
    public static final Target SELECT_MOBILE_MODEL_OPTION = Target.the("Click for mobile model").located(By.xpath("//div[contains(text(),'SGH-i900')]"));
    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Click for Operating System").located(By.xpath("(//span[@aria-label=\"Select OS\"])[2]"));
    public static final Target SELECT_OPERATING_SYSTEM_OPTION = Target.the("Click for Operating System").located(By.xpath("//div[contains(text(),'Symbian OS 9.3')]"));
    //STEP4
    public static final Target INPUT_PASSWORD = Target.the("Input for writting the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input for writting the confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_BOX_ACCEPPT_TERMS_USE = Target.the("Accept the utest terms").located(By.xpath("(//input[@id=\"termOfUse\"]//following-sibling::span)[1]"));
    public static final Target CHECK_BOX_ACCEPPT_PRIVACY_POLICY = Target.the("Accept the the privacy and segurity policy").located(By.xpath("(//input[@id=\"privacySetting\"]//following-sibling::span)[1]"));
    public static final Target BOTTON_COMPLETE_SETUP = Target.the("Button for finish the form").located(By.id("laddaBtn"));

    public static final Target VALIDATION = Target.the("Validation of the registration in utest.com").located(By.xpath("//strong[contains(text(),'Participate in the uTest Academy')]"));
    public static final Target RECAPTCHA = Target.the("Validation of the rechatchat").located(By.id("f"));
    //button[contains(text(),'Omitir')]

}
