package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.PaginaPrincipalUi;
import co.com.screenplay.project.ui.TelevisoresUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TelevisoresTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TelevisoresUi.AGREGARCARRITO),
                Click.on(TelevisoresUi.CANTIDADES),
                Click.on(TelevisoresUi.CANTIDADES),
                Click.on(TelevisoresUi.AGREGARCARRITO_CANTIDADES)


        );
    }

    public static TelevisoresTask agregarCarrito() {
        return Instrumented.instanceOf(TelevisoresTask.class).withProperties();
    }
}
