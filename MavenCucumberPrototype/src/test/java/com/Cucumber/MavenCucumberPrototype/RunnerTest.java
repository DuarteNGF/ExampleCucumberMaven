package com.Cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty","html:target/html"},
		format = {"pretty","json:target/json", "html:target/html"},
		features = {"src/test/resource"},
		tags = {"@Smile"}
		)
public class RunnerTest {
	
}
