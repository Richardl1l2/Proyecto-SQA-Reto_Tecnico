package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TelevisoresPrecioUnitarioUi {

    private TelevisoresPrecioUnitarioUi() {
        throw new IllegalStateException("Utility class");
    }
    public static final Target AGREGARCARRITO = Target.the("click en agregar carrito").located(By.xpath("(//span[contains(@class,'')])[90]"));
    public static final Target CANTIDADES = Target.the("agregar cantidades").located(By.xpath("//div[contains(@class, 'comet-v2-input-number-btn') and contains(@class, 'comet-v2-input-number-btn-increase')]"));

    public static final Target CESTAPRELIMINAR = Target.the("Capturar datos cestapreeliminar").located(By.xpath("//div[contains(@class,'price--current--H7sGzqb')]"));

}
