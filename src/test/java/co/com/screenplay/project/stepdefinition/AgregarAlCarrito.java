package co.com.screenplay.project.stepdefinition;


import co.com.screenplay.project.tasks.CarritoTask;
import co.com.screenplay.project.tasks.PaginaPrincipalTask;
import co.com.screenplay.project.tasks.TelevisoresTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


@Slf4j
public class AgregarAlCarrito {

    @When("I go to search {string}")
    public void I_go_to_search(String articulo) {
        theActorInTheSpotlight().attemptsTo(
                PaginaPrincipalTask.enElCampoNombre(articulo),
                TelevisoresTask.agregarCarrito()

        );


    }
    @Then("I should see the homepage title {string}")
    public void iShouldSeeTheHomepageTitle(String textValidation) {
        theActorInTheSpotlight().attemptsTo(
                CarritoTask.compararCarrito()
        );
    }

}