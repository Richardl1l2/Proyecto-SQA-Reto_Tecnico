package co.com.screenplay.project.stepdefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class OpenWebStep {


    @When("el {string} navega al menú de productos")
    public void el_navega_al_menú_de_productos(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("elige el artículo {string}")
    public void elige_el_artículo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("agrega el artículo al carrito")
    public void agrega_el_artículo_al_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("el {string} se ubica en el carrito de compras")
    public void el_se_ubica_en_el_carrito_de_compras(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("valida que el artículo en el carrito sea {string}")
    public void valida_que_el_artículo_en_el_carrito_sea(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}