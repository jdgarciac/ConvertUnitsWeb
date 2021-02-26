package jgarcia.retoweb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/convertirUnidades.feature",
        glue = "jgarcia.retoweb.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@convert_area"
)

public class RunnerTags {
}
