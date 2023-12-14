package dojo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/dojo/resources", // Chemin vers les fichiers .feature
        glue = "dojo" // Chemin vers les step definitions (le package qui contient vos classes de définition de pas)
)
public class RunCucumberTest {

}