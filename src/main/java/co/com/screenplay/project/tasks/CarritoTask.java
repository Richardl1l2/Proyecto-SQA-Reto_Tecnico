package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.CarritoUi;
import co.com.screenplay.project.ui.PaginaPrincipalUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoUi.CARRITO)
        );
    }
    public static CarritoTask compararCarrito() {
        return Instrumented.instanceOf(CarritoTask.class).withProperties();
    }
}
