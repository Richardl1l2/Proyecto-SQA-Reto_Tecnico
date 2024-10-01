package co.com.screenplay.project.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.JavascriptExecutor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollTos implements Interaction {

    private final int xOffset;
    private final int yOffset;

    public ScrollTos(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) ThucydidesWebDriverSupport.getDriver();
        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xOffset, yOffset);
    }

    public static ScrollTos position(int xOffset, int yOffset) {
        return instrumented(ScrollTos.class, xOffset, yOffset);
    }
}
