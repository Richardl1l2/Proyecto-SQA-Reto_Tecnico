package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipalUi {

    private PaginaPrincipalUi() {
        throw new IllegalStateException("Utility class");
    }
    public static final Target COMPRARPOPUP = Target.the("comprar, no").located(By.xpath("//*[contains(@class, 'pop-close-btn')]"));

    public static final Target NOTIFICACIONES = Target.the("notificaiones no").located(By.xpath("//div[@class='Sk1_X _1-SOk'][contains(.,'No permitir')]"));

    public static final Target TEXT_BUSCAR = Target.the("Ingresar datos sobre campo buscar").located(By.xpath("//input[contains(@class,'search--keyword--15P08Ji')]"));

    public static final Target BUSCAR = Target.the("click boton buscar").located(By.xpath("//input[contains(@class,'search--submit--2VTbd-T')]"));


}
