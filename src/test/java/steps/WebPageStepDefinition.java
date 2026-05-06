package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tarea6MainPagePage;
import pages.Tarea6WebViewPage;

public class WebPageStepDefinition {
    Tarea6MainPagePage tarea6MainPagePage = new Tarea6MainPagePage();
    Tarea6WebViewPage tarea6WebViewPage = new Tarea6WebViewPage();

    @When("El usuario selecciona la opcion Web")
    public void goToWebPage() {
        tarea6MainPagePage.clickWebViewButton();
    }

    @Then("Verificar los elementos en la pagina web")
    public void verifyElements() {
        tarea6WebViewPage.waitPageToLoad();
        tarea6WebViewPage.verifyPage();
    }
}
