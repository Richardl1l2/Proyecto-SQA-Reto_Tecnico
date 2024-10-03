package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.TelevisoresPrecioUnitarioUi;
import co.com.screenplay.project.ui.TelevisoresUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;

public class TelevisoresPrecioUnitarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TelevisoresPrecioUnitarioUi.AGREGARCARRITO),
                Click.on(TelevisoresPrecioUnitarioUi.CANTIDADES),
                Click.on(TelevisoresPrecioUnitarioUi.CANTIDADES)
        );
        waiting(TIME_SHORT);
    }

    public static TelevisoresPrecioUnitarioTask agregarCarrito() {
        return Instrumented.instanceOf(TelevisoresPrecioUnitarioTask.class).withProperties();
    }
}
