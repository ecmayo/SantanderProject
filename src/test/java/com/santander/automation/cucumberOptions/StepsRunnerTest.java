package com.santander.automation.cucumberOptions;


import org.junit.runner.RunWith;

import com.santander.automation.appium.DriverSingleton;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/santander/automation/features/test01-InformarNovoCalculo.feature", glue = {"com.santander.automation.stepDefinitions"})
public class StepsRunnerTest {
	
}
