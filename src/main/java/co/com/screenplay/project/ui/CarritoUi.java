package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoUi {

    private CarritoUi() {
        throw new IllegalStateException("Utility class");
    }

    public static final Target CARRITO = Target.the("Revisar carrito").located(By.xpath("(//div[contains(.,'0Cesta0')])[7]"));

}
