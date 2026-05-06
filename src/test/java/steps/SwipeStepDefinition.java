package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tarea6SwipePage;
import utilities.CommonFlows;

public class SwipeStepDefinition {
    private final CommonFlows commonFlows = new CommonFlows();
    private final Tarea6SwipePage tarea6SwipePage = new Tarea6SwipePage();

    @When("El usuario selecciona la opcion swipe")
    public void goToSwipePage() {
        commonFlows.gotoSwipePage();
    }

    @Then("Verificar los inputs de la pestaña swipe")
    public void verifyPage() {
        tarea6SwipePage.verifyPage();
    }

    @Then("Verificar titulo support videos")
    public void verificarTituloSupportVideos() {
        tarea6SwipePage.swipeHorizontalDeraIzq();
    }

    @Then("Verificar you found me")
    public void verificarYouFoundMe() {
        tarea6SwipePage.swipeVerticalAbajoArr();
    }
}
