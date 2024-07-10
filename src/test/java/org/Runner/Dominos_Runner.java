package org.Runner;

import org.Base_class.Base_ClassDominos;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//org//Feature//Dominos.feature",glue ="org.StepDefinition",
monochrome = true,dryRun = false)

public class Dominos_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void start()
	{
	driver =Base_ClassDominos.launch_browser();
	driver.manage().window().maximize();
	}
	
   // @AfterClass
    public static void End()
   {
    	driver.quit();
   }
	


}