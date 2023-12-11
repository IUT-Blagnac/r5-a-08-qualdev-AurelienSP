package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    private String day;
    private String answer;

    @Given("It is Sunday")
    public void it_is_sunday(){
        this.day = "Sunday";
    }

    @When("I ask if it is Friday")
    public void i_ask_if_it_is_friday(){
        this.answer = IsItFriday.isItFriday(day);
    }

    @Then("I should get a {string}")
    public void i_should_get_a(String normalAnswer) {
        assertEquals(normalAnswer, answer);
    }


}

class IsItFriday {
    static String isItFriday(String today) {
        return "no";
    }

}