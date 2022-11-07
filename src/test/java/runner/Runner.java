package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature/login.feature"}, glue="defination",tags = "@NegativeTesting",plugin= {"html:testoutput/Cucumber_casestudy.html"})
public class Runner  {
}