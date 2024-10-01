package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TelevisoresUi {

    private TelevisoresUi() {
        throw new IllegalStateException("Utility class");
    }
    public static final Target AGREGARCARRITO = Target.the("click en agregar carrito").located(By.xpath("(//span[contains(@class,'')])[90]"));
    public static final Target CANTIDADES = Target.the("agregar cantidades").located(By.xpath("//div[contains(@class, 'comet-v2-input-number-btn') and contains(@class, 'comet-v2-input-number-btn-increase')]"));
    public static final Target AGREGARCARRITO_CANTIDADES = Target.the("click en añadir a la cesta").located(By.xpath("//span[contains(.,'Añadir a la cesta')]"));

}
