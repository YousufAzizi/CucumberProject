package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/hamed/eclipse-workspace/recovered/CucumberProject/src/Features/LoginFeature.feature",
		glue= {"com.stepDefinition"},
		plugin= {"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\cucumber.json",
				"junit:Reports\\JUnitReport\\Cucumber.xml"}
			
		)

public class Runner {

}











