package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {".//Features/Login.feature"},
                glue = "stepDefinitions",
                plugin = {"pretty",
                        "html:reports/myReport.html",
                        "html:reports/myReport.html",
                        "rerun:target/rerun.txt",
                },
                dryRun = true,
                monochrome = true,
                tags = "@sanity"
//                tags = "@regression"
        )
public class TestRunner {
}
