package co.falabella.com.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/AgregarProducto.feature",
        glue = "co.falabella.com.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AgregarProductoRunners {
}
