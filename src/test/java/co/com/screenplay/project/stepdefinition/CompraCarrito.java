package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ObtenerValorCampoTexto;
import co.com.screenplay.project.questions.ObtenerValorCampoTextoCarrito;
import co.com.screenplay.project.tasks.PaginaPrincipalTask;
import co.com.screenplay.project.tasks.TelevisoresTask;
import co.com.screenplay.project.ui.CarritoUi;
import co.com.screenplay.project.ui.TelevisoresPrecioUnitarioUi;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
public class CompraCarrito {

    @When("busca el artículo {string} y agrega el artículo al carrito")
    public void buscaElArdsadsatículoyagregaelartículoalcarrito(String articulo) {
        theActorInTheSpotlight().attemptsTo(
                PaginaPrincipalTask.enElCampoNombre(articulo),
                TelevisoresTask.agregarCarrito()
        );
        waiting(TIME_SHORT);
    }
    @Then("el valor final del carrito debería ser {string}")
    public void elValorFinalDelCarritoDeberíaSer(String valor1) {
       /* theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CarritoUi.CARRITO, isVisible()).forNoMoreThan(10).seconds()

        );*/
        String valorcarrito = theActorInTheSpotlight().asksFor(ObtenerValorCampoTextoCarrito.delCampo(CarritoUi.CARRITO));
        assertThat(valorcarrito).isEqualTo(valor1);
    }
}

