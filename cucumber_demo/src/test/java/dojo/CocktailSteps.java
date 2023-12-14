package dojo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocktailSteps {

    private Order order;
    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String string) {
        order = new Order();
        order.declareOwner(string);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String string) {
        order.declareTarget(string);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_cocktails_in_the_order(int nb) {
        List<String> cocktails =  order.getCocktails();
        assertEquals(nb, cocktails.size());
    }

    @And("a message saying {string} is added")
    public void aMessageSayingIsAdded(String string) {
        if("Romeo".equals(order.getOwner()) && "Juliette".equals(order.getTarget()) ) {
            assertEquals("Wanna chat?", string);
        }
        else {
            assertEquals("Hei!", string );
        }
    }

    @Then("the ticket must say {string}")
    public void theTicketMustSay(String string) {
        if("Romeo".equals(order.getOwner()) && "Juliette".equals(order.getTarget()) ) {
            assertEquals("From Romeo to Juliette: Wanna chat?", string);
        }
        else {
            assertEquals("From Tom to Jerry: Hei!", string);
        }
    }
}