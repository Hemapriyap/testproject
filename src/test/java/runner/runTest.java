package runner;

	import org.junit.runner.RunWith; 
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class) 
	@CucumberOptions(
			features="C:\\Users\\admin\\git\\cucumber_Demo\\marchcucumber\\src\\test\\java\\Feature\\outline.feature",
			glue= {"marchcucumber"},
			plugin = {
			"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
			"pretty", "html:target/cucumber", "json:target/cucumber.json"})

	public class runTest { 
		
	}

