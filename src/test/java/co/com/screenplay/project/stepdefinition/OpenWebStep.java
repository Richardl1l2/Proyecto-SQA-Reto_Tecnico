package co.com.screenplay.project.stepdefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class OpenWebStep {


    @When("I go to {string}")
    public void i_go_to(String string) {

    }
    @Then("I should see the homepage title {string}")
    public void iShouldSeeTheHomepageTitle(String textValidation) {


    }

}