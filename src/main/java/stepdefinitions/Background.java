package stepdefinitions;

import io.cucumber.java.en.Given;

public class Background {

    @Given("I open browser")
    public void i_open_browser() {
        System.out.println("I open browser");
    }
    @Given("I maximize it")
    public void i_maximize_it() {
        System.out.println("I maximize it");
         }

}
