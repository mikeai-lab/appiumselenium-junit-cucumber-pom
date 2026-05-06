package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tarea6DragDropPage;
import utilities.CommonFlows;

public class DragStepDefinition {
    private final CommonFlows commonFlows = new CommonFlows();
    private final Tarea6DragDropPage tarea6DragDropPage = new Tarea6DragDropPage();

    @When("El usuario selecciona la opcion drag")
    public void goToDragPage() {
        commonFlows.gotoDragDropPage();
    }

    @Then("Verificar los inputs de la pestaña drag")
    public void verifyPage() {
        tarea6DragDropPage.verifyPage();
    }

    @Then("Verificar mensaje final despues del armado de rompecabezas")
    public void verificarCongratsMessage() {
        tarea6DragDropPage.verifyCongratsMessage();
    }
}
