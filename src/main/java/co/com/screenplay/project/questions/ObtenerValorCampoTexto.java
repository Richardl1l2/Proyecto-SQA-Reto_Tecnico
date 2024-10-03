package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerValorCampoTexto implements Question<String> {

    private final Target target;

    public ObtenerValorCampoTexto(Target target) {
        this.target = target;
    }


    public static ObtenerValorCampoTexto delCampo(Target target) {
        return new ObtenerValorCampoTexto(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        String textoCompleto = target.resolveFor(actor).getText();

        // Extraer solo el valor monetario (COP)
        // Utilizamos una expresión regular para capturar valores como 'COP1,144,288.35'
        String valorCop2 = textoCompleto.replaceAll("[^0-9,\\.]", "");

        return valorCop2;
    }
}
