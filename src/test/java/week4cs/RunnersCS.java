package week4cs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\CSweek4\\CSfeature\\Registration.feature",glue="week4cs",tags= {"@Smoke"},plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class RunnersCS {

}



