package co.com.choucair.runners;


import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/create_user.feature",
        glue = "co.com.choucair.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CreateAccount"
)

public class CreateUserRunner {

}
