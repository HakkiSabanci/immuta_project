package com.immuta.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "timeline:target/timeline-report"
        },
        features = {"src/test/resources/features/"},
        glue = "com/immuta/step_definitions",
        dryRun = false,
        tags = "@policies",
        publish = false
)
public class CucumberRunner {
}
