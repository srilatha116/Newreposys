/**
 * @author Srilatha
 */
package cucumber;

import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;

/**
 * @author srilata
 *
 */


@Runwith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\src\\cucumber\\Login.Feature",
		glue= {"cucumberPackage"},
		tags= {"tag1"},
		dryRun=true, monochrome=false)


public class Runnerpage  {
}
