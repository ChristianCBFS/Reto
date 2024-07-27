import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/site/result.json"},
        features = "src/test/resources/features",
        tags = "@"
)
public class Runner {

   // @RunBefore
    public static void previo() {

    }
}
