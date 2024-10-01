package co.com.screenplay.project.stepdefinition;


import co.com.screenplay.project.tasks.PaginaPrincipalTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


@Slf4j
public class AgregarAlCarrito {

    @When("I go to{string}")
    public void i_go_to(String articulo) {
        theActorInTheSpotlight().attemptsTo(PaginaPrincipalTask.enElCampoNombre(articulo));

    }
    @Then("I should see the homepage title {string}")
    public void iShouldSeeTheHomepageTitle(String textValidation) {


    }

}