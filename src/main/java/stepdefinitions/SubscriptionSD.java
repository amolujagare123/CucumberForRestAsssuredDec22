package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionSD {

    @Given("I am on subscription page")
    public void i_am_on_subscription_page() {
        System.out.println("I am on subscription page");
    }

    @Then("user should be subscribed")
    public void user_should_be_subscribed() {
        System.out.println("user should be subscribed");
    }

   /* @When("I enter (.+) , (.+) , (.+)")
    public void i_enter_amol_amol_email_com(String name,String contact,String email) {
        System.out.println("name="+name);
        System.out.println("contact="+contact);
        System.out.println("email="+email);
    }*/

    @When("^I enter (.+) , (.+) , (.+)$")
    public void i_enter_(String name, String contact, String email) throws Throwable {
        System.out.println("name="+name);
        System.out.println("contact="+contact);
        System.out.println("email="+email);
    }
}
