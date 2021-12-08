package TestRunner;
import  cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import  cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue ="stepDefinitions",
        dryRun = false,
        plugin = {"pretty",
        "html:test-output"}
)
public class TestRun {



}
