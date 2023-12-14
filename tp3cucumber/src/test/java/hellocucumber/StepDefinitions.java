package hellocucumber;

import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private int nTP;

    String content;

    File readme;

    @Given("I finished TP {int}")
    public void iFinishedTP(int tp) {
        this.nTP = tp;
    }

    @When("I have the readme file")
    public void iHaveTheReadmeFile() throws IOException {
        this.readme = new File("../README.adoc");
        this.content = FileUtils.readFileToString(this.readme, "UTF-8");
    }

    @Then("The picture should be in the readme")
    public void thePictureShouldBeInTheReadme() {
        String imageUrl = "images/tp"+ nTP + "_result.png";

        assertTrue(content.contains(imageUrl));
    }


}