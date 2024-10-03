package co.com.screenplay.project.stepdefinition;


import co.com.screenplay.project.questions.ObtenerValorCampoTexto;
import co.com.screenplay.project.tasks.PaginaPrincipalTask;
import co.com.screenplay.project.tasks.TelevisoresPrecioUnitarioTask;
import co.com.screenplay.project.ui.TelevisoresPrecioUnitarioUi;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
public class ValidarPrecioUnitario {

    @When("Buscar en el navegador {string}")
    public void buscar_en_el_navegador(String articulo) {
        theActorInTheSpotlight().attemptsTo(
                PaginaPrincipalTask.enElCampoNombre(articulo),
                TelevisoresPrecioUnitarioTask.agregarCarrito());
        waiting(TIME_SHORT);
    }
    @Then("Validar precio unitario {string}")
    public void validar_precio_unitario(String valor2) {
        String valorunitario = theActorInTheSpotlight().asksFor(ObtenerValorCampoTexto.delCampo(TelevisoresPrecioUnitarioUi.CESTAPRELIMINAR));
        assertThat(valorunitario).isEqualTo(valor2);
        }
    }

