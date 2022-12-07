package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllLoginSD {

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
    }
    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }
    @Then("I should reach to home page")
    public void i_should_reach_to_home_page() {
        System.out.println("I should reach to home page");
    }

    @When("I enter incorrect username and incorrect password")
    public void iEnterIncorrectUsernameAndIncorrectPassword() {

        System.out.println("I enter incorrect username and incorrect password");
    }


    @Then("I should get Error message")
    public void iShouldGetErrorMessage() {
        System.out.println("I should get Error message");
    }

    @When("I dont enter username and password")
    public void iDontEnterUsernameAndPassword() {
        System.out.println("I dont enter username and password");
    }

    @Then("I should get another Error message")
    public void iShouldGetAnotherErrorMessage() {
        System.out.println("I should get another Error message");
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }
}


