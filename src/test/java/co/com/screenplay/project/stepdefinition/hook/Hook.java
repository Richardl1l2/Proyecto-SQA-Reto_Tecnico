package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hooks.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;


public class Hook {
    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} I open the browser")
    public void iOpenTheBrowser(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.browserURL()
        );

        waiting(TIME_SHORT);

    }
}
