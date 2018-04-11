package testRunner;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\SK\\wipro\\MavenEclipseProject\\features",glue={"stepDefination"},
plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true)
public class Runner {

}
