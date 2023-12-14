package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    /*
    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


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
    }*/

    private String day;
    private String answer;

    @Given("today is {string}")
    public void today_is(String today){
        this.day = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_wether_its_friday_yet(){
        this.answer = IsItFriday.isItFriday(this.day);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String normalAnswer) {
        assertEquals(normalAnswer, answer);
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        System.out.println(today);
        if("Friday".equals(today)) {
            return "TGIF";
        }
        return "no";
    }

}