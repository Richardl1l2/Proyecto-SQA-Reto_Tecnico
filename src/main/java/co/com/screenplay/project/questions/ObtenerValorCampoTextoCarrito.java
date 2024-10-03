package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerValorCampoTextoCarrito implements Question<String> {

    private final Target target;

    public ObtenerValorCampoTextoCarrito(Target target) {
        this.target = target;
    }


    public static ObtenerValorCampoTextoCarrito delCampo(Target target) {
        return new ObtenerValorCampoTextoCarrito(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        String textoCompleto = target.resolveFor(actor).getText();

        // Extraer solo el valor monetario (COP)
        // Utilizamos una expresión regular para capturar valores como 'COP1,144,288.35'
        String valorCop1 = textoCompleto.replaceAll("[^0-9,\\.]", "");

        return valorCop1;
    }
}
