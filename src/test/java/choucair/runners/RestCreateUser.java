package choucair.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/create_user.feature"},
        glue = {"choucair.stepdefinitions","choucair.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RestCreateUser {
}