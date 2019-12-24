package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java\\Window7\\First\\flipkart\\src\\test\\resources\\Feature_File\\FlipKart1.feature", 
tags = {}, 
monochrome = true, 
glue = "stepDefinition", 
dryRun = false, 
plugin = {"html:target" })

public class TestRunner 
{

}
