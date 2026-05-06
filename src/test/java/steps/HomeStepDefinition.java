package steps;

import io.cucumber.java.en.Then;
import pages.Tarea6MainPagePage;

public class HomeStepDefinition {
    private final Tarea6MainPagePage tarea6MainPagePage = new Tarea6MainPagePage();

    @Then("Deben aparecer los cuatro contenidos de home")
    public void validarPaginaHome() {
        tarea6MainPagePage.verifyAdditionals();
    }
}
