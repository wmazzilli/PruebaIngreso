package co.com.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/utest.feature",
        glue = "co.com.choucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class UserRegisterRunner {
}
