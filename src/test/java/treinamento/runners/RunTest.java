package treinamento.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"treinamento.steps", "treinamento.setup"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@Logar"})
public class RunTest {

}
