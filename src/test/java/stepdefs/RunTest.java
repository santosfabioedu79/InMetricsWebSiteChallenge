package stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resource"},
        plugin = {"pretty", "html:src/test/StatusReport/report.html"},
        dryRun = false,
        strict = false,
        tags = {"@Executar"}
)

public class RunTest {
}
