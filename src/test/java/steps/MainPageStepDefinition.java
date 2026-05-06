package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Tarea6MainPagePage;
import utilities.CommonFlows;

public class MainPageStepDefinition {
    private final CommonFlows commonFlows = new CommonFlows();
    private final Tarea6MainPagePage tarea6MainPagePage = new Tarea6MainPagePage();

    @Given("El usuario visualiza el Main Page")
    public void goToMainPage() {
        commonFlows.goToMainPage();
    }

    @Then("Deben aparecer las pestañas Home, Webview, Login, Forms, Swipe y Drag")
    public void validarPestañasdeMain() {
        tarea6MainPagePage.verifyAdditionals();
    }
}
