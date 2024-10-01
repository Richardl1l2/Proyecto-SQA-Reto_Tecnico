package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.PaginaPrincipalUi;
import co.com.screenplay.project.utils.ScrollTos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaPrincipalTask implements Task {
    private final String texto;

    public PaginaPrincipalTask(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipalUi.COMPRARPOPUP),
                Click.on(PaginaPrincipalUi.NOTIFICACIONES),
                Enter.theValue(texto).into(PaginaPrincipalUi.TEXT_BUSCAR),
                Click.on(PaginaPrincipalUi.BUSCAR)
        );
    }
    public static PaginaPrincipalTask enElCampoNombre(String texto) {
        return instrumented(PaginaPrincipalTask.class, texto);
    }
}
