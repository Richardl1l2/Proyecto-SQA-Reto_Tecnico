package co.com.screenplay.project.stepdefinition;


import co.com.screenplay.project.hooks.OpenWeb;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



@Slf4j
public class OpenWebStep {


    @When("I go to {string}")
    public void i_go_to(String string) {

    }
    @Then("I should see the homepage title {string}")
    public void iShouldSeeTheHomepageTitle(String textValidation) {
        OpenWeb.browserURL();


    }

}