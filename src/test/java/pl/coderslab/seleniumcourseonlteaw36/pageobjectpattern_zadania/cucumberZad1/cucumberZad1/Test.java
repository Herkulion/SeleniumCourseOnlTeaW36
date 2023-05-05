package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.cucumberZad1.cucumberZad1;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/Hotel.feature",
        plugin = {"pretty", "html:out"})

public class Test {
}
