package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\hamed\\git\\CucumberProject\\CucumberProject\\src\\Features\\DataDriven.feature",
		glue= {"com.stepDefinition"},
		plugin= {"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\cucumber.json",
				"junit:Reports\\JUnitReport\\Cucumber.xml"}
			
		)

public class Runner {

}











