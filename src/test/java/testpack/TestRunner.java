package testpack;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Training_C2a.05.01\\eclipse-workspace\\scenario2\\src\\resources\\java\\scenario2.feature",plugin= {"html:target\\Reports"}
		)
public class TestRunner {

}
