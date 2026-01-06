package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="C:\\Users\\Admin\\IdeaProjects\\Project1\\src\\test\\java\\features\\Data.feature",
        glue="stepsdef"
)
public class Runner extends AbstractTestNGCucumberTests {
}
