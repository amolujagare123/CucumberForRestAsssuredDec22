package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {


    @Before("@userReg")
    public void beforeMyScenario()
    {
        System.out.println("********* Before scenario *********");
    }

    @After("@userReg")
    public void afterMyScenario()
    {
        System.out.println("********* After scenario *********");
    }
}
